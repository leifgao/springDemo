package me.leifgao.springDemo.p158;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by leif on 2017/9/4
 */
@Component
public class AodiCar implements TestCar{
    @Override
    public void info() {
        System.out.println("aodi");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("this is aodi postConstruct");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("this is aodi preDestroy");
    }
}
