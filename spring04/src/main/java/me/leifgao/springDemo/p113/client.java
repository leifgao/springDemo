package me.leifgao.springDemo.p113;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/3
 */
public class client {
    public static void main(String[] args) {

        //统计容器共有多少个bean,且分别打印出bean的名字
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:beans.xml");

    }
}
