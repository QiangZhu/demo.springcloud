/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.department.controller;

import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.dozer.loader.api.BeanMappingBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import demo.springcloud.eureka.serviceaggregation.service.department.application.DepartmentDto;
import demo.springcloud.eureka.serviceaggregation.service.department.application.DeptService;
import demo.springcloud.eureka.serviceaggregation.service.department.core.Department;

/**
 * Package :
 * demo.springcloud.zuul.serviceaggregation.service.department.controller
 * 
 * @author YixinCapital -- zq 2017年3月27日 下午6:19:46
 *
 */
@RestController
@RequestMapping("/dept")
public class DepartmentController {

	@Autowired
	private DeptService deptService;

	@Bean
	public DozerBeanMapper mapper() throws Exception {
		DozerBeanMapper mapper = new DozerBeanMapper();
		mapper.addMapping(objectMappingBuilder);
		return mapper;
	}

	BeanMappingBuilder objectMappingBuilder = new BeanMappingBuilder() {
		@Override
		protected void configure() {
			mapping(Department.class, DepartmentDto.class).fields("id", "id").fields("name", "name");
		}
	};

	@RequestMapping("/create")
	public DepartmentDto create(@RequestBody DepartmentDto dto) {
		return convert2Dto(deptService.save(convert2Entity(dto)));
	}

	@RequestMapping("/find")
	public DepartmentDto find(@RequestBody DepartmentDto dto) {
		Department department = deptService.findByDeptId(dto.getId());
		DepartmentDto DepartmentDto = convert2Dto(department);
		return DepartmentDto;
	}

	private Department convert2Entity(DepartmentDto dto) {
		Mapper map = null;
		try {
			map = mapper();
			return map.map(dto, Department.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	private DepartmentDto convert2Dto(Department entity) {
		Mapper map = null;
		try {
			map = mapper();
			return map.map(entity, DepartmentDto.class);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
