package App;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class TC_01_Desired_Capabilities {
	
	@Test							
	public void setup() throws MalformedURLException, InterruptedException {							
	
		DesiredCapabilities caps = new DesiredCapabilities();							
	
		caps.setCapability(MobileCapabilityType.AUTOMATION_NAME ,"Appium");							
	
		caps.setCapability(MobileCapabilityType.PLATFORM_NAME ,"ANDROID");							
	
		caps.setCapability(MobileCapabilityType.DEVICE_NAME ,"emulator-5554");							
	
		caps.setCapability("appPackage","com.xuriti.app");							
	
		caps.setCapability("appActivity","com.xuriti.app.MainActivity");							
	
		caps.setCapability(MobileCapabilityType.APP, "/home/tech-trail/Downloads/app-release.apk");							
	
		URL url = new URL("http://127.0.0.1:4723/wd/hub/");							
	
		AndroidDriver<WebElement> driver = new AndroidDriver<WebElement>(url,caps);												
				
	}							
}
