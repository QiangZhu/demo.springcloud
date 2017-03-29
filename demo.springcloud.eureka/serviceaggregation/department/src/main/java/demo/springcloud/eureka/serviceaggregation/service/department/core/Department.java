/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.department.core;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.department.core
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午6:00:35
 *
 */
@Entity
@Table(name = "yx_dept")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "yx_dept_id" , nullable = false)
	private int id;

	@Column(name = "yx_dept_name ", nullable = false)
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}

}
