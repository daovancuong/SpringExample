package com.mkyong.Chapter_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
//@Primary
@AnnotationSinger
@AnnotationClassical
public class CDBeattle implements CD {
    private String name;

    public CDBeattle() {
    }

    public CDBeattle(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println("playing beatel");
    }
}
