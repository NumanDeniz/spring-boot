package com.luv2code.springcoredemo.rest;

import com.luv2code.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    private Coach myCoach;

   // constructor (yapıcı) injection
    @Autowired
    public DemoController( Coach theCoach){
        myCoach=theCoach;
    }
// setter injection (ayarli)
/*
    @Autowired
    public  void setCoach(@Qualifier("baseballCoach") Coach theCoach){
        myCoach=theCoach;
    }*/
    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyWorkout();
    }

}
