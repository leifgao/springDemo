package me.leifgao.springDemo.p238;

import java.sql.SQLException;

/**
 * Created by leif on 2017/11/25
 */
public class ForumService {

    public void removeForum(int forumId) {
        throw new RuntimeException("运行异常");
    }

    public void updateForum(String forumContent) throws Exception {
        throw new SQLException("数据库更新操作异常");
    }
}
