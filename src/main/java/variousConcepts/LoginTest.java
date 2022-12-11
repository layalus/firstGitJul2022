package variousConcepts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {

		// System.setProperty("webdriver.chrome.driver",
		// "//Users//sharonranjitkar//Desktop//sel_lib//chromedriver");
		System.setProperty("webdriver.chrome.driver", "Driver//chromedriver");
		WebDriver driver = new ChromeDriver();

		driver.manage().deleteAllCookies();

		driver.get("https://techfios.com/portal/studentportal/index.php");

		driver.close();

	}
	
	

}
