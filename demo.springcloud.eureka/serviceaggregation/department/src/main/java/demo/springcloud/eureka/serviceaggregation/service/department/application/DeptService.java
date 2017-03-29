/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.department.application;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import demo.springcloud.eureka.serviceaggregation.service.department.core.Department;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.department.application
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午6:14:16
 *
 */
@Component
public interface DeptService extends CrudRepository<Department, Integer> {
	
	
	@Query(" select d from Department d where d.id = :id")
	Department findByDeptId(@Param("id") int id);

}
