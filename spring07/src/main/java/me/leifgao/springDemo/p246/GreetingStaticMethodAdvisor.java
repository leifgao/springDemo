package me.leifgao.springDemo.p246;

import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.StaticMethodMatcherPointcutAdvisor;

import java.lang.reflect.Method;

/**
 * Created by leif on 2017/9/11
 * 切面继承了切点，所以切面类里可以定义切点的方法名和类型匹配方法
 */
public class GreetingStaticMethodAdvisor extends StaticMethodMatcherPointcutAdvisor{


    //方法名匹配
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        return "greetTo".equals(method.getName());
    }

    //类匹配
    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }
}
