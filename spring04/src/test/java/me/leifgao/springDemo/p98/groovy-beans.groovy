package me.leifgao.springDemo.p98

import me.leifgao.springDemo.p97.Car

/**
 * Created by leif on 2017/9/3
 */

beans {
    car(Car) {
        brand = "奥迪"
        maxSpeed = "200"
        color = "red"
    }
}