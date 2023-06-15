package App;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TC_04_Transaction_Statement {
	@Test
	public void setup() throws MalformedURLException, InterruptedException {
		DesiredCapabilities caps = new DesiredCapabilities();

		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME, "Appium");
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "ANDROID");
		caps.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
		caps.setCapability("appPackage", "com.xuriti.app");
		caps.setCapability("appActivity", "com.xuriti.app.MainActivity");
		caps.setCapability(MobileCapabilityType.APP, "/home/tech-trail/Downloads/app-release.apk");

		URL url = new URL("http://127.0.0.1:4723/wd/hub/");

		AndroidDriver<MobileElement> driver = new AndroidDriver<MobileElement>(url, caps);

		// SignIn
		Thread.sleep(5000);
		MobileElement signin = driver.findElement(By.xpath("//android.view.View[@content-desc='Sign In']"));
		signin.click();

		// Email
		Thread.sleep(5000);
		MobileElement emailField = driver.findElement(By.xpath("//android.widget.EditText[@index=0]"));
		emailField.click();
		Thread.sleep(2000);
		emailField.sendKeys("visht433@gmail.com");

		// Password
		Thread.sleep(5000);
		MobileElement passwordField = driver.findElement(By.xpath("//android.widget.EditText[@index=1]"));
		passwordField.click();
		Thread.sleep(2000);
		passwordField.sendKeys("Xuriti&123");

		// Login
		Thread.sleep(2000);
		MobileElement loginButton = driver.findElement(By.xpath("//android.view.View[@content-desc='LOGIN']"));
		loginButton.click();
		
		//ignore
		Thread.sleep(10000);
		MobileElement ignore = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"IGNORE\"]"));
		ignore.click();
		
		// cottonking
		Thread.sleep(3000);
		MobileElement company = driver.findElement(By.xpath("//android.view.View[3]"));
		company.click();
		
		// sidebar
		Thread.sleep(10000);
		MobileElement sidebar = driver.findElement(By.xpath("//android.widget.ImageView[@index=2]"));
		sidebar.click();
		
		//transaction statement
		Thread.sleep(5000);
		MobileElement statement = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Transaction Statement\"]"));
		statement.click();
		
		//invoice
				Thread.sleep(5000);
				MobileElement invoice = driver.findElement(By.xpath("//android.view.View[@index=3]"));
				invoice.click();
				invoice.click();
				
				Thread.sleep(15000);
}
}