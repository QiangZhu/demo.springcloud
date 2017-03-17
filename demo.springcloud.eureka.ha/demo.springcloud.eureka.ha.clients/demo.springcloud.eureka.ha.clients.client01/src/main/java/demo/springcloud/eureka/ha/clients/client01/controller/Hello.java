/**
 * 2017年3月8日
 * zq
 */
package demo.springcloud.eureka.ha.clients.client01.controller;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Package : demo.springcloud.eureka.single.consumer.controller
 * 
 * @author YixinCapital -- zq
 *		   2017年3月8日 下午2:50:17
 *
 */
@RestController
public class Hello {
	
	private static final String URL_ECHO_SERVICE = "http://service-regist/echo";
	
	
	@LoadBalanced
	@Bean
	RestTemplate restTemplate(){
		return new RestTemplate();
	}
	
	@Autowired
	RestTemplate echoService;
	//consumes={"application/json;charset=utf-8"},produces={"text/html","application/json;charset=utf-8"}
	@RequestMapping(value="/hello",method=RequestMethod.POST)
	public String hello(@RequestParam("message") String message){
		MultiValueMap<String, String> map = new LinkedMultiValueMap();
		if(StringUtils.isBlank(message)){
			map.add("message", "hello world!");
		}else{
			map.add("message", message);
		}
		return echoService.postForObject(URL_ECHO_SERVICE, map, String.class);
	}

}
