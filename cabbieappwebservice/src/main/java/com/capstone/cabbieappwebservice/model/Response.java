package com.capstone.cabbieappwebservice.model;

// Class responsible for deliver result of request
public class Response {
	boolean success;
	String message;
	public Response() {
		// TODO Auto-generated constructor stub
	}
	public Response(boolean success, String message) {
		super();
		this.success = success;
		this.message = message;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "Response [success=" + success + ", message=" + message + "]";
	}
}
