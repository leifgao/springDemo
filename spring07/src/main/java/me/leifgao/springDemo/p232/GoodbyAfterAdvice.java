package me.leifgao.springDemo.p232;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

/**
 * Created by leif on 2017/11/18
 */
public class GoodbyAfterAdvice implements AfterReturningAdvice{

    @Override
    public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
        String name = (String)args[0];
        System.out.println("good by" + name);
    }
}
