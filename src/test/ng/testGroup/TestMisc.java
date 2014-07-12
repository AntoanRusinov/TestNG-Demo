package test.ng.testGroup;

import org.testng.annotations.Test;

public class TestMisc {
	
	@Test(groups = { "mysql", "database" })
	public void testConnectMsSQL() {
		System.out.println("testConnectMsSQL");
	}
}
