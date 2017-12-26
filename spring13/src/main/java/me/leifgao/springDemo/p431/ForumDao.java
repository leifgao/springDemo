package me.leifgao.springDemo.p431;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by leif on 2017/12/22
 */
@Repository
public class ForumDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addForum(Forum forum) {
        String sql = "INSERT INTO t_forum(forum_name, forum_desc) VALUES(?,?)";
        Object[] params = new Object[]{forum.getForumName(), forum.getForumDesc()};
        jdbcTemplate.update(sql, params);
    }



}
