package.com.shravani;
import java.util.*;
import java.io.*;
class MyException extends Exception
{
  private int ex;
  MyException(int a)
  {
    ex = a;
  }
  public String toString()
  {
    return "MyException[" + ex +"] is less than zero";
  }
}

