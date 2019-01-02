package com.spring.intro;

import java.util.List;

public class HelloWorld {
	
	private String message;
	private List<Holiday> holidays;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<Holiday> getHolidays() {
		return holidays;
	}
	public void setHolidays(List<Holiday> holidays) {
		this.holidays = holidays;
	}
	
	public void hello() {
		System.out.println("Hello! "+message);
	}
	
	public HelloWorld() {}
	

}
