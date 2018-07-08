package com.mkyong.thread;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.concurrent.Callable;

@Component
@Scope("prototype")
public class PrintTask2 implements Callable<String> {

    String name;

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String call() throws Exception {
        System.out.println(name + " is running");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "hello";
    }
}