package me.leifgao.springDemo.p232;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by leif on 2017/9/10
 */
public class GreetingBeforeAdvice implements MethodBeforeAdvice{

    @Override
    public void before(Method method, Object[] args, Object o) throws Throwable {
        String clientName = (String) args[0];
        System.out.println("how are you ! " + clientName);
    }
}
