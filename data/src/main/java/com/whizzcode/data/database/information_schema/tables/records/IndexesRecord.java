/*
 * This file is generated by jOOQ.
*/
package com.whizzcode.data.database.information_schema.tables.records;


import com.whizzcode.data.database.information_schema.tables.Indexes;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record22;
import org.jooq.Row22;
import org.jooq.impl.TableRecordImpl;


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
public class IndexesRecord extends TableRecordImpl<IndexesRecord> implements Record22<String, String, String, Boolean, String, Short, String, Integer, Boolean, String, Boolean, Short, String, Integer, String, String, String, Integer, Integer, String, String, Boolean> {

    private static final long serialVersionUID = 831684659;

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_CATALOG</code>.
     */
    public void setTableCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_CATALOG</code>.
     */
    public String getTableCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_SCHEMA</code>.
     */
    public void setTableSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_SCHEMA</code>.
     */
    public String getTableSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_NAME</code>.
     */
    public void setTableName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.TABLE_NAME</code>.
     */
    public String getTableName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.NON_UNIQUE</code>.
     */
    public void setNonUnique(Boolean value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.NON_UNIQUE</code>.
     */
    public Boolean getNonUnique() {
        return (Boolean) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_NAME</code>.
     */
    public void setIndexName(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_NAME</code>.
     */
    public String getIndexName() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.ORDINAL_POSITION</code>.
     */
    public void setOrdinalPosition(Short value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.ORDINAL_POSITION</code>.
     */
    public Short getOrdinalPosition() {
        return (Short) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.CARDINALITY</code>.
     */
    public void setCardinality(Integer value) {
        set(7, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.CARDINALITY</code>.
     */
    public Integer getCardinality() {
        return (Integer) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.PRIMARY_KEY</code>.
     */
    public void setPrimaryKey_(Boolean value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.PRIMARY_KEY</code>.
     */
    public Boolean getPrimaryKey_() {
        return (Boolean) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE_NAME</code>.
     */
    public void setIndexTypeName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE_NAME</code>.
     */
    public String getIndexTypeName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.IS_GENERATED</code>.
     */
    public void setIsGenerated(Boolean value) {
        set(10, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.IS_GENERATED</code>.
     */
    public Boolean getIsGenerated() {
        return (Boolean) get(10);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE</code>.
     */
    public void setIndexType(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_TYPE</code>.
     */
    public Short getIndexType() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.ASC_OR_DESC</code>.
     */
    public void setAscOrDesc(String value) {
        set(12, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.ASC_OR_DESC</code>.
     */
    public String getAscOrDesc() {
        return (String) get(12);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.PAGES</code>.
     */
    public void setPages(Integer value) {
        set(13, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.PAGES</code>.
     */
    public Integer getPages() {
        return (Integer) get(13);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.FILTER_CONDITION</code>.
     */
    public void setFilterCondition(String value) {
        set(14, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.FILTER_CONDITION</code>.
     */
    public String getFilterCondition() {
        return (String) get(14);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.REMARKS</code>.
     */
    public void setRemarks(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(15);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.SQL</code>.
     */
    public void setSql(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.SQL</code>.
     */
    public String getSql() {
        return (String) get(16);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.ID</code>.
     */
    public void setId(Integer value) {
        set(17, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.ID</code>.
     */
    public Integer getId() {
        return (Integer) get(17);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.SORT_TYPE</code>.
     */
    public void setSortType(Integer value) {
        set(18, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.SORT_TYPE</code>.
     */
    public Integer getSortType() {
        return (Integer) get(18);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.CONSTRAINT_NAME</code>.
     */
    public void setConstraintName(String value) {
        set(19, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.CONSTRAINT_NAME</code>.
     */
    public String getConstraintName() {
        return (String) get(19);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_CLASS</code>.
     */
    public void setIndexClass(String value) {
        set(20, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.INDEX_CLASS</code>.
     */
    public String getIndexClass() {
        return (String) get(20);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.INDEXES.AFFINITY</code>.
     */
    public void setAffinity(Boolean value) {
        set(21, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.INDEXES.AFFINITY</code>.
     */
    public Boolean getAffinity() {
        return (Boolean) get(21);
    }

    // -------------------------------------------------------------------------
    // Record22 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, Boolean, String, Short, String, Integer, Boolean, String, Boolean, Short, String, Integer, String, String, String, Integer, Integer, String, String, Boolean> fieldsRow() {
        return (Row22) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row22<String, String, String, Boolean, String, Short, String, Integer, Boolean, String, Boolean, Short, String, Integer, String, String, String, Integer, Integer, String, String, Boolean> valuesRow() {
        return (Row22) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return Indexes.INDEXES.TABLE_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return Indexes.INDEXES.TABLE_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return Indexes.INDEXES.TABLE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field4() {
        return Indexes.INDEXES.NON_UNIQUE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return Indexes.INDEXES.INDEX_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field6() {
        return Indexes.INDEXES.ORDINAL_POSITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return Indexes.INDEXES.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field8() {
        return Indexes.INDEXES.CARDINALITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field9() {
        return Indexes.INDEXES.PRIMARY_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return Indexes.INDEXES.INDEX_TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field11() {
        return Indexes.INDEXES.IS_GENERATED;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return Indexes.INDEXES.INDEX_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field13() {
        return Indexes.INDEXES.ASC_OR_DESC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field14() {
        return Indexes.INDEXES.PAGES;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field15() {
        return Indexes.INDEXES.FILTER_CONDITION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return Indexes.INDEXES.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return Indexes.INDEXES.SQL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field18() {
        return Indexes.INDEXES.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field19() {
        return Indexes.INDEXES.SORT_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field20() {
        return Indexes.INDEXES.CONSTRAINT_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field21() {
        return Indexes.INDEXES.INDEX_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Boolean> field22() {
        return Indexes.INDEXES.AFFINITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component4() {
        return getNonUnique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component6() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component8() {
        return getCardinality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component9() {
        return getPrimaryKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getIndexTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component11() {
        return getIsGenerated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getIndexType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component13() {
        return getAscOrDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component14() {
        return getPages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component15() {
        return getFilterCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component16() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component17() {
        return getSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component18() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component19() {
        return getSortType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component20() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component21() {
        return getIndexClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean component22() {
        return getAffinity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getTableCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getTableSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getTableName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value4() {
        return getNonUnique();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getIndexName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value6() {
        return getOrdinalPosition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value8() {
        return getCardinality();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value9() {
        return getPrimaryKey_();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getIndexTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value11() {
        return getIsGenerated();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getIndexType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value13() {
        return getAscOrDesc();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value14() {
        return getPages();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value15() {
        return getFilterCondition();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value16() {
        return getRemarks();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value17() {
        return getSql();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value18() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value19() {
        return getSortType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value20() {
        return getConstraintName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value21() {
        return getIndexClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Boolean value22() {
        return getAffinity();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value1(String value) {
        setTableCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value2(String value) {
        setTableSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value3(String value) {
        setTableName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value4(Boolean value) {
        setNonUnique(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value5(String value) {
        setIndexName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value6(Short value) {
        setOrdinalPosition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value7(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value8(Integer value) {
        setCardinality(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value9(Boolean value) {
        setPrimaryKey_(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value10(String value) {
        setIndexTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value11(Boolean value) {
        setIsGenerated(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value12(Short value) {
        setIndexType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value13(String value) {
        setAscOrDesc(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value14(Integer value) {
        setPages(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value15(String value) {
        setFilterCondition(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value16(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value17(String value) {
        setSql(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value18(Integer value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value19(Integer value) {
        setSortType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value20(String value) {
        setConstraintName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value21(String value) {
        setIndexClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord value22(Boolean value) {
        setAffinity(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public IndexesRecord values(String value1, String value2, String value3, Boolean value4, String value5, Short value6, String value7, Integer value8, Boolean value9, String value10, Boolean value11, Short value12, String value13, Integer value14, String value15, String value16, String value17, Integer value18, Integer value19, String value20, String value21, Boolean value22) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        value19(value19);
        value20(value20);
        value21(value21);
        value22(value22);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached IndexesRecord
     */
    public IndexesRecord() {
        super(Indexes.INDEXES);
    }

    /**
     * Create a detached, initialised IndexesRecord
     */
    public IndexesRecord(String tableCatalog, String tableSchema, String tableName, Boolean nonUnique, String indexName, Short ordinalPosition, String columnName, Integer cardinality, Boolean primaryKey, String indexTypeName, Boolean isGenerated, Short indexType, String ascOrDesc, Integer pages, String filterCondition, String remarks, String sql, Integer id, Integer sortType, String constraintName, String indexClass, Boolean affinity) {
        super(Indexes.INDEXES);

        set(0, tableCatalog);
        set(1, tableSchema);
        set(2, tableName);
        set(3, nonUnique);
        set(4, indexName);
        set(5, ordinalPosition);
        set(6, columnName);
        set(7, cardinality);
        set(8, primaryKey);
        set(9, indexTypeName);
        set(10, isGenerated);
        set(11, indexType);
        set(12, ascOrDesc);
        set(13, pages);
        set(14, filterCondition);
        set(15, remarks);
        set(16, sql);
        set(17, id);
        set(18, sortType);
        set(19, constraintName);
        set(20, indexClass);
        set(21, affinity);
    }
}
