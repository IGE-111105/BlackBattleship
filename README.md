# BlackBattleship

Grupo TP06-8

- 105446 Afonso Maria Costa Coelho Ramires Ramos
- 111105 Guilherme Carolino dos Santos Calcao
- 92500 Nuno Miguel Tomeno de Velez Venancio
- 110886 Marta Pessoa Fonseca

## Product Backlog

1. Como jogador, quero abrir a pagina principal do Battleship Online para poder iniciar um jogo.
2. Como jogador, quero consultar as regras do jogo para perceber como funciona a batalha naval online.
3. Como jogador, quero escolher jogar contra um amigo para poder criar uma partida partilhavel.
4. Como jogador, quero escolher jogar contra um robot para poder jogar sem depender de outro jogador.

## Testes de aceitacao implementados

1. `UserStory1Test` - valida que a pagina principal abre corretamente e apresenta o titulo do jogo.
2. `UserStory2Test` - valida que as regras do Battleship estao disponiveis na pagina.
3. `UserStory3Test` - valida que existe uma opcao para jogar contra um amigo.
4. `UserStory4Test` - valida que existe uma opcao para jogar contra um robot ou adversario automatico.

## Suite Selenide e Allure

Suite individual: `battleship.selenide.g111105`

1. `Student111105UserStory1SelenideTest` - valida a abertura da pagina principal.
2. `Student111105UserStory2SelenideTest` - valida a disponibilidade das regras.
3. `Student111105UserStory3SelenideTest` - valida a opcao de jogar com amigo.
4. `Student111105UserStory4SelenideTest` - valida a opcao de jogar contra adversario automatico.

Suite individual: `battleship.selenide.g92500`

1. `SelenideUserStoriesTest` - Implementação completa das User Stories 1 a 4 utilizando Selenide e Allure Reports.

Os resultados Allure sao gerados em `target/allure-results`.
