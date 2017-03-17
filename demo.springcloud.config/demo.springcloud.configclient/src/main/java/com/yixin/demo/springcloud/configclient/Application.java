package com.yixin.demo.springcloud.configclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * Hello world!
 *
 */

@SpringBootApplication
@ComponentScan(basePackages={"com.yixin.demo.springclould.configclient.controller"})
public class Application {
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
