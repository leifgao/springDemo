package me.leifgao.springDemo.p229;

import me.leifgao.springDemo.p225.ForumServiceImpl;

/**
 * Created by leif on 2017/9/10
 */
public class Client {

    //通过Cglib实现动态代理
    public static void main(String[] args) {
        CglibProxy proxy = new CglibProxy();
        ForumServiceImpl forumService = (ForumServiceImpl) proxy.getProxy(ForumServiceImpl.class);
        forumService.removeForum(10);
        forumService.removeTopic(10);
    }
}
