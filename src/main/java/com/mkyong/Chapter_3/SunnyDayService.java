package com.mkyong.Chapter_3;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"test", "default"})
public class SunnyDayService implements WeatherService {
    @Override
    public String forecast() {
        return " it's a sunny day";
    }
}
