<h1 align="Center"> Exercicio de herança </h1>
<p align="Center">Exercicio de sistema de cadastro de clientes, fornecedores e funcionários</p>

</br>

a. Crie as classes solicitadas.</br>
b. Faça o relacionamento (herança) entre as classes.</br>
c. Defina a saída dos dados (toString()) nas classes indicadas. A classe onde tem a indicação</br>
é onde estará a saída – toString().</br>
d. Faça a classe de teste e execute.</br>
e. O método valorInss() tem a fórmula (salário * 11%)</br>

<h3>Pessoa</h3>
- String nome </br>
- int idade </br>
- String sexo </br>
- métodos get(s) e set(s) encapsulados </br>

 <h3>Gerente</h3>
String nomeGerencia </br>
- métodos get(s) e set(s) encapsulados </br>

<h3>Vendedor </h3>
- double valorVendas </br>
- int qntVendas </br>
- métodos get(s) e set(s) encapsulados</br>

<h3>Empregado</h3>
- double salario </br>
- String matricula </br>
-valorInss() </br>
- métodos get(s) e set(s) encapsulados

<h3>Cliente </h3>
- double valorDivida </br>
- int anoNascim  </br>
- métodos get(s) e set(s) encapsulados </br>

</br>

a. Crie uma Classe Pessoa, contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters). 
Atributos: String nome; String endereço; String telefone;</br>
b. Considere, como subclasse da classe Pessoa (desenvolvida no item anterior) a classe Fornecedor. Considere que cada instância da 
classe Fornecedor tem, para além dos atributos que caracterizam a classe Pessoa, os atributos valorCredito (correspondente ao crédito 
máximo atribuído ao fornecedor) e valorDivida (montante da dívida para com o fornecedor).</br>
c. Implemente na classe Fornecedor, para além dos usuais métodos seletores e modificadores, um método obterSaldo() que devolve a 
diferença entre os valores dos atributos valorCredito e valorDivida.</br>
d. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos
métodos implementados na classe Fornecedor e os herdados da classe Pessoa.</br>
