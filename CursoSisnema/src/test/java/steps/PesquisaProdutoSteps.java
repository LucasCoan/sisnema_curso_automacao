package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class PesquisaProdutoSteps {

	@Dado("que estou na pagina inicial")
	public void que_estou_na_pagina_inicial() {
		// Write code here that turns the phrase above into concrete actions
		System.out.println("Estou na pagina inicial");
	}

	@Quando("preencho a pesquisa de produto com {string}")
	public void preencho_a_pesquisa_de_produto_com(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Quando("clico na lupa")
	public void clico_na_lupa() {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

	@Então("lista o produto {string}")
	public void lista_o_produto(String string) {
		// Write code here that turns the phrase above into concrete actions
		throw new io.cucumber.java.PendingException();
	}

}
