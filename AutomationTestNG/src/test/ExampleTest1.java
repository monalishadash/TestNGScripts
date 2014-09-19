package test;

import org.testng.annotations.Test;

public class ExampleTest1 {
  @Test(groups={"Group1"})
  public void methodEx1() {
	  System.out.println("Inside Example Test1, methodEx1");
  }
  
  @Test
  public void methodEx2() {
	  System.out.println("Inside Example Test1, methodEx2");
  }
  
  
  
  
}
