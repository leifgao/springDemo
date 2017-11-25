package me.leifgao.springDemo.p240;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/11/25
 */
public class Client {

    public static void main(String[] args) {
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("p240/beans.xml");
        OpenAccountService openAccountService = (OpenAccountService) beanFactory.getBean("openAccountService");

        openAccountService.openAccount();

        //开启性能监控
        Monitorable monitorable = (Monitorable) openAccountService;
        monitorable.setMonitorActive(true);
        openAccountService.openAccount();

    }

}
