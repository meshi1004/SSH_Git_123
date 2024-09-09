package com.edu.seiryo.entity;

public class UserMsg {
	private Integer id;
	private String phone;
	private String add;
	public UserMsg(Integer id, String phone, String add) {
		super();
		this.id = id;
		this.phone = phone;
		this.add = add;
	}
	public UserMsg( String phone, String add) {
		super();
		this.phone = phone;
		this.add = add;
	}
	public UserMsg() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAdd() {
		return add;
	}
	public void setAdd(String add) {
		this.add = add;
	}
	@Override
	public String toString() {
		return "UserMsg [id=" + id + ", phone=" + phone + ", add=" + add + "]";
	}
	
}
