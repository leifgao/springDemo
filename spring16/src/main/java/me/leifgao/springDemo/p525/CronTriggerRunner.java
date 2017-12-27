package me.leifgao.springDemo.p525;

import me.leifgao.springDemo.p520.SimpleJob;
import org.quartz.CronTrigger;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerFactory;
import org.quartz.impl.StdSchedulerFactory;

/**
 * Created by leif on 2017/12/26
 */
public class CronTriggerRunner {

    public static void main(String[] args) throws Exception{

        JobDetail jobDetail = new JobDetail("job1_2", "jGroup1", SimpleJob.class);

        CronTrigger cronTrigger = new CronTrigger("trigger1_2", "tGroup1");
        cronTrigger.setCronExpression("0/5 * * * * ?");

        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
        Scheduler scheduler = schedulerFactory.getScheduler();
        scheduler.scheduleJob(jobDetail, cronTrigger);
        scheduler.start();
    }

}
