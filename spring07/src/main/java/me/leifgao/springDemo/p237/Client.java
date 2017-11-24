package me.leifgao.springDemo.p237;

import me.leifgao.springDemo.p232.Waiter;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/11/25
 */
public class Client {

    public static void main(String[] args) {
        BeanFactory bf = new ClassPathXmlApplicationContext("p237/beans.xml");
        Waiter waiter = (Waiter) bf.getBean("waiter");

        waiter.greetTo("kong");
    }

}
