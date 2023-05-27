package testngexample;

import org.testng.annotations.Test;

public class TestCase2 {
@Test(enabled = false)
public void test() {
	System.out.println();
}
@Test
public void test3() {
	System.out.println("sent massg");
}
}
