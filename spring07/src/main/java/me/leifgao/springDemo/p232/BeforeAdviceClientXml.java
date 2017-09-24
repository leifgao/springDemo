package me.leifgao.springDemo.p232;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/15
 */
public class BeforeAdviceClientXml {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("p232/beans.xml");
        Waiter waiterProxy = (Waiter) applicationContext.getBean("waiter");
        waiterProxy.serveTo("dd");
        waiterProxy.greetTo("gg");
    }
}
