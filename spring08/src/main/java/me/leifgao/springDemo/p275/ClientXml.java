package me.leifgao.springDemo.p275;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/11/27
 */
public class ClientXml {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("p275/beans.xml");
        Waiter waiterProxy = (Waiter) beanFactory.getBean("waiterTarget");
        waiterProxy.serveTo("gao");
        waiterProxy.greetTo("gao");
        waiterProxy.argsTest(null);
    }
}
