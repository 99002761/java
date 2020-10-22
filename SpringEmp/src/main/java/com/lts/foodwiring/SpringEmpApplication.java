package com.lts.foodwiring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.lts.autowiring.ShapeFactory;
import com.lts.autowiring.Shape;
import com.lts.autowiring.Rectangle;
import com.lts.autowiring.Triangle;
import com.lts.constr.Student;
import com.lts.foodwiring.FoodPanda;
import com.lts.setter.Employee;

@SpringBootApplication
public class SpringEmpApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmpApplication.class, args);
	}
		
		@Autowired
		ApplicationContext context;
		

		
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//Employee employee = context.getBean("employee",Employee.class);
	//	System.out.println(employee);
		//Student student = context.getBean("student",Student.class);
		//System.out.println(student);
		
		//ShapeFactory shapeFactory = context.getBean(ShapeFactory.class);
       // shapeFactory.printArea(10,20);
		ShapeFactory shapefactory= context.getBean(ShapeFactory.class);
        shapefactory.printArea(10,20);
        FoodPanda foodPanda =context.getBean(FoodPanda.class);
        List<String>menuList = foodPanda.showMenu("Indian");
        for(String obj:menuList)
        	System.out.println(obj);
		
	}

}
