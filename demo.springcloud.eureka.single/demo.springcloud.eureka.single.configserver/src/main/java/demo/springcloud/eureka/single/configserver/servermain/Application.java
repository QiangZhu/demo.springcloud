/**
 * 2017年3月8日
 * zq
 */
package demo.springcloud.eureka.single.configserver.servermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Package : demo.springcloud.eureka.single.configserver.servermain
 * 
 * @author YixinCapital -- zq
 *		   2017年3月8日 下午3:24:38
 *
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月8日 下午3:24:38
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
