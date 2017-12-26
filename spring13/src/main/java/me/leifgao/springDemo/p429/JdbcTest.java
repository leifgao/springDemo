package me.leifgao.springDemo.p429;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

/**
 * Created by leif on 2017/12/22
 */
public class JdbcTest {

    public static void main(String[] args) {
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/leif_test");
        ds.setUsername("root");
//        ds.setPassword("");

        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(ds);

        String sql = "create table t_user_two(user_id int primary key, user_name varchar(60))";
        jdbcTemplate.execute(sql);
    }
}
