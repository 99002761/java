package com.shravani;
import java.util.List;
import java.util.*;
public class Array{
    public static void main(String args[]) {
        List<Students>student=new ArrayList<>();
        Students stu = new Students(37,"shravani","telangana");
        student.add(stu);
        student.add(new Students(30,"ram","karimnagar"));
        student.add(new Students(32,"ruchi","hyderabad"));
        student.add(new Students(12,"kalyan","mysore"));
       
    }
    Iterator<Students>stud= student.iterator();
    while(stud.hasNext()){
        Students obj = iterator.next();
        System.out.println(obj);
    }
    ListIterator<Students>stud1= student.listIterator();
         student.listIterator(student.size());
    while(stud1.hasPrevious()){
        Students obj1 = stud1.Previous();
        System.out.println(obj1);
    }
    
}