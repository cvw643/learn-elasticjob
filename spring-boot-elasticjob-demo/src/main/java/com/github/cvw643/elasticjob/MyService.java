package com.github.cvw643.elasticjob;

import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class MyService {
    public void someMethod(Date fireTime, String name) {
        System.out.println("fireTime = " + fireTime + ", name = " + name);
    }
}
