# Java POO
- POO 
- - Paradigma de programação baseada no conceito de "objetos", podem conter dados conhecidos como atributos e 
    procedimentos conhecimos como métodos.

- Classes
- - A estrutura que direciona a criação dos objetos de mesmo tipo.
- Identificador 
- - O propósito pela qual ela foi criada.
- Atributos (Características)
- - É toda informação que representa o estado do objeto.
- Métodos (comportamentos) 
- - É toda parte comportamental que um objeto dispõe.
- Instanciar (new) 
- - É o ato de criar um objeto a partir de estrutura definida em uma classe.

## Seguindo algumas convenções
- Classe de modelo (model): 
- - Sãoo classes que representam estrutura de domínio da aplicação, EX: Cliente, Pedido, Nota Fiscal.
- Classe de serviço (service):
- - Classes que contém regras de negócios e validação de nosso sistema.
- Classe de repositório (repository): 
- - Classes que contém uma integração com banco de dados.
- Classe de controle (controller):
- - Classes que possuem a finalidade de disponibilizar alguma comunicação externa à nossa aplicação, tipo http web 
    ou webservices.
- Classe utilitária (util) classe que contém recursos comuns à toda nossa aplicação.
- ![img.png](img.png)
- ![img_1.png](img_1.png)

# Pacotes
- Model
- - Classes que representam a camada e modelo da aplicação
- Repository
- - Classes ou interfaces que possuem a finalidade de interagir com tabelas no banco de dados: ClienteRepository
- Service
- - Classes que contém regras de negócio do sistema: ClienteService
- - possui o método validar o CPF do cliente cadastrado
- Controller
- - Classes que possuem a finalidade de disponibilizar os nossos recursos da aplicação para outras aplicações vida 
    padrão HTTP
- View 
- - Classes que possuem alguma interação com a interface gráfica acessada pelo usuário
- util
- - Pacote que contém classes utilitárias dos sistema: Validadorutil
