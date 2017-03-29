/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.eurekaserver
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 上午11:37:22
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class App {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月27日 上午11:37:23
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);
	}

}
