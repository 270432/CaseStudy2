package Com.TestClass;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.BaseClass.Base_Class;

public class Test_Class extends Base_Class {
	public Test_Class() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//input[@name='term']")
	WebElement SearchBox;
	@FindBy(xpath="//a[@href='https://www.allmovie.com/search/all/the%20godfather']")
	WebElement PrintRes;
	@FindBy(xpath="//h1[contains(text(),'103 search results for the godfather')]")
	WebElement SearchResut;
	@FindBy(xpath="(//li[@class='result'])[1]")
	WebElement Clklik;
	@FindBy(xpath="//span[@class='header-movie-genres']")
	WebElement VfyCrime;
	@FindBy(xpath="(//span[contains(text(),'R')])[4]")
	WebElement MPAArating;
	@FindBy(xpath="//a[@title='Cast & Crew']")
	WebElement DirectorNam;
	@FindBy(xpath="(//dt[@class='name artist-name'])[1]")
	WebElement Director;
	@FindBy(xpath="(//div[@class='cast_container'])[2]")
	WebElement Verifytext;
	public void SearchText() throws InterruptedException {
		SearchBox.sendKeys("The Godfather");
		SearchBox.click();
		PrintRes.click();
	}
	public String SearchResult() {
		SearchBox.sendKeys("The Godfather");
		SearchBox.click();
		PrintRes.click();
	
		return SearchResut.getText();
	}
	public void LinkClick() {
		SearchBox.sendKeys("The Godfather");
		Clklik.click();
	}
	public String VerifyText() {
		SearchBox.sendKeys("The Godfather");
		Clklik.click();
		return VfyCrime.getText();
	}
	public String MPAARating() {
		SearchBox.sendKeys("The Godfather");
		Clklik.click();
		return MPAArating.getText();
	}
	public void VerifyDirectoryName() {
		SearchBox.sendKeys("The Godfather");
		Clklik.click();
		 DirectorNam.click();
		 String DirName=Director.getText();
		 if(DirName.equals("Francis Ford Coppola"))
			 System.out.println("Director name is “Francis Ford Coppola”");
		 else
			 System.out.println("Director name is not present"); 
		 
		 //verify Name Michael Corleone
		 String Name=Verifytext.getText();
		 if(Name.equals("Al Pacino’s Michael Corleone"))
			 System.out.println("Al Pacino’s is verified");
		 else
			 System.out.println("Al Pacino’s is  not verified"); 
		 
		 
	}

}
