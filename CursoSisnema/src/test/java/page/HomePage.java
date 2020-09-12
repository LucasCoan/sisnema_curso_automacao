package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
	
	private WebDriver driver;
	
	private By linkContactUs = By.linkText("Contact us");
	private By nomePrimeiroProduto = By.cssSelector("#content > section > div > article:nth-child(1) > div > div.product-description > h3 > a");
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}

	public String obterTextoLinkContactUs() {
		return driver.findElement(linkContactUs).getText();
	}

	public String obterNomePrimeiroProduto() {		
		return driver.findElement(nomePrimeiroProduto ).getText();		
	}

	public ProdutoPage clicarNomePrimeiroProduto() {
		driver.findElement(nomePrimeiroProduto).click();
		return new ProdutoPage(driver);		
	}

}