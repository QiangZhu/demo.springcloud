/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.department;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.department
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午5:49:21
 *
 */
@EnableEurekaClient
@SpringBootApplication
public class App {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月27日 下午5:49:21
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);
	}

}
