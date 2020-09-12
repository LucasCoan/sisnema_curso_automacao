package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	
	private WebDriver driver;
	private By linkContactUS = By.linkText("Contact us");
	private By nomePrimeiroProduto = By.cssSelector("#content > section > div > article:nth-child(1) > div > div.product-description > h3 > a");

	public HomePage(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public String obterTextoLinkContactus() {
		return driver.findElement(By.linkText("Contact us")).getText()	;
	}

	public String obterNomePrimeiroProduto() {
		return driver.findElement(nomePrimeiroProduto).getText();
	
	}
	

}
