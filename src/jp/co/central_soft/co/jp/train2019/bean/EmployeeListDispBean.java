package jp.co.central_soft.co.jp.train2019.bean;

import java.util.List;

public class EmployeeListDispBean
{
	private List<EmployeeDispBean> empList;
	private String message;


	public List<EmployeeDispBean> getEmpList() {
		return empList;
	}
	public void setEmpList(List<EmployeeDispBean> empList) {
		this.empList = empList;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "EmployeeListDispBean [empList=" + empList + ", message=" + message + "]";
	}



}
