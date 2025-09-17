1)  Escreva uma classe chamada Pessoa com os seguintes atributos: nome, idade, implemente também um construtor obrigatório (com os parâmetros: nome e idade) e o método mostraDados() que exibe os dados da pessoa no console.
 Escrever uma outra classe chamada Aluno,  ela deve herdar de Pessoa, tal classe possui as seguintes características:  atributos: número de matrícula, nome do curso que está cursando, um construtor para inicializar os atributos e sobrescrita do método mostraDados() para exibir também o nome do curso.
    - O  programa em Java deve:
    - Perguntar ao usuário,  se ele deseja instanciar um aluno ou uma pessoa
    - Criar o objeto correspondente, e chamar o método mostraDados() para exibir os dados da pessoa ou do aluno. 

______________________________________________________________________________

2)  Crie uma classe chamada Veiculo com os atributos: marca e ano. Implemente um construtor obrigatório (com os parâmetros: marca e ano) métodos getters e setters e um método mostraInfo() que exibe as informações do veículo no console. Depois, crie uma classe chamada Carro, que herda de Veiculo, com os seguintes atributos adicionais: numeroDePortas e tipoCombustivel. Implemente um construtor para inicializar todos os atributos e sobrescreva o método mostraInfo() para também exibir o número de portas e o tipo de combustível. Faça uma classe Principal para validar a implementação da herança, assim crie um objeto do tipo Carro e defina algumas entradas, feito isso chame o método mostraInfo().

______________________________________________________________________________

3)  Uma loja comercial tem 2 tipos de funcionários: vendedores e administrativos. Para todos os  funcionários a empresa precisa ter os registros do Nome, RG, valor da hora trabalhada, quantidade de horas trabalhadas e um método para calcular o holerite 
obs.: multiplique o valor da hora pelo número de horas trabalhadas no período
 - Os vendedores têm um salário base, mas ganham também comissão com base em suas vendas. Os administrativos têm um salário fixo, mas podem ganhar adicionais com base em hora extra.  Defina uma herança entre as classes, de tal modo  que exista  uma superclasse que implemente o que for comum aos dois tipos de funcionários e uma subclasse para cada tipo.
 - Os vendedores devem ter um método que acumule o total de vendas durante o mês e um método que imprima seu salário total considerando que a comissão é de 5% sobre cada venda. 
 - No caso dos administrativos as horas extras  são acumuladas e pagas com o valor de 1% do salário por hora.
 Finalize criando uma classe para testar as funcionalidades desenvolvidas.

______________________________________________________________________________

4) Crie uma classe chamada Produto com os atributos: nome (String), preco (double), quantidadeEstoque (int) A classe deve possuir: um construtor obrigatório para inicializar os atributos, métodos getters e setters para os atributos, um método mostrarDados() que exibe as informações do produto, e um método calcularValorTotalEstoque() que retorna o valor total em estoque (preço × quantidade). Crie uma subclasse chamada ProdutoImportado, que herda de Produto, e possui um atributo adicional: taxaImportacao (double). Essa classe deve: ter um construtor para inicializar todos os atributos (inclusive os herdados), sobrescrever o método mostrarDados() para exibir também o valor final do produto com a taxa de importação, sobrescrever o método calcularValorTotalEstoque() para considerar o preço acrescido da taxa de importação.

O programa deve:
- Perguntar ao usuário quantos produtos deseja cadastrar.
- Para cada produto, perguntar se deseja cadastrar um Produto ou um Produto Importado.
- Criar os objetos correspondentes, armazenando-os em um vetor.
- Ao final, percorrer o vetor e exibir os dados.
- Mostrar também o valor total em estoque de todos os produtos cadastrados.
______________________________________________________________________________

5)  Crie uma classe em java chamada ContaBancaria, com os seguintes atributos,  nomeCliente,  numConta,  saldo, método sacar (o saldo não pode ficar negativo), método depositar (o qual adiciona em saldo um valor).  Feito isso acrescente ao projeto duas classes herdadas de ContaBancaria: ContaPoupanca e ContaCorrente, com as seguintes características a mais. A Classe ContaPoupanca, deve ter o seguinte atributo, diaDeRendimento (tipo int), possui o método calcularNovoSaldo, esse método recebe a taxa e o dia rendimento da poupança  e verifica se atualiza o saldo. 

- obs.:  a remuneração da caderneta de poupança  é creditada mensalmente apenas em sua data de “aniversário”, que é o dia do mês em que o depósito foi feito. Assim, uma aplicação realizada no dia 10 de um determinado mês só fará jus à remuneração exatamente no dia 10 do mês seguinte.

Já a classe ContaCorrente deve ter o atributo limite e a redefinição do método sacar, permitindo saldo negativo até o valor do limite. Após a implementação das classes acima, você deverá implementar uma classe Contas.Java, contendo o método main. Nesta classe, você deverá implementar:

- Incluir dados relativos a(s) conta(s) de um cliente;
- Sacar um determinado valor da(s) sua(s) conta(s);
- Depositar um determinado valor na(s) sua(s) conta(s);
- Mostrar o novo saldo do cliente, a partir da taxa de rendimento, daqueles que possuem conta poupança;
- Mostrar saldo  da em conta corrente

______________________________________________________________________________
6)  Desenvolva um programa em Java para gerenciar uma biblioteca, será necessário representar diferentes tipos de livros: Livros Didáticos, Livros de Ficção e Livros de Não Ficção. Temos  algumas propriedades em comum, como título, nome do autor, número de páginas e o método InformarDetalhes() que exibe informações como título, nome do autor e número de páginas.  Dessa forma utilize herança para criar uma super classe chamada Livro, que contém as propriedades comuns a todos os tipos de livros.  Em seguida, herde da super classe para criar as subclasses de LivrosDidaticos, LivrosDeFiccao e LivrosDeNaoFiccao, tais entidades contêm suas próprias específicidades.
 - Livro Didático possui os atributos disciplina, ano escolar, nível de ensino e os métodos verificarCompatibilidade(): verifica se o livro é compatível com o nível escolar informado e a  sobrescrita do método InformarDetalhes() para informar também os atributos da subclasse LivroDidatico.
 - Livro de Ficção possui os atributos gênero e subgênero (Ex: gênero Guerra subgênero Espacial) e os métodos sinopseDoLivro() informa um pequeno trecho sobre a história do livro, e a sobrescrita do método InformarDetalhes() para informar também os atributos da subclasse LivroDeFiccao. 
 - Livro de Não Ficção possui o atributo tema e tópico (Ex: Tema Matemática, tópico Números Complexo) e os métodos recomendarOutrosTitulos(): recomenda outros Titulos de Livros, e a sobrescrita do método InformarDetalhes() para informar também os atributos da subclasse LivroDeNaoFiccao..
 Finalize criando uma classe para testar as funcionalidades desenvolvidas.




______________________________________________________________________________

