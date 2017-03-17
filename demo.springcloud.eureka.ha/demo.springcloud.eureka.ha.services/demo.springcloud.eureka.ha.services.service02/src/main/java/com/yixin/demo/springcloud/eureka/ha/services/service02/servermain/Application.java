/**
 * 2017年3月9日
 * zq
 */
package com.yixin.demo.springcloud.eureka.ha.services.service02.servermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Package : com.yixin.demo.springcloud.eureka.ha.services.servermain
 * 
 * @author YixinCapital -- zq
 *		   2017年3月9日 上午11:16:12
 *
 */
@ComponentScan(basePackages={"com.yixin.demo.springcloud.eureka.ha.services.service02.controller"})
@EnableEurekaClient
@SpringBootApplication
public class Application {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月9日 上午11:16:12
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
