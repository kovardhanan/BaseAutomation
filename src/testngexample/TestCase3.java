package testngexample;

import org.testng.annotations.Test;
public class TestCase3 {
@Test(invocationCount = 3)
public void test() {
	System.out.println("login");
}
}
