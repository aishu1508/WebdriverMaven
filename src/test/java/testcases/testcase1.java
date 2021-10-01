package testcases;

import org.testng.annotations.Test;

public class testcase1 {
	
	
	@Test(priority=2)
	public void doLogin() {
		
		System.out.println("Login");
	}
		
		
		@Test(priority=1)
		public void doUserReg() {
			
			System.out.println("User registration");
			System.out.println();
		
	}

}
