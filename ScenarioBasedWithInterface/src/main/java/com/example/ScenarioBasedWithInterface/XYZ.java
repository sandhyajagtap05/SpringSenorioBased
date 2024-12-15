package com.example.ScenarioBasedWithInterface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class XYZ {
    @Autowired
    @Qualifier("b")
    ABCD abcd;

    void show(){

        abcd.m1();
    }

}
