package me.leifgao.springDemo.p496;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/12/26
 */
public class ClientXml {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("p496/beans.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");

        userService.getUserById("111");
        userService.getUserById("111");
    }
}
