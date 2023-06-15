package parameter_demo;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestngParameters1 {
	// Input
	public String username = "user123";
	public String password = "pass123";
	
	// Test
	@Parameters({"username", "password"})
	@Test
	public void testWithParams(String user, String pass) {
		System.out.println(user);
		System.out.println(pass);
	}
	
	@Test
	public void testWithParams2() {
		System.out.println(username);
		System.out.println(password);
	}

}
