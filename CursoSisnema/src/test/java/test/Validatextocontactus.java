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
    }
    @After
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void validatextocontactus() {
        driver.get("https://marcelodebittencourt.com/demoprestashop/");
        driver.manage().window().maximize();
        //assertThat(driver.findElement(By.linkText("Contact us")).getText(), is("Contact us"));
        
        homePage = new HomePage(driver);
        
        assertThat(homePage.obterTextoLinkContactus(), is("Contact us"));
    }
}