package AA;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class aaa {
	WebDriver driver;
	
	public void launchBrowser() {
		
System.setProperty("webdriver.gecko.driver", "/Users/aduran6/Documents/PRIMERAUTO/DRIVERS/geckodriver");
		
		driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/-/es/");
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aaa obj = new aaa ();
		
		obj.launchBrowser();
	
	 System.out.println("siso");
		System.out.println("Hola");
	}

}
