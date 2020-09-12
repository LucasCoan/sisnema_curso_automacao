package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;

public class Validatextocontactus {
	private HomePage homePage;
	
    private WebDriver driver;
    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("https://marcelodebittencourt.com/demoprestashop/");
        driver.manage().window().maximize();
        homePage = new HomePage(driver);

    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void validatextocontactus() {
        
        //assertThat(driver.findElement(By.linkText("Contact us")).getText(), is("Contact us"));
              
        assertThat(homePage.obterTextoLinkContactus(), is("Contact us"));
    }
    
    @Test
    public void validaNomeProdutoTelaDetalhe_nomesIguais() {
    	//localizar o nome do primeiro produto 
    	String nomeProdutoHomePage = homePage.obterNomePrimeiroProduto();
    	
    	System.out.println(nomeProdutoHomePage);
    	
    	//clicar nesse primeiro produto
    	//na tela de detalhe do produto e validaremos se o nome é igual
    	
    	
    }
    
}







