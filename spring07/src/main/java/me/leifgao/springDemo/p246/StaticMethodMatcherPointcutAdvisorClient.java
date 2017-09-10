package me.leifgao.springDemo.p246;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/11
 */
public class StaticMethodMatcherPointcutAdvisorClient {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("p246/beans.xml");
        Waiter waiterProxy = (Waiter) ctx.getBean("waiter");
        Seller sellerProxy = (Seller) ctx.getBean("seller");

        waiterProxy.greetTo("高");
        waiterProxy.serveTo("高");
        sellerProxy.greetTo("孔");
    }
}
