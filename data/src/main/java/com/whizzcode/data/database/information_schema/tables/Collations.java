/*
 * This file is generated by jOOQ.
*/
package com.whizzcode.data.database.information_schema.tables;


import com.whizzcode.data.database.information_schema.InformationSchema;
import com.whizzcode.data.database.information_schema.tables.records.CollationsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.8"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Collations extends TableImpl<CollationsRecord> {

    private static final long serialVersionUID = 482985507;

    /**
     * The reference instance of <code>INFORMATION_SCHEMA.COLLATIONS</code>
     */
    public static final Collations COLLATIONS = new Collations();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<CollationsRecord> getRecordType() {
        return CollationsRecord.class;
    }

    /**
     * The column <code>INFORMATION_SCHEMA.COLLATIONS.NAME</code>.
     */
    public final TableField<CollationsRecord, String> NAME = createField("NAME", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * The column <code>INFORMATION_SCHEMA.COLLATIONS.KEY</code>.
     */
    public final TableField<CollationsRecord, String> KEY = createField("KEY", org.jooq.impl.SQLDataType.VARCHAR(2147483647), this, "");

    /**
     * Create a <code>INFORMATION_SCHEMA.COLLATIONS</code> table reference
     */
    public Collations() {
        this(DSL.name("COLLATIONS"), null);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.COLLATIONS</code> table reference
     */
    public Collations(String alias) {
        this(DSL.name(alias), COLLATIONS);
    }

    /**
     * Create an aliased <code>INFORMATION_SCHEMA.COLLATIONS</code> table reference
     */
    public Collations(Name alias) {
        this(alias, COLLATIONS);
    }

    private Collations(Name alias, Table<CollationsRecord> aliased) {
        this(alias, aliased, null);
    }

    private Collations(Name alias, Table<CollationsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return InformationSchema.INFORMATION_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collations as(String alias) {
        return new Collations(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collations as(Name alias) {
        return new Collations(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public Collations rename(String name) {
        return new Collations(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public Collations rename(Name name) {
        return new Collations(name, null);
    }
}
