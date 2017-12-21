package me.leifgao.springDemo.p394;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by leif on 2017/12/21
 */
@Service
public class UserJdbcWithoutTransManagerService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void addScore(String userName, int toAdd) {
        String sql = "UPDATE t_user u SET u.score = u.score + ? WHERE user_name = ?";
        jdbcTemplate.update(sql,toAdd,userName);
    }

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("p394/beans.xml");
        UserJdbcWithoutTransManagerService userJdbcWithoutTransManagerService = (UserJdbcWithoutTransManagerService) ctx.getBean("userJdbcWithoutTransManagerService");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ctx.getBean("jdbcTemplate");
        BasicDataSource basicDataSource = (BasicDataSource) jdbcTemplate.getDataSource();

        System.out.println(basicDataSource.getDefaultAutoCommit());

        jdbcTemplate.execute("INSERT INTO t_user(user_name,password,score,last_logon_time) VALUES('tom','123456',10,"+System.currentTimeMillis()+")");
        //调用工作在无事务环境下的服务类方法,将分数添加20分
        userJdbcWithoutTransManagerService.addScore("tom",20);
        //查看此时用户的分数
        int score = jdbcTemplate.queryForObject("SELECT score FROM t_user WHERE user_name ='tom'", Integer.class);
        System.out.println("score:"+score);
        jdbcTemplate.execute("DELETE FROM t_user WHERE user_name='tom'");
    }
}
