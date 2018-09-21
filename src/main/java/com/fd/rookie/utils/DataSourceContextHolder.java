package com.fd.rookie.utils;

/**
 * 设置当前线程的变量的工具类，用于设置对应的数据源名称
 */
public class DataSourceContextHolder {
    private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();
    /**
     *  设置数据源类型
     * @param dataSourceType  数据库类型
     *
     */
    public static void setDataSourceType(String dataSourceType) {
        contextHolder.set(dataSourceType);
    }

    /**
     *  获取数据源类型
     * @return String
     */
    public static String getDataSourceType() {
        return contextHolder.get();
    }

    /**
     *  清除数据源类型
     */
    public static void clearDataSourceType() {
        contextHolder.remove();
    }
}
