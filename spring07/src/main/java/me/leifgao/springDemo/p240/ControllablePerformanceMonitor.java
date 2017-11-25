package me.leifgao.springDemo.p240;

import org.aopalliance.intercept.MethodInvocation;
import org.springframework.aop.support.DelegatingIntroductionInterceptor;

/**
 * Created by leif on 2017/11/25
 */
public class ControllablePerformanceMonitor extends DelegatingIntroductionInterceptor implements Monitorable{

    private ThreadLocal<Boolean> monitorStatusMap = new ThreadLocal<>();

    @Override
    public void setMonitorActive(boolean active) {
        monitorStatusMap.set(active);
    }

    @Override
    public Object invoke(MethodInvocation mi) throws Throwable {
        Object obj;

        if (monitorStatusMap.get()!=null && monitorStatusMap.get()) {
            System.out.println("性能监控开始");
            obj = super.invoke(mi);
            System.out.println("性能监控结束");
        }else {
            obj = super.invoke(mi);
        }
        return obj;
    }
}
