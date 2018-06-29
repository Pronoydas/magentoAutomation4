

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Home {
	By myacct=By.linkText("MY ACCOUNT");
	WebDriver driver = null;
	public Home(WebDriver driver) {
		this.driver=driver;
	}
	public void click() {
		driver.findElement(myacct).click();
	}
}
