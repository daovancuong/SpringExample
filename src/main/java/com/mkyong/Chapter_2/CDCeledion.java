package com.mkyong.Chapter_2;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
@Component
@AnnotationSinger
public class CDCeledion implements CD {
    @Override
    public void play() {
        System.out.println("playing celedion");
    }
}
