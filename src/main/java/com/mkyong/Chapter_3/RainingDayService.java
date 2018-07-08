package com.mkyong.Chapter_3;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class RainingDayService implements WeatherService {
    @Override
    public String forecast() {
        return "reanning day !";
    }
}
