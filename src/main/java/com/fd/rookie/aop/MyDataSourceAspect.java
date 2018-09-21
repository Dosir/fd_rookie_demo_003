package com.fd.rookie.aop;

import com.fd.rookie.PO.DataSourceType;
import com.fd.rookie.annotation.DataSource;
import com.fd.rookie.utils.DataSourceContextHolder;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.Ordered;
import org.springframework.core.PriorityOrdered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * 选择数据源的切面类
 */
@Aspect
@Component
public class MyDataSourceAspect{

    @Around("@annotation(com.fd.rookie.annotation.DataSource) && @annotation(dataSource)")
    public Object setDataSource(ProceedingJoinPoint joinPoint, DataSource dataSource) throws Throwable {
        DataSourceType dataSourceType = dataSource.value();
        try {
            DataSourceContextHolder.setDataSourceType(dataSourceType.getValue());
            System.out.println("DataSourceType[" + dataSourceType.getValue() + "] set.");
            return joinPoint.proceed();
        } finally {
            DataSourceContextHolder.clearDataSourceType();
            System.out.println("DataSourceType[" + dataSourceType.getValue() + "] remove.");
        }
    }

}
