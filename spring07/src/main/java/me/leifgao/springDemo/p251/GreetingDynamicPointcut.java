package me.leifgao.springDemo.p251;

import me.leifgao.springDemo.p246.Waiter;
import org.springframework.aop.ClassFilter;
import org.springframework.aop.support.DynamicMethodMatcherPointcut;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by leif on 2017/9/11
 */
public class GreetingDynamicPointcut extends DynamicMethodMatcherPointcut{

    private static List<String> whiteList = new ArrayList<>();
    static {
        whiteList.add("john");
        whiteList.add("pg-one");
    }

    //静态方法检查
    @Override
    public boolean matches(Method method, Class<?> targetClass) {
        System.out.println("static method matches ..." + targetClass.getName() + "#" + method.getName());
        return "greetTo".equals(method.getName());
    }


    //动态方法检查
    @Override
    public boolean matches(Method method, Class<?> targetClass, Object[] args) {
        System.out.println("dynamic method matches ..." + targetClass.getName() + "#" + method.getName());
        String clientName = (String) args[0];
        return whiteList.contains(clientName);
    }

    //类类型检查
    @Override
    public ClassFilter getClassFilter() {
        return new ClassFilter() {
            @Override
            public boolean matches(Class<?> clazz) {
                System.out.println("classFilter matches..." + clazz.getName());
                return Waiter.class.isAssignableFrom(clazz);
            }
        };
    }
}
