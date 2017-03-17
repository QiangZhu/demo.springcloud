/**
 * 2017年3月7日
 * zq
 */
package com.yixin.demo.springclould.configclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Package : com.yixin.demo.springclould.configclient.controller
 * 
 * @author YixinCapital -- zq
 *		   2017年3月7日 下午4:56:46
 *
 */
@RestController
public class ConfigClientController {
	
	
	@Value("${zookeeper.address}")
	private String zookeeperAddress;
	
	
	
	@RequestMapping("/zookeeperAddress")
	public String getZookeeperAddress() {
		return this.zookeeperAddress;
	}

}
