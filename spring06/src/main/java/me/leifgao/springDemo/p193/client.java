package me.leifgao.springDemo.p193;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/9
 */
public class client {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:p193/beans.xml");
        BasicDataSource basicDataSource = (BasicDataSource) applicationContext.getBean("dataSource");
        System.out.println(basicDataSource.getUrl());
        System.out.println(basicDataSource.getUsername());
        System.out.println(basicDataSource.getPassword());
        System.out.println(basicDataSource.getDriverClassName());
    }

}
