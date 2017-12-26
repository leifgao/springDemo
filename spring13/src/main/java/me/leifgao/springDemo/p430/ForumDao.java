package me.leifgao.springDemo.p430;

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

    public void initDb() {

        String sql = "";
        jdbcTemplate.execute(sql);
    }


}
