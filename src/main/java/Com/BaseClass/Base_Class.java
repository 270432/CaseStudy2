package Com.BaseClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import net.bytebuddy.utility.RandomString;

public class Base_Class {
	public static WebDriver driver;
	public static Properties props;
	
	public Base_Class(){
		
    try {
    	
	   props=new Properties();
	FileInputStream ip = new FileInputStream("E:\\javabatch\\Casestudy_Assigement_2\\src\\main\\java\\Com\\Config\\Config_Properties");
	                                            
	
	props.load(ip);
	
}
    catch(FileNotFoundException e) {
    	e.printStackTrace();
    }
    catch(IOException e) {
    	e.printStackTrace();  
    	
}
	}
	
	public static void initialization() {
		
		String browsername = props.getProperty("browser");
		System.setProperty("webdriver.gecko.driver","E:\\chrome driver\\geckodriver.exe");

		driver = new FirefoxDriver();
		  
		  driver.manage().window().maximize();  
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  
		  driver.get(props.getProperty("url"));
	}
	public String getScreenShotPath() throws IOException
	   {
		   
		TakesScreenshot scrShot =((TakesScreenshot)driver);
	    File SourceFile=scrShot.getScreenshotAs(OutputType.FILE);
	    File DestFile=new File(".//ScreenShot//Movies.png");
	    FileUtils.copyFile(SourceFile, DestFile);
		return null;
	   	
	   	
}
}
