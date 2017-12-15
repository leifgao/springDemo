package me.leifgao.springDemo.p275;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * Created by leif on 2017/11/27
 */
@Aspect
public class PreGreetingAspect {

    //方法名匹配 execution()
    @Before(value = "execution(* greetTo(..))")
    public void executionTest() {
        System.out.println("方法名匹配 : 你好");
    }

    //方法注解类型匹配 @annotation
    @Before("@annotation(me.leifgao.springDemo.p275.leif)")
    public void annotationTest() {
        System.out.println("方法注解类型匹配 : 你好");
    }

    //方法入参类型匹配 args
    @Before("args(me.leifgao.springDemo.p275.Waiter)")
    public void argsTest() {
        System.out.println("方法入参类型切点 : 你好");
    }
}
