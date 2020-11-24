package seleniumgrid;

import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridParallel 
{
	@Test(priority=1)
	public void method1() throws Exception
	{
		//At Node1
		URL u1=new URL("http://192.168.1.7:5555/wd/hub");
		DesiredCapabilities dc1=DesiredCapabilities.chrome();
		/*DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");*/
		RemoteWebDriver driver1=new RemoteWebDriver(u1,dc1);
		driver1.get("http://www.facebook.com");
		Thread.sleep(5000);
		driver1.close();
	}
	
	@Test(priority=2)
	public void method2() throws Exception
	{
		//At Node2
		URL u2=new URL("http://192.168.1.7:6666/wd/hub");
		DesiredCapabilities dc2=DesiredCapabilities.chrome();
		/*DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");*/
		RemoteWebDriver driver2=new RemoteWebDriver(u2,dc2);
		driver2.get("http://www.flipkart.com");
		Thread.sleep(5000);
		driver2.close();
	}
	
	@Test(priority=3)
	public void method3() throws Exception
	{
		//At Node3
		URL u3=new URL("http://192.168.1.7:7777/wd/hub");
		DesiredCapabilities dc3=DesiredCapabilities.chrome();
		/*DesiredCapabilities dc=new DesiredCapabilities();
		dc.setCapability(CapabilityType.BROWSER_NAME,"chrome");*/
		RemoteWebDriver driver3=new RemoteWebDriver(u3,dc3);
		driver3.get("http://www.amazon.in");
		Thread.sleep(5000);
		driver3.close();
	}
}
