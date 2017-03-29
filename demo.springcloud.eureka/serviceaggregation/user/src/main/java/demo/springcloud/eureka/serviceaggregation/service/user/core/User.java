/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.user.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.user.core
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午2:03:17
 *
 */
@Entity
@Table(name="yx_user")
public class User {
	
	@Id
	@GeneratedValue
	@Column(name = "yx_user_id" , nullable = false)
	private int id;
	
	@Column(name = "yx_user_name" , nullable = false)
	private String name;
	
	@Column(name = "yx_user_deptid" , nullable  = false)
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
		return "User [id=" + id + ", name=" + name + ", deptId=" + deptId + "]";
	}
}
