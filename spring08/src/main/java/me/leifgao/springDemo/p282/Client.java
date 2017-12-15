package me.leifgao.springDemo.p282;

import me.leifgao.springDemo.p275.Waiter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/12/15
 */
public class Client {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("p282/beans.xml");
        Waiter waiterProxy = (Waiter) beanFactory.getBean("waiterTarget");

        waiterProxy.serveTo("gao");
        Seller sellerProxy = (Seller) waiterProxy;
        sellerProxy.sell("laptop");
    }
}
