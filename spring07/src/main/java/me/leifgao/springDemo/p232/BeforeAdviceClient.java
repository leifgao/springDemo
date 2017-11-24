package me.leifgao.springDemo.p232;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by leif on 2017/9/10
 */
public class BeforeAdviceClient {

    //前置增强Demo
    public static void main(String[] args) {
        Waiter waiterTarget = new NaiveWatier();
        BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();
        AfterReturningAdvice goodbyAfterReturningAdvice = new GoodbyAfterAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(waiterTarget);
        proxyFactory.addAdvice(beforeAdvice);
        proxyFactory.addAdvice(goodbyAfterReturningAdvice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.greetTo("高");
        proxy.serveTo("孔");
    }

}
