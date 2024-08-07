- @Captor
- - Essa anotação permite capturar argumentos de uma chamada utilizando Mockito
- @Mock
- - É usado na classe que desejamos "mockar", quando queremos criar um mock.
- @InjectMocks
- - Utilizamos para injetar esse mock na classe que estamos testando.
- Quando queremos dizer ao Mockito que qualquer String que for passada em Método x() o objeto Mockado deve retornar 
  algum valor, utilizamos:
- - when(objectoMockado.x(anyString())).thenReturn(valor);
- mockito-inline
- - É a dependência que permite fazer testes de métodos estáticos.
- @Spy
- - É a anotação utilizada no Mockito para criar instância mais real na qual podemos chamar métodos e validar o 
    comportamento da mesma fazendo verificações.
- verify(objetoMockado, times(2)).size();
- - É a instrução que apresenta uma verificação de que um método foi chamado duas vezes.
- when(objetoMockado.chamaUmMetodo().thenThrow(NullPointerException.class);
- - É a intrução que é usada para retornar uma exception no Mockito
- Utilizamos mocks quando...
- - Queremos obter respostas esperadas de objetos que compôes nossos testes mas sem necessariamente utilizar de 
    algum recurso. Ex: chamadas para APIs, Bandos de Dados.
- ExtendWith(MockitoExtension.class)
- - É a configuração via anotação necessária para fazer testes usando Mockito de forma integrada ao JUnit.
- Mockito.when(objeto.chamaUmMetodo()).thenReturn(2)
- - É a instrução usada para criar um retorno manipulado em um mock?