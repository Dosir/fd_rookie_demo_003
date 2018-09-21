package com.fd.rookie.PO;

/**
 * 数据源类型的枚举类
 */
public enum DataSourceType {
    ROOKIE("rookie"), LBS("lbs");

    private String value;

    public String getValue() {
        return value;
    }

    DataSourceType(String value) {
        this.value = value;
    }
}
