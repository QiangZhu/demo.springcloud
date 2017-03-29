/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.user.application;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import demo.springcloud.eureka.serviceaggregation.service.user.core.User;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.user.application
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午3:30:15
 *
 */
@Component
public interface UserService extends CrudRepository<User, Integer> {
	
	
	@Query("select u from User u where u.id = :id")
	User findUserByid(@Param(value = "id") int id);

}
