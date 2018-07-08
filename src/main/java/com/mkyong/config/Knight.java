package com.mkyong.config;

import com.mkyong.Chapter_2.CDPlayer;
import org.springframework.beans.factory.annotation.Autowired;

public class Knight {
    private Mission mission;
    @Autowired
    private CDPlayer cdPlayer;

    public Knight(Mission mission) {
        this.mission = mission;
    }
    public void doSomthing(){
        mission.doTask();
    }

    public void playMusic(){
        cdPlayer.play();
    }
}
