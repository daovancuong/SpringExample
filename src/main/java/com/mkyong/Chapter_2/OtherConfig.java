package com.mkyong.Chapter_2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan(basePackages = "com.mkyong.*")
public class OtherConfig {
//    @Bean
//    public CDPlayer getCDPlayer(CD cd) {
//        return new CDPlayer(cd
//        );
//    }
//    @Bean
//    @Primary
//    public CD getCeledion(){
//        return new CDCeledion();
//    }
//
//    @Bean
//    public CD getBeteal(){
//        return new CDBeattle();
//    }


}
