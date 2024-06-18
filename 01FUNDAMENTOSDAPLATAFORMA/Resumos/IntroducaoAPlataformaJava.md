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

### Os Pilares da Orientação a Objetos



A orientação a objetos é um paradigma de programação que se baseia em conceitos que permitem a criação de sistemas complexos de maneira organizada e modular. Os quatro pilares fundamentais desse paradigma são:



1. **Abstração**:

A abstração permite que os desenvolvedores criem modelos simplificados da realidade. Em Java, isso é realizado através de classes e interfaces que definem o comportamento e as propriedades essenciais dos objetos, escondendo os detalhes desnecessários.



  ```java

  abstract class Animal {

    abstract void makeSound();

  }



  class Dog extends Animal {

    @Override

    void makeSound() {

      System.out.println("Woof");

    }

  }

  ```



2. **Encapsulamento**:

O encapsulamento é a prática de esconder os detalhes internos de um objeto e expor apenas o que é necessário através de métodos públicos. Isso melhora a modularidade e a segurança do código.



  ```java

  class Person {

    private String name;

    private int age;



    public String getName() {

      return name;

    }



    public void setName(String name) {

      this.name = name;

    }



    public int getAge() {

      return age;

    }



    public void setAge(int age) {

      if (age > 0) {

        this.age = age;

      }

    }

  }

  ```



3. **Herança**:

A herança permite que uma classe herde propriedades e métodos de outra classe. Isso promove a reutilização de código e a criação de hierarquias de classes.



  ```java

  class Animal {

    void eat() {

      System.out.println("This animal eats food");

    }

  }



  class Cat extends Animal {

    void meow() {

      System.out.println("Meow");

    }

  }

  ```



4. **Polimorfismo**:

O polimorfismo permite que objetos de diferentes classes sejam tratados como objetos da mesma classe através de uma interface comum. Isso é útil para a implementação de comportamentos específicos em subclasses sem alterar o código que as utiliza.



  ```java

  class Animal {

    void makeSound() {

      System.out.println("Some sound");

    }

  }



  class Dog extends Animal {

    @Override

    void makeSound() {

      System.out.println("Woof");

    }

  }



  class Cat extends Animal {

    @Override

    void makeSound() {

      System.out.println("Meow");

    }

  }



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