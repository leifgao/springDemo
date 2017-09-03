package me.leifgao.springDemo.p97;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.annotations.Test;

/**
 * Created by leif on 2017/9/3
 */
public class AnnotationApplicationContextTest {

    @Test
    public void getBean() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Beans.class);
        Car car = ctx.getBean("car", Car.class);
        System.out.println(car);
    }

}
