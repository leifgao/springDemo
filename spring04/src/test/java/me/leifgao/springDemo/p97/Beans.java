package me.leifgao.springDemo.p97;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by leif on 2017/9/3
 */
@Configuration
public class Beans {

    @Bean(name = "car")
    public Car ddd() {
        Car car = new Car();
        car.setBrand("红旗");
        car.setMaxSpeed(200);
        return car;
    }
}
