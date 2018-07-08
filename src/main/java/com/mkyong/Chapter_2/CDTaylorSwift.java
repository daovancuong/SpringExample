package com.mkyong.Chapter_2;

import org.springframework.stereotype.Component;

@Component
@AnnotationSinger
public class CDTaylorSwift implements CD {
    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " playing");
    }
}
