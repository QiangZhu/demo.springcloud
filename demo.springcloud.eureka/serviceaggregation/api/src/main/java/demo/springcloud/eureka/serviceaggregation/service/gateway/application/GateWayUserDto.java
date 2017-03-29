/**
 * 2017年3月27日
 * zq
 */
package demo.springcloud.eureka.serviceaggregation.service.gateway.application;

/**
 * Package : demo.springcloud.zuul.serviceaggregation.service.gateway.application
 * 
 * @author YixinCapital -- zq
 *		   2017年3月27日 下午7:33:32
 *
 */
public class GateWayUserDto {
	
	
	private int userId;
	
	private int deptId;
	
	private String userName;
	
	private String deptName;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	@Override
	public String toString() {
		return "GateWayUserDto [userId=" + userId + ", deptId=" + deptId + ", userName=" + userName + ", deptName="
				+ deptName + "]";
	}

}
