package com.mkyong.config;

import com.mkyong.Chapter_2.*;
import com.mkyong.Chapter_3.ColdDayService;
import jdk.nashorn.internal.ir.ReturnNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@ComponentScan(basePackages = "com.mkyong.*")
@Import(OtherConfig.class)
public class AppConfig {

    @Bean
    public ThreadPoolTaskExecutor taskExecutor() {
        ThreadPoolTaskExecutor pool = new ThreadPoolTaskExecutor();
        pool.setCorePoolSize(3);
        pool.setMaxPoolSize(5);
        pool.setWaitForTasksToCompleteOnShutdown(true);
        return pool;
    }

    @Bean(name = "getTaskForKnight")
    public Knight getTaskForKnight() {
        return new Knight(getMissionRescuse());
    }

    @Bean(name = "getTaskForKnight_New")
    public Knight getTaskForKnight_New() {
        return new Knight(getMissionRescuse());
    }

    public Mission getMissionRescuse() {
        return new MissionRecuse();
    }

    @Bean
//    @Conditional(SeasonExistCondition.class)
    public ColdDayService ColdDayService() {
        return new ColdDayService();
    }


//    @Bean("getCDPlayer")
//    public CDPlayer getCDPlayer(){
//        return  new CDPlayer(new CDCeledion());
//
//    }

//    @Bean
//    public CDPlayer createCDPlayer(CD cd) {
//        return new CDPlayer(cd);
//    }

}