# Os quatros pilares da Orientação a objetos
- Encapsulamento: 
- - Nem tudo precisa estar visível
- - Ex: Para ligar o veículo exigi muitas etapas para a engenharia, mas para o condutor, só basta a ignição.
- Herança
- - Características e comportamentos comuns podem ser elevados e compartilhados através de uma hieraquia de objetos.
- - Ex: Um carro e uma moto possuem propriedades como placa, chassi e métodos como aceletar e frear. 
- - - Podemos desfrutar da herança criando uma classe Veiculo para que seja herdada por Carro e Moto.
- Abstração
- - Envolve a simplificação de um objeto complexo, destacando apenas os aspectos relevantes e ignorando os detalhes 
    desenecessário. A abstração é alcançada através das classes e interfaces.
- - Facilita a modelagem do mundo real, permitindo a concentração apenas no importante de um objeto.
- Polimorfismo
- - Permite que objetos de classes diferentes sejam tratados como objetos de uma classe comum. Podendo ocorrer em 
    dois tipos: polimorfismo de sobrecarga(métodos com o mesmo nome, mas parâmetros diferentes), e polimorfismo de 
    sobreposição (métodos com o mesmo nome e parâmetro, mas implementações diferentes nas classes)