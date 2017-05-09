package com.spring.mvc.swagger.common;

public class Response {
	private boolean flag;
	private String status;

	public boolean isFlag() {
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(boolean flag, String status) {
		super();
		this.flag = flag;
		this.status = status;
	}

}
