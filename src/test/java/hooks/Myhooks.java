package hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.BeforeStep;

public class Myhooks 
{
	
	@Before(order=1)
	public void beforeHooks1()
	{
		System.out.println("Before hook1 is executing");
	}
	@Before(order=2)
	public void beforeHooks2()
	{
		System.out.println("Before hook2 is executing");
	}
	@After(order=1)
	public void afterHooks1()
	{
		System.out.println("After hook1 is executing");
	}
	@After(order=2)
	public void afterHooks2()
	{
		System.out.println("After hook2 is executing");
	}
	@BeforeStep(order=1)
	public void beforeStep()
	{
		System.out.println("Before step is executing");
	}
	@AfterStep(order=2)
	public void AfterStep()
	{
		System.out.println("After step is excecuting");
	}
	@BeforeAll(order=1)
	public static void beforeAll01()
	{
		System.out.println("Before All01 is Excecuting");
	}
	@BeforeAll(order=2)
	public static void beforeAll02()
	{
		System.out.println("Before All02 is Excecuting");
	}
	@AfterAll(order=1)
	public static void afterAll01()
	{
		System.out.println("After All01 is Excecuting");
	}
	@AfterAll(order=2)
	public static void afterAll02()
	{
		System.out.println("After All02 is Excecuting");
	}

	@Before("@sanity")
	public void beforeHook() 
	{
		System.out.println("Before Hook is Executing");
	}
	@After("@regression")
	public void afterHook() 
	{
		System.out.println("After Hook is Executing");
	}
	
	
}
