package com.mkyong;

import com.mkyong.Chapter_2.CDPlayer;
import com.mkyong.Chapter_2.OtherConfig;
import com.mkyong.Chapter_3.WeatherService;
import com.mkyong.config.AppConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.concurrent.ExecutionException;

@SpringBootApplication
public class App {
    @Autowired
    private Environment environment;

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
