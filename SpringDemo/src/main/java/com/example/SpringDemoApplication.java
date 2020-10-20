package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

 

import com.example.training.GreetService;

 

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {

 

    public static void main(String[] args)  {
        SpringApplication.run(SpringDemoApplication.class, args);
    }
    @Autowired
    GreetService greetService;
     //ApplicationContext context;
    @Override
    public void run(String... args) throws Exception {
        // TODO Auto-generated method stub
         //= context.getBean(GreetService.class);
        
        System.out.println(greetService.greet("Shravani"));
        
    }

 

}