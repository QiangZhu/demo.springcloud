/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.department.application;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.department.application
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午6:17:10
 *
 */
public class DepartmentDto {
	
	
	private int id;
	
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "DepartmentDto [id=" + id + ", name=" + name + "]";
	}

}
