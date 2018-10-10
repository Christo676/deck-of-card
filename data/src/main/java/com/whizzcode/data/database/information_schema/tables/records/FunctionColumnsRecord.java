/*
 * This file is generated by jOOQ.
*/
package com.whizzcode.data.database.information_schema.tables.records;


import com.whizzcode.data.database.information_schema.tables.FunctionColumns;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record17;
import org.jooq.Row17;
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
public class FunctionColumnsRecord extends TableRecordImpl<FunctionColumnsRecord> implements Record17<String, String, String, String, String, Integer, Integer, String, Integer, String, Integer, Short, Short, Short, Short, String, String> {

    private static final long serialVersionUID = 790208329;

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_CATALOG</code>.
     */
    public void setAliasCatalog(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_CATALOG</code>.
     */
    public String getAliasCatalog() {
        return (String) get(0);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_SCHEMA</code>.
     */
    public void setAliasSchema(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_SCHEMA</code>.
     */
    public String getAliasSchema() {
        return (String) get(1);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_NAME</code>.
     */
    public void setAliasName(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.ALIAS_NAME</code>.
     */
    public String getAliasName() {
        return (String) get(2);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_CLASS</code>.
     */
    public void setJavaClass(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_CLASS</code>.
     */
    public String getJavaClass() {
        return (String) get(3);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_METHOD</code>.
     */
    public void setJavaMethod(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.JAVA_METHOD</code>.
     */
    public String getJavaMethod() {
        return (String) get(4);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_COUNT</code>.
     */
    public void setColumnCount(Integer value) {
        set(5, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_COUNT</code>.
     */
    public Integer getColumnCount() {
        return (Integer) get(5);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.POS</code>.
     */
    public void setPos(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.POS</code>.
     */
    public Integer getPos() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_NAME</code>.
     */
    public void setColumnName(String value) {
        set(7, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_NAME</code>.
     */
    public String getColumnName() {
        return (String) get(7);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.DATA_TYPE</code>.
     */
    public void setDataType(Integer value) {
        set(8, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.DATA_TYPE</code>.
     */
    public Integer getDataType() {
        return (Integer) get(8);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.TYPE_NAME</code>.
     */
    public void setTypeName(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.TYPE_NAME</code>.
     */
    public String getTypeName() {
        return (String) get(9);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.PRECISION</code>.
     */
    public void setPrecision(Integer value) {
        set(10, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.PRECISION</code>.
     */
    public Integer getPrecision() {
        return (Integer) get(10);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.SCALE</code>.
     */
    public void setScale(Short value) {
        set(11, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.SCALE</code>.
     */
    public Short getScale() {
        return (Short) get(11);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.RADIX</code>.
     */
    public void setRadix(Short value) {
        set(12, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.RADIX</code>.
     */
    public Short getRadix() {
        return (Short) get(12);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.NULLABLE</code>.
     */
    public void setNullable(Short value) {
        set(13, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.NULLABLE</code>.
     */
    public Short getNullable() {
        return (Short) get(13);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_TYPE</code>.
     */
    public void setColumnType(Short value) {
        set(14, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_TYPE</code>.
     */
    public Short getColumnType() {
        return (Short) get(14);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.REMARKS</code>.
     */
    public void setRemarks(String value) {
        set(15, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.REMARKS</code>.
     */
    public String getRemarks() {
        return (String) get(15);
    }

    /**
     * Setter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_DEFAULT</code>.
     */
    public void setColumnDefault(String value) {
        set(16, value);
    }

    /**
     * Getter for <code>INFORMATION_SCHEMA.FUNCTION_COLUMNS.COLUMN_DEFAULT</code>.
     */
    public String getColumnDefault() {
        return (String) get(16);
    }

    // -------------------------------------------------------------------------
    // Record17 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, String, Integer, Integer, String, Integer, String, Integer, Short, Short, Short, Short, String, String> fieldsRow() {
        return (Row17) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row17<String, String, String, String, String, Integer, Integer, String, Integer, String, Integer, Short, Short, Short, Short, String, String> valuesRow() {
        return (Row17) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return FunctionColumns.FUNCTION_COLUMNS.ALIAS_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return FunctionColumns.FUNCTION_COLUMNS.ALIAS_SCHEMA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return FunctionColumns.FUNCTION_COLUMNS.ALIAS_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return FunctionColumns.FUNCTION_COLUMNS.JAVA_CLASS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return FunctionColumns.FUNCTION_COLUMNS.JAVA_METHOD;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field6() {
        return FunctionColumns.FUNCTION_COLUMNS.COLUMN_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return FunctionColumns.FUNCTION_COLUMNS.POS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field8() {
        return FunctionColumns.FUNCTION_COLUMNS.COLUMN_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field9() {
        return FunctionColumns.FUNCTION_COLUMNS.DATA_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return FunctionColumns.FUNCTION_COLUMNS.TYPE_NAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field11() {
        return FunctionColumns.FUNCTION_COLUMNS.PRECISION;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field12() {
        return FunctionColumns.FUNCTION_COLUMNS.SCALE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field13() {
        return FunctionColumns.FUNCTION_COLUMNS.RADIX;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field14() {
        return FunctionColumns.FUNCTION_COLUMNS.NULLABLE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Short> field15() {
        return FunctionColumns.FUNCTION_COLUMNS.COLUMN_TYPE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field16() {
        return FunctionColumns.FUNCTION_COLUMNS.REMARKS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field17() {
        return FunctionColumns.FUNCTION_COLUMNS.COLUMN_DEFAULT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getAliasCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getAliasSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getAliasName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getJavaClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getJavaMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component6() {
        return getColumnCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component8() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component9() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component11() {
        return getPrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component12() {
        return getScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component13() {
        return getRadix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component14() {
        return getNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short component15() {
        return getColumnType();
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
        return getColumnDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getAliasCatalog();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getAliasSchema();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getAliasName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getJavaClass();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getJavaMethod();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value6() {
        return getColumnCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getPos();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value8() {
        return getColumnName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value9() {
        return getDataType();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getTypeName();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value11() {
        return getPrecision();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value12() {
        return getScale();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value13() {
        return getRadix();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value14() {
        return getNullable();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Short value15() {
        return getColumnType();
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
        return getColumnDefault();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value1(String value) {
        setAliasCatalog(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value2(String value) {
        setAliasSchema(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value3(String value) {
        setAliasName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value4(String value) {
        setJavaClass(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value5(String value) {
        setJavaMethod(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value6(Integer value) {
        setColumnCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value7(Integer value) {
        setPos(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value8(String value) {
        setColumnName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value9(Integer value) {
        setDataType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value10(String value) {
        setTypeName(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value11(Integer value) {
        setPrecision(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value12(Short value) {
        setScale(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value13(Short value) {
        setRadix(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value14(Short value) {
        setNullable(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value15(Short value) {
        setColumnType(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value16(String value) {
        setRemarks(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord value17(String value) {
        setColumnDefault(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FunctionColumnsRecord values(String value1, String value2, String value3, String value4, String value5, Integer value6, Integer value7, String value8, Integer value9, String value10, Integer value11, Short value12, Short value13, Short value14, Short value15, String value16, String value17) {
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
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached FunctionColumnsRecord
     */
    public FunctionColumnsRecord() {
        super(FunctionColumns.FUNCTION_COLUMNS);
    }

    /**
     * Create a detached, initialised FunctionColumnsRecord
     */
    public FunctionColumnsRecord(String aliasCatalog, String aliasSchema, String aliasName, String javaClass, String javaMethod, Integer columnCount, Integer pos, String columnName, Integer dataType, String typeName, Integer precision, Short scale, Short radix, Short nullable, Short columnType, String remarks, String columnDefault) {
        super(FunctionColumns.FUNCTION_COLUMNS);

        set(0, aliasCatalog);
        set(1, aliasSchema);
        set(2, aliasName);
        set(3, javaClass);
        set(4, javaMethod);
        set(5, columnCount);
        set(6, pos);
        set(7, columnName);
        set(8, dataType);
        set(9, typeName);
        set(10, precision);
        set(11, scale);
        set(12, radix);
        set(13, nullable);
        set(14, columnType);
        set(15, remarks);
        set(16, columnDefault);
    }
}
