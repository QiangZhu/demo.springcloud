/**
 * 2017年3月8日
 * zq
 */
package demo.springcloud.eureka.single.eurekaserver.servermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * Package : demo.springcloud.eureka.single.eurekaserver.servermain
 * 
 * @author YixinCapital -- zq
 *		   2017年3月8日 下午3:18:23
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月8日 下午3:18:23
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
