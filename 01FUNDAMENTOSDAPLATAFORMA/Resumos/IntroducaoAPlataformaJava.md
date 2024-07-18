# Introdução
1. Quais são os 04 pilares da orientação a Objetos?
- Abstração, Polimorgismo, herança e Encapsulamento
2. Cite itens que fazem parte do conjunto de funcionalidades(features) da linguagem Java
- Fortemente tipada, Possui uma máquina virtual chamada JVM, Suporta o paradigma Orientada a Objetos e Suporta o 
  paradigma funcional.
3. Antes de se chamar Java, qual foi o seu primeiro nome?
- Oak
4. A denominação do código orinado da compilação java se chama
- Bytecode
5. Hoje sabemos que a linguguaem java é mantida pela Oracle Inc, qual empresa tinha os direitos da tecnologia?
- Sun Microsystems
6. A linguagem java é baseada sobre quais linguagues de programação?
- C e C++
7. Como se chama o desenvolvedor que liderou o projeto para a criação da linguagem java?
- James Gosling
8. Para executar uma aplicação desenvolvida em java, convertendo os bytescodes em código de máquina, énecessário ter 
   disponível em nosso sistema operacional o recurso denomido de?
- JVM, através de uma JDK ou JRE
9. Como é chamado o conceito de execuções paralelas em uma aplicação?
- Multi-threading
10. Qual foi o fato que contribuiu para que a linguagem se tornasse tão popular?
- A linguagem se popularizou pelo termo "Write Once, Run anywhere", que enaltece a interoperabilidade da plataforma 
  java.

1. Os Quatro Pilares da Orientação a Objetos
   Abstração:
   Abstração é o processo de esconder os detalhes de implementação de um objeto e expor apenas a funcionalidade essencial. Isso é alcançado através do uso de classes e interfaces. Em Java, você pode criar uma classe abstrata ou uma interface que define métodos abstratos que devem ser implementados pelas subclasses concretas.

Polimorfismo:
Polimorfismo permite que uma entidade (como uma variável, função ou objeto) possa se comportar de diferentes formas. Em Java, isso é obtido através da sobrecarga de métodos (compile-time polymorphism) e do uso de herança e interfaces (runtime polymorphism). O polimorfismo permite que você escreva código mais flexível e reutilizável.

Herança:
Herança é o mecanismo pelo qual uma classe pode herdar características (atributos e métodos) de outra classe. A classe que herda é chamada de subclasse ou classe derivada, e a classe da qual ela herda é chamada de superclasse ou classe base. Em Java, a herança é implementada usando a palavra-chave extends. Isso permite a reutilização de código e a criação de uma hierarquia de classes.

Encapsulamento:
Encapsulamento é o processo de agrupar dados e métodos que operam sobre esses dados em uma única unidade ou classe, e esconder os detalhes internos do objeto dos usuários do objeto. Em Java, isso é feito usando modificadores de acesso (como private, protected e public). O encapsulamento melhora a modularidade e a segurança do código.

2. Funcionalidades da Linguagem Java
   Fortemente Tipada:
   Java é uma linguagem fortemente tipada, o que significa que todas as variáveis devem ser declaradas com um tipo específico e não podem mudar para um tipo diferente durante a execução do programa. Isso ajuda a detectar erros de tipo em tempo de compilação.

Máquina Virtual Java (JVM):
Java possui uma máquina virtual chamada JVM (Java Virtual Machine), que permite que o código Java seja executado em qualquer plataforma que tenha uma JVM. A JVM converte o bytecode em código de máquina nativo da plataforma.

Suporte ao Paradigma Orientado a Objetos:
Java é uma linguagem orientada a objetos, o que significa que ela suporta conceitos como classes, objetos, herança, polimorfismo, encapsulamento e abstração.

Suporte ao Paradigma Funcional:
Java também suporta o paradigma funcional desde a introdução das expressões lambda no Java 8. Isso permite que os desenvolvedores escrevam código mais conciso e expressivo.

3. Primeiro Nome do Java
   Antes de se chamar Java, a linguagem foi inicialmente nomeada Oak. O nome foi mudado para Java devido a questões de marca registrada.

4. Bytecode
   O código gerado pela compilação de um programa Java é chamado de bytecode. O bytecode é independente de plataforma e pode ser executado em qualquer sistema que tenha uma JVM.

5. Empresa Original
   A linguagem Java foi inicialmente desenvolvida e mantida pela Sun Microsystems. Em 2010, a Oracle Corporation adquiriu a Sun Microsystems e assumiu a manutenção da linguagem Java.

6. Linguagens que Influenciaram o Java
   Java é baseada em várias linguagens de programação, principalmente C e C++. A sintaxe de Java é fortemente inspirada por C++, mas Java removeu muitos recursos complexos e propensos a erros de C++.

7. Desenvolvedor Líder
   James Gosling é o desenvolvedor que liderou o projeto para a criação da linguagem Java. Ele é conhecido como o "Pai do Java".

8. JVM, JDK e JRE
   Para executar uma aplicação desenvolvida em Java, convertendo bytecode em código de máquina, é necessário ter disponível no sistema operacional o recurso denominado JVM (Java Virtual Machine). A JVM faz parte do JDK (Java Development Kit) e do JRE (Java Runtime Environment).

9. Execuções Paralelas
   O conceito de execuções paralelas em uma aplicação é chamado de multi-threading. Em Java, isso é implementado usando a classe Thread e a interface Runnable.

10. Popularidade do Java
    A linguagem Java se popularizou pelo conceito "Write Once, Run Anywhere" (Escreva uma vez, execute em qualquer lugar), que destaca a capacidade de interoperabilidade da plataforma Java. Isso significa que um programa Java pode ser executado em qualquer plataforma que tenha uma JVM, sem a necessidade de recompilação. Esse recurso foi um grande diferencial que contribuiu significativamente para a popularidade da linguagem.


  public class TestPolymorphism {

    public static void main(String[] args) {

      Animal myDog = new Dog();

      Animal myCat = new Cat();

      myDog.makeSound();

      myCat.makeSound();

    }

  }

  ```



### Funcionalidades da Linguagem Java



A linguagem Java oferece várias funcionalidades que a tornam robusta e versátil:



1. **Fortemente Tipada**: Java verifica os tipos de variáveis em tempo de compilação, o que reduz erros.

2. **Máquina Virtual Java (JVM)**: A JVM permite que o bytecode Java seja executado em qualquer sistema operacional que possua a JVM, garantindo a portabilidade.

3. **Suporte ao Paradigma Orientado a Objetos**: Java é construído em torno dos conceitos da orientação a objetos.

4. **Suporte ao Paradigma Funcional**: Desde o Java 8, a linguagem suporta programação funcional com lambdas e streams.



### História da Linguagem Java



#### Nome Original

Antes de ser chamada de Java, a linguagem foi inicialmente nomeada como **Oak**.



#### Bytecode

O código gerado pela compilação de um programa Java é chamado de **bytecode**. Este código é independente de plataforma e é executado pela JVM.



#### Sun Microsystems

A tecnologia Java foi originalmente desenvolvida e mantida pela **Sun Microsystems** antes de ser adquirida pela Oracle Inc.



#### Influências

Java é baseada nas linguagens de programação **C e C++**, combinando a familiaridade sintática do C++ com um modelo de gerenciamento de memória e segurança mais robusto.



#### James Gosling

O projeto Java foi liderado por **James Gosling**, que é considerado o pai da linguagem Java.



#### Execução de Aplicações Java

Para executar uma aplicação Java, é necessário que o sistema tenha a **JVM**, que pode ser obtida através do JDK (Java Development Kit) ou JRE (Java Runtime Environment).



#### Multi-threading

O conceito de execuções paralelas em uma aplicação é conhecido como **multi-threading**, permitindo a execução simultânea de múltiplas threads dentro de um programa Java.



#### Popularidade

A popularidade de Java foi amplamente impulsionada pelo conceito "Write Once, Run Anywhere" (Escreva uma vez, execute em qualquer lugar), que destaca a interoperabilidade e portabilidade da plataforma Java.



### Conclusão



Java é uma linguagem de programação poderosa e amplamente utilizada, graças à sua robustez, portabilidade e suporte a múltiplos paradigmas de programação. Os conceitos fundamentais da orientação a objetos, juntamente com suas características avançadas, fazem de Java uma escolha ideal para uma variedade de aplicações, desde desenvolvimento web até sistemas embarcados. O suporte contínuo da Oracle e a vasta comunidade de desenvolvedores garantem que Java continuará a evoluir e permanecer relevante no futuro.