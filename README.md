# Desafio de Controle de Fluxo em Java

Este é um projeto que implementa um desafio de controle de fluxo em Java. O objetivo do desafio é receber dois números inteiros e imprimir uma sequência de números entre eles, incluindo ambos os números. Além disso, o código trata a exceção de parâmetros inválidos.

## Como Executar

1. Certifique-se de ter o Java instalado em seu sistema.
2. Clone ou baixe este repositório para o seu computador.
3. Abra um terminal e navegue até o diretório onde o arquivo `Contador.java` está localizado.
4. Compile o código usando o comando: `javac Contador.java`
5. Execute o programa com o comando: `java Contador`
6. Siga as instruções no terminal para inserir os parâmetros.

## Detalhes do Código

- O código está estruturado na classe `Contador`.
- O método `main` recebe dois parâmetros usando `Scanner` a partir da entrada do terminal.
- O método `contar` verifica se os parâmetros são válidos e, se não forem, lança a exceção `ParametrosInvalidosException`.
- A exceção `ParametrosInvalidosException` é uma exceção personalizada que herda da classe base `Exception` e é lançada quando os parâmetros são inválidos.

## Considerações Finais

Este é um projeto simples que demonstra o uso de controle de fluxo e manipulação de exceções em Java. Sinta-se à vontade para explorar e aprimorar o código de acordo com suas necessidades.


