/**
 * 2017年3月9日
 * zq
 */
package demo.springcloud.eureka.ha.configservers.server01.servermain;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Package : demo.springcloud.eureka.ha.configservers.server01.servermain
 * 
 * @author YixinCapital -- zq
 *		   2017年3月9日 上午10:02:26
 *
 */
@EnableConfigServer
@SpringBootApplication
public class Application {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月9日 上午10:02:26
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(Application.class, args);
	}

}
