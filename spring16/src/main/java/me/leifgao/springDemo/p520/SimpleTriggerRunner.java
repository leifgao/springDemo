package me.leifgao.springDemo.p520;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.SimpleTrigger;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Date;

/**
 * Created by leif on 2017/12/26
 */
public class SimpleTriggerRunner {

    public static void main(String[] args) throws Exception{
        JobDetail jobDetail = new JobDetail("job1_1","jgroup1", SimpleJob.class);

        SimpleTrigger simpleTrigger = new SimpleTrigger("trigger1_1", "tgroup1");
        simpleTrigger.setStartTime(new Date());
        simpleTrigger.setRepeatInterval(2000);
        simpleTrigger.setRepeatCount(100);


    }
}
