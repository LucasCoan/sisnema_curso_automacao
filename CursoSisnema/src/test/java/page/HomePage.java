package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	private WebDriver driver;
	private By linkContactUS = By.linkText("Contact us");

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String obterTextoLinkContactus() {
		return driver.findElement(By.linkText("Contact us")).getText()	;
	}
	

}
