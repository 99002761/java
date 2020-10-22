package com.training;
import java.util.function.Consumer;
import java.util.function.Predicate;
interface Calculator{
	void calculate(int x, int y);
}

public class Demo {

	public static void main(String[] args) {
		Calculator calc1 = (x,y)->System.out.println(x*y);
		calc1.calculate(10, 20);
		
		Consumer<String> con =(s)->System.out.println(s.toUpperCase());
		con.accept("hello");
		Consumer<Integer> in =(t)->System.out.println("Sq:"+t*t);
		in.accept(30);
		
		Predicate<String> pred1=(s)->s.length()>5;
		pred1.test("shravani");
		pred1 = (s)->s.toLowerCase().equals("welcome");
		System.out.println(pred1.test("welcome"));
		
		

	}

}
