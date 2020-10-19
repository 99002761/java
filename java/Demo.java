package.com.shravani;
import java.util.*;
import java.io.*;
class Demo
{
  static void sum(int a,int b) throws MyException
  {
    if(a<0)
    {
      throw new MyException(a); 
    }
    else
    {
      System.out.println(a+b);
    }
  }

  public static void main(String[] args)
  {
    try
    {
      sum(-10, 10);
    }
    catch(MyException me)
    {
      System.out.println(me); 
    }
  }
}