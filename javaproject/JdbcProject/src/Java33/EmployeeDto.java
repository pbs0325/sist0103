package Java33;

import java.util.Date;

public class EmployeeDto {
	private String num;
	private String name;
	private String photo;
	private String gender;
	private String dept;
	private String position;
	private String addr;
	private int pay;
	private String email;
	private Date ipsaday;
	
<<<<<<< HEAD:javaproject/JdbcProject/src/javaproject/JavaDto.java
	private int pay,num;
	private String name,dept,photo,gender,addr,email,position,ipsaday;
	
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public int getNum() {
=======
	public String getNum() {
>>>>>>> 89b3f39060c0703b73d3dfb1fcbaffc1286bfe64:javaproject/JdbcProject/src/Java33/EmployeeDto.java
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
<<<<<<< HEAD:javaproject/JdbcProject/src/javaproject/JavaDto.java
	public String getIpsaday() {
		return ipsaday;
	}
	public void setIpsaday(String ipsaday) {
=======
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getIpsaday() {
		return ipsaday;
	}
	public void setIpsaday(Date ipsaday) {
>>>>>>> 89b3f39060c0703b73d3dfb1fcbaffc1286bfe64:javaproject/JdbcProject/src/Java33/EmployeeDto.java
		this.ipsaday = ipsaday;
	}

}
