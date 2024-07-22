- É a matriz onde encotramos a pilha de execução da execução
- - Stack Trace
- Como podemos usar o modo de Debug na IDE Intellij?
- - Executar o programa na opção "Debug as".
- Nome da view onde é exibido as variáveis
- - Variables
- Para indicar o ponto de parada para fazer o Debug, usamos:
- - Breakpoints
- "Debugar o código" significa:
- - Depurar o código
- Evaluate Expression
- - Ferrameta para provê acabamento de código como no editor, desta maneira é muito fácil introduzir qualquer expressão.
- Qual a principal funcionalidade da ferramenta de Debug?
- - Depurar a execução linha a linha do programa.
- Pilha de execução
- - Toda invocação de método é empilhada em uma estrutura de dados que isola a área de memória de cada um.
- Atalhos
- - Debug (Shift+f9) - Step Over(f8) - Step into (f7)
- Para interromper o Debug e fazer com que a execução prossiga até o final ou próximo breakpoint no Intellij:
- - Resume Program (f9)

## Introdução ao Debugging em Java

Debugging é uma prática essencial na programação que permite aos desenvolvedores inspecionar a execução de um programa, identificar e corrigir erros (bugs). Utilizar ferramentas de debug corretamente pode aumentar significativamente a eficiência no desenvolvimento e manutenção de software. Neste artigo, vamos explorar os conceitos fundamentais do debugging em Java, com foco na utilização da IDE IntelliJ IDEA, uma das mais populares entre os desenvolvedores Java.

## O Que é Debugging?

Debugging, ou depuração, é o processo de execução de um programa em um ambiente controlado para identificar e corrigir bugs. Isso inclui examinar a execução linha a linha, inspecionar variáveis, pilha de execução e fluxos de controle, entre outras coisas.

## Conceitos Fundamentais

### Stack Trace

O Stack Trace é a matriz onde encontramos a pilha de execução durante a execução de um programa. Ele fornece uma visão das chamadas de método que levaram a um ponto específico no código, geralmente onde ocorreu uma exceção. É uma ferramenta vital para identificar onde e por que um erro ocorreu.

### Pilha de Execução

A pilha de execução é uma estrutura de dados que armazena informações sobre as chamadas de métodos em execução no programa. Cada vez que um método é chamado, uma nova entrada (ou frame) é empilhada, e cada vez que um método retorna, a entrada correspondente é desempilhada. Isso permite isolar a área de memória de cada método e acompanhar a sequência de chamadas.

### Breakpoints

Breakpoints são marcadores que você pode definir em linhas específicas de código para pausar a execução do programa. Quando a execução atinge um breakpoint, a execução é interrompida, permitindo que você inspecione o estado do programa naquele ponto.

### Variables View

A "Variables View" é a visualização na IDE onde são exibidas as variáveis e seus valores atuais. Isso permite que você veja e, em muitos casos, modifique os valores das variáveis durante a execução do programa.

### Evaluate Expression

A ferramenta "Evaluate Expression" permite avaliar expressões durante a depuração, fornecendo acabamentos de código similares ao editor. Isso facilita a introdução de expressões, permitindo testar e verificar comportamentos de código em tempo real.

## Utilizando o Modo de Debug na IntelliJ IDEA

### Executando o Programa em Modo de Debug

Para iniciar a depuração no IntelliJ IDEA, você pode executar seu programa na opção "Debug". Isso pode ser feito clicando no ícone de bug ao lado do ícone de execução ou utilizando o atalho `Shift+F9`.

### Atalhos de Debug

- **Debug**: `Shift+F9`
- **Step Over**: `F8` - Avança para a próxima linha de código, ignorando chamadas de método.
- **Step Into**: `F7` - Entra dentro de um método chamado na linha atual, permitindo ver sua execução linha a linha.
- **Step Out**: `Shift+F8` - Sai do método atual e retorna ao chamador.
- **Resume Program**: `F9` - Continua a execução do programa até o próximo breakpoint ou até o final.

### Usando Breakpoints

Para definir um breakpoint, clique na margem esquerda da linha de código onde deseja pausar a execução. Um círculo vermelho indica a presença de um breakpoint. Você pode adicionar quantos breakpoints forem necessários para inspecionar diferentes partes do seu código.

### Visualizando Variáveis

Durante a depuração, a "Variables View" exibe as variáveis locais e seus valores. Isso é crucial para entender o estado atual do programa e como as variáveis estão mudando ao longo do tempo.

### Ferramenta "Evaluate Expression"

A ferramenta "Evaluate Expression" (`Alt+F8`) permite avaliar expressões em tempo real, facilitando a introdução de expressões complexas e a inspeção de valores e comportamentos durante a execução do programa.

## Principal Funcionalidade do Debug

A principal funcionalidade do debug é permitir a depuração da execução linha a linha do programa. Isso envolve pausar a execução em breakpoints, inspecionar e modificar variáveis, e entender o fluxo de controle do programa. Com essa funcionalidade, os desenvolvedores podem identificar rapidamente onde os erros ocorrem e quais são as causas subjacentes.

## Conclusão

O debugging é uma habilidade essencial para qualquer desenvolvedor de software. Compreender e utilizar efetivamente as ferramentas de debug, como as oferecidas pela IntelliJ IDEA, pode transformar a maneira como você desenvolve, testa e mantém seu código. Praticar a depuração regularmente ajudará a desenvolver um entendimento mais profundo do seu código e a resolver problemas de maneira mais eficiente.