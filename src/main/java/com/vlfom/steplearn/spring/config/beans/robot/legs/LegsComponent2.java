package com.vlfom.steplearn.spring.config.beans.robot.legs;

import com.vlfom.steplearn.core.robot.legs.Foot;
import com.vlfom.steplearn.core.robot.legs.Leg;
import com.vlfom.steplearn.core.robot.legs.Shin;
import com.vlfom.steplearn.core.robot.legs.Thigh;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class LegsComponent2 {

    @Bean
    @Qualifier("legs2-1")
    public Leg legs2_leg1() {
        return new Leg(new Thigh(30, 90, 2), new Shin(70, 180, 2),
                new Foot(5, 200, 90, 1));
    }

    @Bean
    @Qualifier("legs2-2")
    public Leg legs2_leg2() {
        return new Leg(new Thigh(70, 90, 2), new Shin(30, 180, 2),
                new Foot(5, 200, 90, 1));
    }
}
