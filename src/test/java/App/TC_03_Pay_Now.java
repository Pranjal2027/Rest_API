package App;

import java.awt.event.KeyEvent;
import java.net.MalformedURLException;
import java.net.URL;
import io.appium.java_client.android.nativekey.AndroidKey;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.remote.MobileCapabilityType;

public class TC_03_Pay_Now {
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
		Thread.sleep(15000);
		MobileElement ignore = driver.findElement(By.xpath("//android.widget.Button[@content-desc=\"IGNORE\"]"));
		ignore.click();
		
		// cottonking
		Thread.sleep(3000);
		MobileElement company = driver.findElement(By.xpath("//android.view.View[3]"));
		company.click();
		
//		// sidebar
//		Thread.sleep(15000);
//		MobileElement sidebar = driver.findElement(By.xpath("//android.widget.ImageView[@index=2]"));
//		sidebar.click();
		
		// paynow
		Thread.sleep(15000);
		MobileElement paynow = driver.findElement(By.xpath("//android.view.View[@content-desc=\"PAY NOW\"]"));
		paynow.click();
		
		// select seller dropdown
		Thread.sleep(5000);
		MobileElement dropdown = driver.findElement(By.xpath("//android.widget.Button[@index=0]"));
		dropdown.click();
		
		// select company
		Thread.sleep(3000);
		MobileElement Company = driver.findElement(By.xpath("//android.view.View[@content-desc=\"BENETTON INDIA PRIVATE LIMITED\"]"));
		Company.click();
		
		// enable
		Thread.sleep(3000);
		MobileElement enable = driver.findElement(By.xpath("//android.widget.Switch[1]"));
		enable.click();
		
		// paymentsumamry
//		Thread.sleep(3000);
//		MobileElement paymentsummary = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Payment Summary\"]"));
//		paymentsummary.click();
//		
//		// cross
//		Thread.sleep(30000);
//		MobileElement cross = driver.findElement(By.xpath("//android.view.View[0]"));
//		cross.click();
		
		// amount
		Thread.sleep(3000);
		MobileElement amount = driver.findElement(By.xpath("//android.widget.EditText[@index=2]"));
		amount.click();
		Thread.sleep(2000);
		amount.sendKeys("1000");
		driver.getKeyboard().pressKey(Keys.ENTER);
		
		// paynow
		Thread.sleep(3000);
		MobileElement Paynow = driver.findElement(By.xpath("//android.view.View[@content-desc=\"PAY NOW\"]"));
		Paynow.click();
		
		// proceed
		Thread.sleep(3000);
		MobileElement proceed = driver.findElement(By.xpath("//android.view.View[@content-desc=\"Proceed\"]"));
		proceed.click();
	}
}
