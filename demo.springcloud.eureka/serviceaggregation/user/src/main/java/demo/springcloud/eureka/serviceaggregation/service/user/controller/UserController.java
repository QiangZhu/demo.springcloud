/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.user.controller;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.springcloud.eureka.serviceaggregation.service.user.application.UserDto;
import demo.springcloud.eureka.serviceaggregation.service.user.application.UserService;
import demo.springcloud.eureka.serviceaggregation.service.user.core.User;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.user.controller
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午1:52:39
 *
 */
@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Mapper mapper;
	
	@Autowired
	private UserService userService;
	
	
	@RequestMapping("/find")
	public UserDto findUserById(@RequestBody UserDto userDto){
		return convert2Dto(userService.findUserByid(userDto.getId()));
	}
	
	@RequestMapping("/create")
	public UserDto create(@RequestBody UserDto userDto){
		User user = convert2Entity(userDto);
		UserDto result = convert2Dto(userService.save(user));
		return result;
	}

	final private UserDto convert2Dto(User entity){
		return mapper.map(entity, UserDto.class);
	}
	
	final private User convert2Entity(UserDto dto){
		return mapper.map(dto, User.class);
	}

}
