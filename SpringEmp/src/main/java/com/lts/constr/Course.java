package com.lts.constr;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Course {
	String cname;
	Double price;
	public String getCname() {
		return cname;
	}
	@Value("${student.course.cname}")
	public void setCname(String cname) {
		this.cname = cname;
	}
	public Double getPrice() {
		return price;
	}
	@Value("${student.course.price}")
	public void setPrice(Double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Course [cname=" + cname + ", price=" + price + "]";
	}
	
	
	

}
