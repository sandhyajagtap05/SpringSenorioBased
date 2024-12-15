package com.example.ScenarioBasedWithInterface;


import org.springframework.stereotype.Component;

@Component
public class B implements ABCD{
    @Override
    public void m1() {
        System.out.println("in class B");
    }
}
