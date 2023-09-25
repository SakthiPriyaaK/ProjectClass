package pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.BaseClass;

public class CreatePage extends BaseClass {
	
	public CreatePage() {
		PageFactory.initElements(driver, this);
	}
		
		@FindBy(name="firstname")
		private WebElement firstname;
		
		@FindBy(name="lastname")
		private WebElement lastname;
		
		@FindBy(id="u_3_g_ij")
		private WebElement mobile;
		
		@FindBy(name="reg_passwd__")
		private WebElement password;

		public WebElement getFirstname() {
			return firstname;
		}
		
		public WebElement getLastname() {
			return lastname;
		}
		
		public WebElement getMobile() {
			return mobile;
		}
		public WebElement getPassword() {
			return password;
		}
}
