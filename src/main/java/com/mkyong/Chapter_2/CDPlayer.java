package com.mkyong.Chapter_2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CDPlayer {
    @Autowired
    @AnnotationSinger
    @AnnotationClassical
    private CD cd;

    public CDPlayer() {
    }

    public CDPlayer(CD cd) {
        this.cd = cd;
    }

    public void play() {
        cd.play();
    }
}
