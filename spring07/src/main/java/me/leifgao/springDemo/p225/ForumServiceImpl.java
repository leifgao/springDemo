package me.leifgao.springDemo.p225;

/**
 * Created by leif on 2017/9/10
 */
public class ForumServiceImpl implements ForumService{

    @Override
    public void removeTopic(int topicId) {
        System.out.println("业务:移除话题...");
    }

    @Override
    public void removeForum(int forumId) {
        System.out.println("业务:移除论坛...");
    }
}
