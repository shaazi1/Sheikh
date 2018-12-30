package generic.liberary;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import pagefactory.Amazonpagefactory;

public class Amazonpurchase {

	WebDriver driver;
	Amazonpagefactory pf;

	
	public void getSetup() {
		
		System.setProperty("webdriver.chrome.driver","/home/mahbub/WebDrivers/chromedriver_linux64/chromedriver");
		driver = new ChromeDriver();
		pf=PageFactory.initElements(driver, Amazonpagefactory.class); //This line defines page factory
		//driver.manage().window().maximize();
        driver.get(pf.getUrl());   // No Web  Address Since We Are using Page factory

 		
	}
	public void getlogin() {
		pf.getSignin().click();
		pf.getEmailBox().sendKeys(pf.getEmail());
		pf.getPasswordBox().sendKeys(pf.getPassword());
		pf.getSubmit().click();
}

        public void loginValidation() { 
       	if(driver.getTitle().equalsIgnoreCase("Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more")) {
        	System.out.println("testpass");}
       	
        	else { System.out.println("There was a problem");
        	
        	}
        	
        	
        	
        	
        	
        }





}








