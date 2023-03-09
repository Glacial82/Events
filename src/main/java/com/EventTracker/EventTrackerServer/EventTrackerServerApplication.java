package com.EventTracker.EventTrackerServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.EventTracker.EventTrackerServer")
public class EventTrackerServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EventTrackerServerApplication.class, args);
	}

}
