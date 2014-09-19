package example;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PrintName {
	@BeforeSuite
	public void beforeSuiteMethod()
	{
		System.out.println("Inside Before suite");
	}
	
	@BeforeTest
	public void beforeTestMethod()
	{
		System.out.println("Inside before test");
	}
	
	@AfterSuite
	public void afterSuiteMethod()
	{
		System.out.println("Inside After suite");
	}
	
	@AfterTest
	public void afterTestMethod()
	{
		System.out.println("Inside after test");
	}
	
	@BeforeClass
	public void beforeClassMethod()
	{
		System.out.println("Inside before class");
	}
	
	@AfterClass
	public void afterClassMethod()
	{
		System.out.println("Inside After class");
	}
	
	@BeforeGroups(groups={"Group1"})
	public void beforeGroupMethod()
	{
		System.out.println("Inside Before Groups annotation");
	}
	
	@AfterGroups(groups={"Group1"})
	public void afterGroupMethod()
	{
		System.out.println("Inside After Groups annotation");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Inside Before Method annotation");
	}
	
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Inside After Method annotation");
	}
	
  @Test ( groups={"Group1"},priority=1)
  public void displayName() {
	  System.out.println("In example package, test annotation...Say Hi to Monalisha");
  }
  
  @Test ( groups={"Group1"},priority=2, enabled=true)
  public void displayBUName() {
	  System.out.println("In example package, test annotation...Monalisha is in FS BU");
  }
  
}
