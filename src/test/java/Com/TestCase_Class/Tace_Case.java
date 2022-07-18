package Com.TestCase_Class;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Com.BaseClass.Base_Class;
import Com.TestClass.Test_Class;

public class Tace_Case extends Base_Class {
	Test_Class Ts;
	public Tace_Case() {
		super();
	}
	@BeforeMethod
	public  void setup() {
		initialization();
		Ts=new Test_Class();
		
		}
	@Test(priority = 1)
	public void MoviesSearch() throws InterruptedException {
		Ts.SearchText();
	}
	@Test(priority = 2)
	public void ResultText() {
		String ResultItem=Ts.SearchResult();
		System.out.println("Result Item Is"+"-"+ResultItem);
		
	}
	@Test(priority = 3)
	public void clicklink() {
		Ts.LinkClick();
	}
	@Test(priority = 4)
	public void Textverify() {
		String Text=Ts.VerifyText();
		if(Text.equals("Genres - Crime"))
			System.out.println("Genres - Crime text is verified");
		else
			System.out.println("Genres - Crime text is not verified");
	}
	@Test(priority = 5)
	public void mpaaRating() {
		String Rating=Ts.MPAARating();
		if(Rating.equals("MPAA Rating - A"))
			System.out.println("MPAA Rating - A text is verified");
		else
			System.out.println("MPAA Rating - A text is not verified");
	}
	@Test(priority = 6)
	public void DirName() {
		Ts.VerifyDirectoryName();
		
	}
	@AfterMethod
	public void TearDown() {
		driver.close();
	}

}
