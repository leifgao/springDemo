package me.leifgao.springDemo.p113;

import lombok.Data;
import lombok.ToString;
import org.springframework.beans.factory.BeanFactory;

/**
 * Created by leif on 2017/9/3
 */
@Data
@ToString
public class Car {
    private String brand;
    private String color;
    private int maxSpeed;
    private String name;
    private BeanFactory beanFactory;
    private String beanName;
}
