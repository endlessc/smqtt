/*
 * This file is generated by jOOQ.
 */
package io.github.quickmsg.persistent.tables.tables.records;


import io.github.quickmsg.persistent.tables.tables.Databasechangeloglock;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record4;
import org.jooq.Row4;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class DatabasechangeloglockRecord extends UpdatableRecordImpl<DatabasechangeloglockRecord> implements Record4<Integer, Boolean, LocalDateTime, String> {

    private static final long serialVersionUID = 1L;


    public void setId(Integer value) {
        set(0, value);
    }


    public Integer getId() {
        return (Integer) get(0);
    }


    public void setLocked(Boolean value) {
        set(1, value);
    }


    public Boolean getLocked() {
        return (Boolean) get(1);
    }


    public void setLockgranted(LocalDateTime value) {
        set(2, value);
    }


    public LocalDateTime getLockgranted() {
        return (LocalDateTime) get(2);
    }


    public void setLockedby(String value) {
        set(3, value);
    }


    public String getLockedby() {
        return (String) get(3);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record4 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row4<Integer, Boolean, LocalDateTime, String> fieldsRow() {
        return (Row4) super.fieldsRow();
    }

    @Override
    public Row4<Integer, Boolean, LocalDateTime, String> valuesRow() {
        return (Row4) super.valuesRow();
    }

    @Override
    public Field<Integer> field1() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.ID;
    }

    @Override
    public Field<Boolean> field2() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKED;
    }

    @Override
    public Field<LocalDateTime> field3() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKGRANTED;
    }

    @Override
    public Field<String> field4() {
        return Databasechangeloglock.DATABASECHANGELOGLOCK.LOCKEDBY;
    }

    @Override
    public Integer component1() {
        return getId();
    }

    @Override
    public Boolean component2() {
        return getLocked();
    }

    @Override
    public LocalDateTime component3() {
        return getLockgranted();
    }

    @Override
    public String component4() {
        return getLockedby();
    }

    @Override
    public Integer value1() {
        return getId();
    }

    @Override
    public Boolean value2() {
        return getLocked();
    }

    @Override
    public LocalDateTime value3() {
        return getLockgranted();
    }

    @Override
    public String value4() {
        return getLockedby();
    }

    @Override
    public DatabasechangeloglockRecord value1(Integer value) {
        setId(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord value2(Boolean value) {
        setLocked(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord value3(LocalDateTime value) {
        setLockgranted(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord value4(String value) {
        setLockedby(value);
        return this;
    }

    @Override
    public DatabasechangeloglockRecord values(Integer value1, Boolean value2, LocalDateTime value3, String value4) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------


    public DatabasechangeloglockRecord() {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);
    }


    public DatabasechangeloglockRecord(Integer id, Boolean locked, LocalDateTime lockgranted, String lockedby) {
        super(Databasechangeloglock.DATABASECHANGELOGLOCK);

        setId(id);
        setLocked(locked);
        setLockgranted(lockgranted);
        setLockedby(lockedby);
    }
}