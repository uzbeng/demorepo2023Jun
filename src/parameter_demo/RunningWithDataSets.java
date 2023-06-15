package parameter_demo;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class RunningWithDataSets {
	
	@Test(dataProvider = "getUsers")
	public void testWithParams(String username, String password) {
		System.out.println(username);
		System.out.println(password);
	}
	
	// Testing with multiple data sets
	@DataProvider
	public Object[][] getUsers() {
		
		// Read from excel sheet or data base table and then pass it to data object.
		
		Object[][] data = new Object[6][2];
		data[0][0] = "user1";
		data[0][1] = "pass1";
		
		data[1][0] = "user2";
		data[1][1] = "pass2";
		
		data[2][0] = "user3";
		data[2][1] = "pass3";
		
		data[3][0] = "user4";
		data[3][1] = "pass4";
		
		data[4][0] = "user5";
		data[4][1] = "pass5";
		
		data[5][0] = "user6";
		data[5][1] = "pass6";
		
		return data;

	}
	

}
