package test.ng.testGroup;

import org.testng.annotations.Test;

public class TestSelenium {
	@Test(groups = "selenium-test")
	public class TestSeleniumm {

		public void runSelenium() {
			System.out.println("runSelenium()");
		}

		public void runSelenium1() {
			System.out.println("runSelenium()1");
		}
	}
}