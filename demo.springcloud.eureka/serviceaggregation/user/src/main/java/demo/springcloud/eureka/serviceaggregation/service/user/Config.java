/**
 * 2017年3月28日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.user;

import org.dozer.DozerBeanMapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import demo.springcloud.eureka.serviceaggregation.service.user.application.UserDto;
import demo.springcloud.eureka.serviceaggregation.service.user.core.User;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.user
 * 
 * @author YixinCapital -- zq 2017年3月28日 上午10:20:58
 *
 */
@Configuration
public class Config {

	@Bean
	public DozerBeanMapper mapper() throws Exception {
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.addMapping(objectMappingBuilder);
		return mapper;
	}

	BeanMappingBuilder objectMappingBuilder = new BeanMappingBuilder() {
		@Override
		protected void configure() {
			mapping(User.class, UserDto.class).fields("id", "id").fields("name", "name").fields("deptId", "deptId");
		}
	};

}
