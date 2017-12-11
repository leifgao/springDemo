package me.leifgao.springDemo.p275;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Created by leif on 2017/11/27
 */
@Aspect
public class PreGreetingAspect {

    //方法模式匹配
    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("方法模式匹配 : 你好");
    }

    //方法注解类名
    @Before("@annotation(me.leifgao.springDemo.p275.leif)")
    public void annotationTest() {
        System.out.println("特定注解匹配 : 你好");
    }

    //类名
    @Before("args(me.leifgao.springDemo.p275.Waiter)")
    public void argsTest() {
        System.out.println("方法入参类型切点");
    }
}
