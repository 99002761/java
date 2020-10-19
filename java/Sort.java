package com.shravani;
import java.util.*;
public class Sort{
    public static void main(String args[]) {
        Students stu1 = new Students(37,"shravani","telangana");
        Students stu2= new Students(30,"ram","karimnagar"); 
        Students stu3 = new Students(32,"ruchi","hyderabad");
        Students stu4 = new Students(33,"banu","bangalore");
        ArrayList<Students>student = new ArrayList<>();
        student.add(stu1);
        student.add(stu2);
        student.add(stu3);
        student.add(stu4);
         for(Students obj:student){
             System.out.println(obj);
         }

         Collections.sort(student,new Sortmain());
         for(Students obj:student){
            System.out.println(obj);
         }
        Collections.sort(student,new Comparator<Student>(){
            public int compare(Students obj1,Students obj2){
                 return obj1.getPlace().compareTo(obj2.getPlace()); 
            }

        });


    }
    
}