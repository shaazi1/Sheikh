package pagefactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Amazonpagefactory {

	private String Url = "https://www.amazon.com/";
   
	
	@FindBy(xpath="(//*[@class='nav-line-2'])[3]")
    private WebElement Signin;
	
	@FindBy(xpath="//*[@type='email']")
	private WebElement emailBox;
	
	private String Email = "pash11@hotmail.com";
	
	
	@FindBy(xpath="//*[@type='password']")
	private WebElement PasswordBox;
	private String Password ="newport12";
	
	@FindBy(xpath= "//*[@id='signInSubmit']")
	private WebElement Submit;

	
			
			
			
			
	public String getUrl() {
		return Url;
	}


	public WebElement getSignin() {
		return Signin;
		
	}


	public WebElement getEmailBox() {
		return emailBox;
	}


	public String getEmail() {
		return Email;
	}


	public WebElement getPasswordBox() {
		return PasswordBox;
	}


	public String getPassword() {
		return Password;
	}


	public WebElement getSubmit() {
		return Submit;
	}
	
	
}
