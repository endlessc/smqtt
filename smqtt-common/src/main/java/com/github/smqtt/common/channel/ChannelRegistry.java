package com.github.smqtt.common.channel;

import com.github.smqtt.common.spi.DynamicLoader;

/**
 * @author luxurong
 * @date 2021/3/30 13:35
 * @description
 */
public interface ChannelRegistry {


    ChannelRegistry INSTANCE = DynamicLoader.findFirst(ChannelRegistry.class).orElse(null);


}