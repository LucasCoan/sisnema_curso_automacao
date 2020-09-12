package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//arquivo que tem as features
@RunWith(Cucumber.class)
@CucumberOptions(  //COLAR O CAMINHO DOS PROJETOS ENVOLVIDOS.
		features = "src\\test\\resources\\features\\PesquisaProduto.feature",
		glue = "steps",
		tags = "",
		plugin = {"pretty", "html:target/cucumber.html", "json:target/cucumber.json", "junit:target/cucumber.xml"},
		monochrome = true
		)

public class Runner {


}
