package me.leifgao.springDemo.p275;

import me.leifgao.springDemo.p232.NaiveWatier;
import me.leifgao.springDemo.p232.Waiter;
import org.springframework.aop.aspectj.annotation.AspectJProxyFactory;

/**
 * Created by leif on 2017/11/27
 */
public class Client {


    public static void main(String[] args) {
        Waiter waiterTarget = new NaiveWatier();
        AspectJProxyFactory aspectJProxyFactory = new AspectJProxyFactory();

        aspectJProxyFactory.setTarget(waiterTarget);
        aspectJProxyFactory.addAspect(PreGreetingAspect.class);

        Waiter waiterProxy = aspectJProxyFactory.getProxy();
        waiterProxy.greetTo("gao");
        waiterProxy.serveTo("kong");

    }
}
