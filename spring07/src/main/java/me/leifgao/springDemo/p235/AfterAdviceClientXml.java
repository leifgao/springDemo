package me.leifgao.springDemo.p235;

import me.leifgao.springDemo.p232.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/22
 */
public class AfterAdviceClientXml {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("p235/beans.xml");
        Waiter waiterProxy = (Waiter) context.getBean("waiter");

        waiterProxy.greetTo("Gao");
    }

}
