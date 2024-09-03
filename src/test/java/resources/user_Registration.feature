Feature: Cadastro de Usuário

  Scenario: Cadastro de um usuário com sucesso
    Given o usuário está na página de cadastro
    When o usuário preenche o formulário de cadastro com nome "João", email "joaao@example.com" e senha "senha123"
    And o usuário clica no botão de cadastro
    Then o sistema deve mostrar uma mensagem de sucesso "Cadastro realizado com sucesso!"

  Scenario: Cadastro com email já existente
    Given o usuário está na página de cadastro
    And já existe um usuário com email "joao@example.com"
    When o usuário preenche o formulário de cadastro com nome "João", email "joao@example.com" e senha "senha123"
    And o usuário clica no botão de cadastro
    Then o sistema deve mostrar uma mensagem de erro "O email já está em uso."

  Scenario: Cadastro com dados incompletoss
    Given o usuário está na página de cadastro
    When o usuário preenche o formulário de cadastro com nome "João", email "" e senha "senha123"
    And o usuário clica no botão de cadastro
    Then o sistema deve mostrar uma mensagem de erro "O email é obrigatório."
