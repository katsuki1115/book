package com.example.demo.common;

public class DateNotFoundException extends Exception{
	public DateNotFoundException() {
	}
	
	public DateNotFoundException(String msg) {
		super(msg);
	}
	
	public DateNotFoundException(Throwable th) {
		super(th);
	}
	
	public DateNotFoundException(String msg, Throwable th) {
		super(msg, th);
	}
}
