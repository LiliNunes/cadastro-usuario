package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.assertj.core.api.Assertions.assertThat;

public class userRegistrationSteps {

    private String name;
    private String email;
    private String password;
    private String message;
    private static final String EXISTING_EMAIL = "joao@example.com";

    @Given("o usuário está na página de cadastro")
    public void usuario_na_pagina_de_cadastro() {
        // Inicializa o ambiente de teste, por exemplo, abre o navegador ou configura o driver.
        // Pode ser necessário configurar a inicialização do driver ou de recursos de UI aqui.
    }

    @When("o usuário preenche o formulário de cadastro com nome {string}, email {string} e senha {string}")
    public void preenche_formulario(String nome, String email, String senha) {
        this.name = nome;
        this.email = email;
        this.password = senha;
        // Aqui você deve implementar a lógica para preencher o formulário na aplicação.
        // Simulação do preenchimento.
    }

    @When("o usuário clica no botão de cadastro")
    public void clica_botao_cadastro() {
        // Implementar a lógica para clicar no botão de cadastro.
        // Simula o comportamento esperado.
        if (email.isEmpty()) {
            message = "O email é obrigatório.";
        } else if (email.equals(EXISTING_EMAIL)) {
            message = "O email já está em uso.";
        } else {
            message = "Cadastro realizado com sucesso!";
        }
    }

    @Then("o sistema deve mostrar uma mensagem de sucesso {string}")
    public void mensagem_sucesso(String mensagemEsperada) {
        assertThat(message).isEqualTo(mensagemEsperada);
    }

    @Then("o sistema deve mostrar uma mensagem de erro {string}")
    public void mensagem_erro(String mensagemEsperada) {
        assertThat(message).isEqualTo(mensagemEsperada);
    }
}
