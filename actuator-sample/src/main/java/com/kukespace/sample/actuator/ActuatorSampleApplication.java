package com.kukespace.sample.actuator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.ApplicationPidFileWriter;

/**
 * @author adolph
 * @date 2020-08-20 11:40
 * */
@SpringBootApplication
public class ActuatorSampleApplication {

    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(ActuatorSampleApplication.class);
        springApplication.addListeners(new ApplicationPidFileWriter("/data/temp/app.id"));
        springApplication.run(args);
    }
}
