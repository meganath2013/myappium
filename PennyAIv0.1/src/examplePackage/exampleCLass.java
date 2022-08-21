package examplePackage;

import java.io.File;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.util.concurrent.TimeUnit;

public class exampleCLass  {
 static AppiumDriverLocalService service;
	@SuppressWarnings("deprecation")
	public static void main(String[] args)throws Exception
	{
	

//		AppiumDriverLocalService service = AppiumDriverLocalService
//				.buildService(new AppiumServiceBuilder()
//				.usingDriverExecutable(new File("//Users/meganathjayapalan/.nvm/versions/node/v14.15.0/bin/node"))
//				.withAppiumJS(new File("//Users/meganathjayapalan/.nvm/versions/node/v14.15.0/lib/node_modules/appium/build/lib/main.js"))
//				.usingPort(4723)
//				.withIPAddress("127.0.0.1"));
//				service.start();
				
				
	DesiredCapabilities dc = new DesiredCapabilities();
	
	URL url = new URL("http://127.0.0.1:4723/wd/hub");
	dc.setCapability(MobileCapabilityType.AUTOMATION_NAME,"Appium");
	dc.setCapability(MobileCapabilityType.DEVICE_NAME,"Android Emulator");
	dc.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
	dc.setCapability(MobileCapabilityType.PLATFORM_VERSION,"11.0");
	dc.setCapability(MobileCapabilityType.APP,"/Users/meganathjayapalan/myapkfiles/app-debug.apk");
	dc.setCapability("noReset", false);
	
	AppiumServiceBuilder builder = new AppiumServiceBuilder();
	builder.usingDriverExecutable(new File("/Users/meganathjayapalan/.nvm/versions/node/v14.15.0/bin/node"))
			.withAppiumJS(new File("/Users/meganathjayapalan/.nvm/versions/node/v14.15.0/lib/node_modules/appium/build/lib/main.js"))
			.withIPAddress("127.0.0.1").usingPort(4723).withArgument(()-> "--base-path", "/wd/hub");
	service = builder.build();

//	  HashMap environment = new HashMap();
//      environment.put("PATH", "/usr/local/bin:" + System.getenv("PATH"));
//      serviceBuilder.withEnvironment(environment);
//	
service.start();
AndroidDriver driver = new AndroidDriver(url,dc);
	Thread.sleep(6000);

	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//Thread.sleep(6000);
	
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View[3]/android.widget.Button[2]")).click();
	//Thread.sleep(3000);
	
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[2]/android.widget.EditText"))
	.sendKeys("qatest240522staging@pennyapp.com");
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[3]/android.widget.EditText")).sendKeys("Awesome1!");
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View/android.view.View/android.view.View[4]/android.widget.Button")).click();
	//driver.findElement(By.className("android.widget.Button")).click();
	//Thread.sleep(6000);
	//add button
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.widget.TabWidget/android.view.View[1]/android.view.View")).click();
	//Thread.sleep(2000);
	//add task
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[2]")).click();
	//Thread.sleep(1000);
	//select contact
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View/android.app.Dialog/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View/android.view.View")).click();
	//Thread.sleep(1000);		
	//select timew week
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View[1]/android.view.View/android.view.View[2]/android.view.View[2]/android.view.View/android.view.View[3]")).click();
	//Thread.sleep(1000);
// next on date screen
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[1]/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View/android.view.View[2]/android.view.View[2]/android.widget.ListView/android.view.View[3]")).click();
	//Thread.sleep(3000);
	//save task							
	driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button")).click();
	//Thread.sleep(18000);
	WebElement finalNext= driver.findElement(By.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.webkit.WebView/android.webkit.WebView/android.view.View/android.view.View[1]/android.view.View[2]/android.app.Dialog/android.view.View/android.view.View/android.view.View[2]/android.view.View[1]/android.widget.Button"));
	//if((finalNext.isDisplayed()&&finalNext.isEnabled())!=true)
	Thread.sleep(3000);
	finalNext.click();
	Thread.sleep(3000);
	service.stop();
	driver.quit();
	
}
}
