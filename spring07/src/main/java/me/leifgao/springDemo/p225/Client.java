package me.leifgao.springDemo.p225;

import java.lang.reflect.Proxy;

/**
 * Created by leif on 2017/9/10
 */
public class Client {
    //实现动态代理，织入增强代码
    public static void main(String[] args) {

        ForumService forumServiceTarget = new ForumServiceImpl();
        ForumHandler forumHandler = new ForumHandler(forumServiceTarget);

        ForumService forumServiceProxy = (ForumService) Proxy.newProxyInstance(forumServiceTarget.getClass().getClassLoader(), forumServiceTarget.getClass().getInterfaces(), forumHandler);
        forumServiceProxy.removeTopic(10);
        forumServiceProxy.removeForum(10);

    }
}
