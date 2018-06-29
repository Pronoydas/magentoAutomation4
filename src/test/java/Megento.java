
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;



public class Megento {
	@Test
	public void test1() {
		String url = "https://magento.com/";
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		Home h = new Home(driver);
		Login l = new Login(driver);
		Main m = new Main(driver);
		h.click();
		l.cilckEmail("pronoysunny.47@gmail.com");
		l.clickPwd("Jis@1234");
		l.clickLogin();
		m.logout();
	}
}
