package me.leifgao.springDemo.p158;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * Created by leif on 2017/9/4
 */
@Service
public class LogonService {

    @Autowired
    private Map<String, TestCar> testCar;


    /**
     * spring注解会自动加上名字，@Autowired是按照类型装配的，
     * @param args
     */
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        LogonService logonService = (LogonService) applicationContext.getBean("logonService");
        System.out.println("ddd");
    }
}
