package me.leifgao.springDemo.p158;

import org.springframework.stereotype.Component;

/**
 * Created by leif on 2017/9/4
 */
@Component
public class hOngqiCar implements TestCar{
    @Override
    public void info() {
        System.out.println("hongqi");
    }
}
