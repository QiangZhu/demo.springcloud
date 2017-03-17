/**
 * 2017年3月9日
 * zq
 */
package demo.springcloud.eureka.ha.servers.server01.servermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Package : demo.springcloud.eureka.ha.servers.server01.servermain
 * 
 * @author YixinCapital -- zq
 *		   2017年3月9日 上午10:18:18
 *
 */
@EnableEurekaServer
@SpringBootApplication
public class Application {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月9日 上午10:18:18
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
