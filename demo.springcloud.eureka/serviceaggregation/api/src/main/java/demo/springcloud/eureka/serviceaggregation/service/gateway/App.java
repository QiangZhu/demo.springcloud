/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.gateway
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午6:53:34
 *
 */
@EnableDiscoveryClient
@SpringBootApplication
public class App {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月27日 下午6:53:34
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);
	}

}
