/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.user.application;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.user.application
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午1:56:48
 *
 */
public class UserDto {
	
	private int id;
	
	private String name;
	
	private int deptId;

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

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
		return "UserDto [id=" + id + ", name=" + name + ", deptId=" + deptId + "]";
	}

}
