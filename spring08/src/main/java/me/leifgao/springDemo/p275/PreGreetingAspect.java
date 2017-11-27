package me.leifgao.springDemo.p275;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by leif on 2017/11/27
 */

@Aspect
public class PreGreetingAspect {

    @Before("execution(* greetTo(..))")
    public void beforeGreeting() {
        System.out.println("你好");
    }
}
