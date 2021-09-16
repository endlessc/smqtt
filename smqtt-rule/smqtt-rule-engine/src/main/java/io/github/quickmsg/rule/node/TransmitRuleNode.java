package io.github.quickmsg.rule.node;

import io.github.quickmsg.common.message.HeapMqttMessage;
import io.github.quickmsg.common.rule.source.Source;
import io.github.quickmsg.common.utils.JacksonUtil;
import io.github.quickmsg.rule.RuleNode;
import io.github.quickmsg.source.SourceManager;
import reactor.util.context.ContextView;

import java.util.Map;
import java.util.Optional;

/**
 * 转发节点
 *
 * @author luxurong
 */
public class TransmitRuleNode implements RuleNode {

    private final Source source;

    private final String script;

    private RuleNode ruleNode;


    public TransmitRuleNode(Source source, String script) {
        this.source = source;
        this.script = script;
    }

    @Override
    public void execute(ContextView contextView) {
        HeapMqttMessage heapMqttMessage = contextView.get(HeapMqttMessage.class);
        Map<String, Object> param = Optional.ofNullable(script)
                .map(spt -> JacksonUtil.json2Bean(triggerTemplate(spt, context -> {
                            heapMqttMessage.getKeyMap().forEach((key, value) -> {
                                context.set(key, value instanceof String ? String.format("\"" + "%s" + "\"", value) : value);
                            });
                        }).toString(), Map.class)
                )
                .orElseGet(() -> heapMqttMessage.getKeyMap());
        SourceManager.getSourceBean(source).transmit(param);
        executeNext(contextView);
    }

    @Override
    public RuleNode getNextRuleNode() {
        return this.ruleNode;
    }


    @Override
    public void setNextRuleNode(RuleNode ruleNode) {
        this.ruleNode = ruleNode;
    }

}
