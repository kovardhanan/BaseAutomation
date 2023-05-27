package testngexample;

import org.testng.annotations.Test;

public class TestCase1 {
   @Test(priority = 1)
   public void test1() {
	   System.out.println("login");
   }
   @Test(priority = 0)
   public void test2() {
	   System.out.println("singup");
   }
}
