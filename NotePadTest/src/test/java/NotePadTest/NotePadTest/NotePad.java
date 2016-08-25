package NotePadTest.NotePadTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class NotePad {
	
	WiniumDriver driver = null; 
	 
	@BeforeClass 
	public void setUpEnvironment() throws IOException 
	{ 
	DesktopOptions options = new DesktopOptions(); 
	options.setApplicationPath("D:\\Jnpioneerenergy\\client\\Junifer.Thor.Client.exe"); 
	 
	try { 
	driver = new WiniumDriver (new URL ("http://localhost:9999") , options); 
	} catch (MalformedURLException e) { 
	// TODO Auto-generated catch block 
	e.printStackTrace(); 
	} 
	} 
	 
	@Test 
	public void testJuniferApplication(){ 
	driver.findElementById("566865").sendKeys("9xyz85sdwpQnIPHyrlYx"); 
	driver.findElementById("Login").click();
	 
	} 
	 
	//@AfterClass 
	public void tearDown() throws IOException { 
	driver.close(); 
	} 


}
