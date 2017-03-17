/**
 * 2017年3月8日
 * zq
 */
package demo.springcloud.eureka.ha.clients.client01.servermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;

/**
 * Package : demo.springcloud.eureka.single.consumer.servermain
 * 
 * @author YixinCapital -- zq
 *		   2017年3月8日 下午3:07:49
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@ComponentScan(basePackages="demo.springcloud.eureka.ha.clients.client01.controller")
public class Application {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月8日 下午3:07:49
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
