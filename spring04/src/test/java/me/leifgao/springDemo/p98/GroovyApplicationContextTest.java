package me.leifgao.springDemo.p98;

import me.leifgao.springDemo.p97.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericGroovyApplicationContext;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by leif on 2017/9/3
 */
public class GroovyApplicationContextTest {

    @Test
    public void getBean() {
        ApplicationContext ctx = new GenericGroovyApplicationContext("classpath:me/leifgao/springDemo/p98/groovy-beans.groovy");
        Car car = (Car) ctx.getBean("car");
        System.out.println(car);
//        Assert.assertNotNull();
    }
}
