package me.leifgao.springDemo.p229;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by leif on 2017/9/10
 * Cglib实现的动态代理
 */
public class CglibProxy implements MethodInterceptor{

    private Enhancer enhancer = new Enhancer();

    public Object getProxy(Class clazz) {
        enhancer.setSuperclass(clazz);
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("CglibProxy 切入方法前...");
        Object result = methodProxy.invokeSuper(obj, args);
        System.out.println("CglibProxy 切入方法后...");
        return result;
    }
}
