````java
int num = 5, count = 1;
    do{
        num += count;
        System.out.println(num);
    } while(count <= 3);
````
- O que será impresso no console?
- - Looping infinito

````java
String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
System.out.print(nomes.lenght);
````
- O que será impresso no console?
-  - 5

````java
public static void main(String[] args){
    for(int x=1; x<=10; x++){
        if(x % 2 == 0 ){
            System.out.println(x)
        }
    }
}
````
- O que será impresso no console?
- - 2 4 6 8 10

- As estruturas de repetição podem ser classificadas em:
- - Repetição com teste no início (while), Repetição com teste no final (do-while), Repetição contada (for)

````java
public static void main(String[] args){
    boolean condicao = false;
    
    while(condicao){
        System.out.println("executou")
    }
}
````

- O que será impresso no console?
- - Nunca imprime "executou"

````java
public static void main(String[] args){
    int numero = 1;
    
    for(int x=1; x<2; x++){
        numero = numero +x;
    }
    System.out.println("O valor de número é:" + numero);
}
````

- O que será impresso no console?
- - O valor de número é:2

Vamos analisar cada trecho de código e suas respectivas saídas:

### Primeiro Código

```java
int num = 5, count = 1;
do {
    num += count;
    System.out.println(num);
} while (count <= 3);
```

- **O que será impresso no console?**
- Resposta: Looping infinito.

Explicação: O valor de `count` nunca é incrementado dentro do laço `do-while`, então `count <= 3` sempre será verdadeiro, resultando em um looping infinito. O valor de `num` continua aumentando indefinidamente.

### Segundo Código

```java
String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
System.out.print(nomes.lenght);
```

- **O que será impresso no console?**
- Resposta: Este código contém um erro de sintaxe. O correto é `nomes.length` e não `nomes.lenght`.

Código correto:
```java
String[] nomes = {"Camila", "Venilton", "Leonardo", "Renan", "Rafael"};
System.out.print(nomes.length);
```
- Saída correta: 5

### Terceiro Código

```java
public static void main(String[] args) {
    for(int x = 1; x <= 10; x++) {
        if(x % 2 == 0) {
            System.out.println(x);
        }
    }
}
```

- **O que será impresso no console?**
- Resposta: 2 4 6 8 10

Explicação: O laço `for` itera de 1 a 10, imprimindo apenas os números pares (`x % 2 == 0`).

### Quarto Código

- **As estruturas de repetição podem ser classificadas em:**
- Resposta: Repetição com teste no início (while), Repetição com teste no final (do-while), Repetição contada (for)

### Quinto Código

```java
public static void main(String[] args) {
    boolean condicao = false;

    while(condicao) {
        System.out.println("executou");
    }
}
```

- **O que será impresso no console?**
- Resposta: Nunca imprime "executou".

Explicação: Como `condicao` é `false`, o corpo do laço `while` nunca será executado.

### Sexto Código

```java
public static void main(String[] args) {
    int numero = 1;

    for(int x = 1; x < 2; x++) {
        numero = numero + x;
    }
    System.out.println("O valor de número é:" + numero);
}
```

- **O que será impresso no console?**
- Resposta: O valor de número é: 2

Explicação: O laço `for` itera apenas uma vez (para `x = 1`), então `numero` é incrementado de 1, resultando em `numero = 2`.

Se tiver mais dúvidas ou precisar de mais alguma explicação, estou à disposição!