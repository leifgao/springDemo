package me.leifgao.springDemo.p238;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by leif on 2017/11/25
 */
public class Client {

    public static void main(String[] args) throws Exception{
        BeanFactory beanFactory = new ClassPathXmlApplicationContext("p238/beans.xml");
        ForumService forumService = (ForumService) beanFactory.getBean("forumService");
//        forumService.removeForum(1);
        forumService.updateForum("1");
    }
}
