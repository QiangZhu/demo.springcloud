/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.gateway.controller;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.ClientHttpRequestFactory;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.http.client.SimpleClientHttpRequestFactory;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.DefaultResponseErrorHandler;
import org.springframework.web.client.RestTemplate;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import demo.springcloud.eureka.serviceaggregation.service.gateway.application.DepartmentDto;
import demo.springcloud.eureka.serviceaggregation.service.gateway.application.GateWayUserDto;
import demo.springcloud.eureka.serviceaggregation.service.gateway.application.UserDto;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.gateway.controller
 * 
 * @author YixinCapital -- zq 2017年3月27日 下午7:31:26
 *
 */
@RestController
@RequestMapping("/api")
public class GatewayController {

	private static final String URL_SERVICE_USER_FIND = "http://userservice/user/find";

	private static final String URL_SERVICE_DEPT_FIND = "http://deptservice/dept/find";

	@LoadBalanced // 这个少了可以害死人
	@Bean
	RestTemplate restTemplate(ClientHttpRequestFactory factory) {
		return new RestTemplate(factory);
	}

	@Bean
	public ClientHttpRequestFactory simpleClientHttpRequestFactory() {
		SimpleClientHttpRequestFactory factory = new SimpleClientHttpRequestFactory();
		factory.setReadTimeout(5000);// ms
		factory.setConnectTimeout(15000);// ms
		return factory;
	}

	@Autowired
	RestTemplate gatewayService;

	@RequestMapping("/user/find")
	public GateWayUserDto findUserById(@RequestBody GateWayUserDto dto) {

		UserDto userDto = null;
		DepartmentDto departmentDto = null;

		
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("Accept", MediaType.APPLICATION_JSON_VALUE); // 500 null
//		headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
//		Gson gson = new GsonBuilder().create();
//		UserDto requestUser = new UserDto();
//		requestUser.setId(dto.getUserId());
//		HttpEntity<String> entity = new HttpEntity<String>(gson.toJson(requestUser), headers);
//		gatewayService.setErrorHandler(new TestErrorHandler());
//		ResponseEntity<String> response =  gatewayService.exchange(URL_SERVICE_USER_FIND, HttpMethod.POST, entity, String.class);
//		System.out.println(response.getBody());
//		
//		userDto =  gatewayService.postForObject(URL_SERVICE_USER_FIND, entity, UserDto.class);
//		
//		System.out.println(userDto);


		 UserDto requestUser = new UserDto();
		 requestUser.setId(dto.getUserId());
		 userDto = (UserDto)PostUtil.request(gatewayService,URL_SERVICE_USER_FIND ,requestUser);
		
		 System.out.println(userDto);
		
		 if (userDto != null && userDto.getDeptId() > 0) {
		 DepartmentDto requestDept = new DepartmentDto();
		 requestDept.setId(userDto.getDeptId());
		 departmentDto = (DepartmentDto)PostUtil.request(gatewayService,URL_SERVICE_DEPT_FIND,requestDept);
		 System.out.println(departmentDto);
		 }
		
		 if (userDto != null && departmentDto != null) {
		 GateWayUserDto gateWayUserDto = new GateWayUserDto();
		 gateWayUserDto.setUserId(userDto.getId());
		 gateWayUserDto.setUserName(userDto.getName());
		 gateWayUserDto.setDeptId(departmentDto.getId());
		 gateWayUserDto.setDeptName(departmentDto.getName());
		 return gateWayUserDto;
		 }

		return null;
	}

	private static class PostUtil {

		public static Object request(RestTemplate restTemplate,String url ,Object obj) {
			HttpHeaders headers = new HttpHeaders();
			headers.add("Accept", MediaType.APPLICATION_JSON_VALUE); // 500 null
			headers.setContentType(MediaType.APPLICATION_JSON_UTF8);
			Gson gson = new GsonBuilder().create();
			HttpEntity<String> entity = new HttpEntity<String>(gson.toJson(obj), headers);
			restTemplate.setErrorHandler(new TestErrorHandler());
			return restTemplate.postForObject(url, entity, obj.getClass());
		}
	}

	private static class TestErrorHandler extends DefaultResponseErrorHandler {

		@Override
		public void handleError(ClientHttpResponse response) throws IOException {
			// conversion logic for decoding conversion
			Scanner scanner = new Scanner((InputStream) response.getBody());
			scanner.useDelimiter("\\Z");
			String data = "";
			if (scanner.hasNext())
				data = scanner.next();
			System.out.println(data);
		}
	}

}
