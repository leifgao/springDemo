package me.leifgao.springDemo.p237;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by leif on 2017/11/24
 */
public class GreetingAroundInterceptor implements MethodInterceptor {

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {

        Object[] args = methodInvocation.getArguments();
        String clientName = (String) args[0];
        System.out.println("how are you " + clientName);
        Object obj = methodInvocation.proceed();
        System.out.println("enjoy yourself " + clientName);
        return obj;
    }
}
