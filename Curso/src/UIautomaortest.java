import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class UIautomaortest extends base {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
		
		AndroidDriver<AndroidElement> driver=Capabilities();
		//driver.findElementByAndroidUIAutomator("(attribute=value)");
		
		driver.findElementByAndroidUIAutomator("text(\"Views\")").click();

        // Validate clickable feature for all options
		System.out.println(driver.findElementByAndroidUIAutomator("new UiSelector().clickable(true)").getSize());
		

	}

}
