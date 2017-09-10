package me.leifgao.springDemo.p225;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by leif on 2017/9/10
 */
public class ForumHandler implements InvocationHandler{

    private Object target;

    public ForumHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("代理类切入方法前...");
        Object obj = method.invoke(target, args);
        System.out.println("代理类切入方法后...");
        return obj;
    }
}
