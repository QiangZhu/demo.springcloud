/**
 * 2017年3月8日
 * zq
 */
package com.yixin.demo.springcloud.eureka.single.eurekaclient.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package : com.yixin.demo.springcloud.eureka.single.eurekaclient.controller
 * 
 * @author YixinCapital -- zq
 *		   2017年3月8日 下午2:36:00
 *
 */
@RestController
public class EchoController {
	
	@RequestMapping(value="/echo",method=RequestMethod.POST)
	public String echo(String message){
		return "echo : " + message;
	}

}
