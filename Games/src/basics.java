import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

import com.microsoft.appcenter.appium.Factory;
import com.microsoft.appcenter.appium.EnhancedAndroidDriver;
import org.junit.rules.TestWatcher;
import org.junit.Rule;

public class basics extends base{

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
	
		AndroidDriver<AndroidElement> driver=Capabilities();
		
	driver.findElementByXPath ("//android.widget.TextView[@text='Log in with Google']").click();
	System.out.println(driver.findElementByXPath ("//android.widget.TextView[@text='DEXTRA GAMES']").isDisplayed());
	
	
	
	//driver.findElementById("com.android.chrome:id/terms_accept").click();
	//driver.findElementById("com.android.chrome:id/next_button").click();
	//driver.findElementById("com.android.chrome:id/positive_button").click();
	//driver.findElementByClassName("android.view.View").sendKeys("lucas.oliveira@dextra-sw.com");
	//driver.findElementByXPath ("//android.webkit.WebView[@text='Sign in with your Google Account. Learn more']").click();
	//driver.findElementByClassName("android.widget.EditText").sendKeys("");
	//driver.findElementByXPath ("//android.widget.Button[@text='Next']").click();
	
	}

}