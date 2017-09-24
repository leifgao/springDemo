package me.leifgao.springDemo.p235;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by leif on 2017/9/22
 */
public class GreetingAfterAdvice implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        System.out.println("please enjoy yourself!");
    }
}
