package test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import page.HomePage;
import page.ProdutoPage;

public class Validatextocontactus {
	private WebDriver driver;

	private HomePage homePage;

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

		assertThat(homePage.obterTextoLinkContactUs(), is("Contact us"));
	}

	@Test
	public void validaNomeProdutoTelaDetalhe_nomesIguais() {
		//localizar o nome do primeiro produto
		String nomeProduto_HomePage = homePage.obterNomePrimeiroProduto();
		
		//clicar neste primeiro produto
		ProdutoPage produtoPage = homePage.clicarNomePrimeiroProduto();
		//na tela de detalhe de produto validaremos se o nome é igual
		String nomeProduto_ProdutoPage = produtoPage.obterNomeProduto(); 
		
		assertThat(nomeProduto_HomePage.toUpperCase(), is(nomeProduto_ProdutoPage));
	}

}

