package me.leifgao.springDemo.p232;

import org.springframework.aop.BeforeAdvice;
import org.springframework.aop.framework.ProxyFactory;

/**
 * Created by leif on 2017/9/10
 */
public class BeforeAdviceClient {

    //前置增强Demo
    public static void main(String[] args) {
        Waiter waiterTarget = new NaiveWatier();
        BeforeAdvice beforeAdvice = new GreetingBeforeAdvice();

        ProxyFactory proxyFactory = new ProxyFactory();
        proxyFactory.setTarget(waiterTarget);
        proxyFactory.addAdvice(beforeAdvice);

        Waiter proxy = (Waiter) proxyFactory.getProxy();
        proxy.greetTo("高");
        proxy.serveTo("孔");
    }
}
