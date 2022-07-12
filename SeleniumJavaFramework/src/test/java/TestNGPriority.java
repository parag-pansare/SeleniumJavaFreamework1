import org.testng.annotations.Test;

public class TestNGPriority {
	@Test(priority = 1)
	public void test1() {
		System.out.println("Inside test 1");
	}
	
	@Test(priority = 3)
	public void test2() {
		System.out.println("Inside test 2");	
	}
	
	@Test(priority  = 0)
	public void test3() {
		System.out.println("Inside test 3");	
	}
}


// if no priority, runs in alphabetical order
// if no priority given for a method, it will run before TCs with priority