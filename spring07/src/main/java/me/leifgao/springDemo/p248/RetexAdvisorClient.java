package me.leifgao.springDemo.p248;

import me.leifgao.springDemo.p246.Seller;
import me.leifgao.springDemo.p246.Waiter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/9/11
 */
public class RetexAdvisorClient {

    //静态正则方法匹配切面
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("p248/beans.xml");

        Waiter waiterProxy = (Waiter) applicationContext.getBean("waiter");
        Seller sellerProxy = (Seller) applicationContext.getBean("seller");

        waiterProxy.greetTo("ll");
        waiterProxy.serveTo("11");
        waiterProxy.dxxgreetTo("dd");
        sellerProxy.greetTo("seller");

    }
}
