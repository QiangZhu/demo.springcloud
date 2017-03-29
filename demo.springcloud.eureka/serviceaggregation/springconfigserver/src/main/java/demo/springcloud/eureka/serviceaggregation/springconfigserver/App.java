/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.springconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.springconfigserver
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午4:16:50
 *
 */
@EnableConfigServer
@SpringBootApplication
public class App {

	/**
	 * 
	 * @param args 
	 * @author YixinCapital -- zq
	 *	       2017年3月27日 下午4:16:51
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpringApplication.run(App.class, args);
	}

}
