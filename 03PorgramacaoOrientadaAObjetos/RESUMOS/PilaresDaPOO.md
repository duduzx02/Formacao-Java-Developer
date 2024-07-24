- O que é um domínio e qual é a sua importância da abstração em aplicações Orientadas a Objetos(OO)?
- - Abstração é a habilidade de concentra-se nos aspectos essenciais de um domínio, ignorando características menos 
    importantes ou acidentais. Nesse contexto, objetos são abstrações de entidades existentes no domínio em querstão.
    Com isso, pode-se concluir que a abstração é a maneira de interpretar um contexto de negócio quando desejamos 
    transcrevê-lo com uma aplicação OO.
- O que é Encapsulamento?
- - É a possibilidade de proteger alguns dados ou funcionalidades da classe, não permitindo que seus consumidores 
    possam acessá-los.
- Sabemos que em java propriedades nos ajudam a encapsular variáveis através da conversão dos Gettes e Setters. 
  Nesse sentido, considerando o conceito de encapsulamento o que seria incorreto?
- - que acessar ou modificar as características de um objeto manipulando diretamente os seus atributos é uma boa 
    prática.
- Qual dos 4 pilares da orientção a objetos é responsavel por fornecer mecanismos de reutilização estrutural de 
  características e comportamentoS?
- - Hernaça
- Qual é a diferença entre Classes e Objetos?
- - Antes de um objeto ser criado, devemos definir quais serão suas propriedades e métodos, tais definições são 
    realizadas através de uma classe. A partir de uma classe, podemos construir objetos na memória do computador que 
    executa a nossa aplicação. Usando uma analogia, uma classe funciona como uma "receita" para criar objetos. 
    Inclusive, vários objetos podem ser criados a partir de uma única classe.
- Sobre polimorfismo
- - Tem capacidade de tratar objetos criados por classes específicas como objetos de uma classe genérica.
- - Tem capacidade de um objeto poder ser referenciado de várias formas.
- Sobre interface
- - É uma classe que implementa uma interface
- O que é hernaça?
- - O conceito de herança permite que você defina uma classe filha que reutiliza (herda), estende ou modifica as 
    caracteristicas (atributos) e comportamento (métodos) de uma classe pai.

## Pilares da Programação Orientada a Objetos em Java

### Introdução

A Programação Orientada a Objetos (POO) é um paradigma de programação amplamente utilizado no desenvolvimento de software moderno. Java, uma das linguagens de programação mais populares, adota fortemente este paradigma. A POO é baseada em quatro pilares principais: Abstração, Encapsulamento, Herança e Polimorfismo. Este artigo explora esses pilares, explicando seus conceitos e suas importâncias no contexto da programação em Java.

### Abstração

**Definição:**
Abstração é a capacidade de concentrar-se nos aspectos essenciais de um domínio, ignorando características menos importantes ou acidentais. Em termos de POO, a abstração permite que os desenvolvedores criem representações simplificadas e específicas de entidades do mundo real em suas aplicações.

**Importância:**
A abstração é crucial porque facilita a modelagem de sistemas complexos. Ao focar apenas nos atributos e comportamentos relevantes de um objeto, os desenvolvedores podem criar classes que são mais fáceis de entender e manter.

**Exemplo em Java:**
```java
public abstract class Animal {
    private String nome;
    private int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public abstract void fazerSom();
}

public class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Latido");
    }
}
```

### Encapsulamento

**Definição:**
Encapsulamento é a prática de proteger alguns dados ou funcionalidades de uma classe, permitindo que sejam acessados apenas através de métodos específicos. Isso evita que consumidores da classe acessem diretamente seus atributos, garantindo integridade e segurança.

**Importância:**
O encapsulamento promove a modularidade e a manutenção do código. Ao esconder os detalhes internos de uma classe, mudanças nesses detalhes não afetam o código que usa a classe, desde que a interface pública permaneça a mesma.

**Exemplo em Java:**
```java
public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade > 0) {
            this.idade = idade;
        }
    }
}
```

### Herança

**Definição:**
Herança é o mecanismo pelo qual uma classe (subclasse) pode herdar atributos e métodos de outra classe (superclasse). Isso permite a reutilização de código, além de promover uma estrutura hierárquica entre classes.

**Importância:**
A herança facilita a reutilização de código e a criação de estruturas mais organizadas e compreensíveis. Permite que novas classes sejam criadas com base em classes existentes, reduzindo a redundância.

**Exemplo em Java:**
```java
public class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void acelerar() {
        System.out.println("O veículo está acelerando");
    }
}

public class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int numeroDePortas) {
        super(marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void acelerar() {
        System.out.println("O carro está acelerando");
    }
}
```

### Polimorfismo

**Definição:**
Polimorfismo é a capacidade de tratar objetos de diferentes classes de maneira uniforme. Em outras palavras, permite que uma classe genérica seja usada para referenciar objetos de várias classes específicas, desde que elas compartilhem um comportamento comum.

**Importância:**
O polimorfismo é fundamental para a flexibilidade e extensibilidade do código. Permite que funções e métodos manipulem diferentes tipos de objetos de maneira consistente, facilitando a manutenção e evolução do sistema.

**Exemplo em Java:**
```java
public class Main {
    public static void main(String[] args) {
        Animal meuAnimal = new Cachorro("Rex", 3);
        meuAnimal.fazerSom(); // Saída: Latido

        meuAnimal = new Gato("Miau", 2);
        meuAnimal.fazerSom(); // Saída: Miado
    }
}

public class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void fazerSom() {
        System.out.println("Miado");
    }
}
```

### Conclusão

Os quatro pilares da Programação Orientada a Objetos—Abstração, Encapsulamento, Herança e Polimorfismo—são fundamentais para o desenvolvimento de software eficiente e sustentável em Java. Cada pilar contribui de maneira única para a criação de sistemas modulares, reutilizáveis e fáceis de manter. Compreender e aplicar esses conceitos é essencial para qualquer desenvolvedor que deseja dominar a POO e criar soluções robustas e escaláveis.