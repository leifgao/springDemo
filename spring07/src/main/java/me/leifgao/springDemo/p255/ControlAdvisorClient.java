package me.leifgao.springDemo.p255;

import me.leifgao.springDemo.p246.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/11
 * 流程切面客户端
 */
public class ControlAdvisorClient {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("p255/beans.xml");
        Waiter waiterProxy = (Waiter) applicationContext.getBean("waiter");

        WaiterDelegate waiterDelegate = new WaiterDelegate();
        waiterDelegate.setWaiter(waiterProxy);

        waiterProxy.serveTo("pg");
        waiterProxy.greetTo("pg");

        waiterDelegate.service("pg");
    }
}
