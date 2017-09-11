package me.leifgao.springDemo.p251;

import me.leifgao.springDemo.p246.Seller;
import me.leifgao.springDemo.p246.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/11
 */
public class DynamicAdvisorClient {

    //实现动态切面
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("p251/beans.xml");
        Waiter waiterProxy = (Waiter) applicationContext.getBean("waiter");
        Seller sellerProxy =(Seller) applicationContext.getBean("seller");

        waiterProxy.greetTo("第一次");
        waiterProxy.greetTo("pg-one");
        waiterProxy.greetTo("第三次");
        sellerProxy.greetTo("pg-one");
        sellerProxy.greetTo("第二次");

    }
}
