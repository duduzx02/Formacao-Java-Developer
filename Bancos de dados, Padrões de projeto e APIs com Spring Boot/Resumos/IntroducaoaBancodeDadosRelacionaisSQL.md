1 - Qual tipo de join é utilizado para combinar registros de duas tabelas apenas quando houver correspondência entre as
chaves?

- INNER JOIN
  2 - Na modelagem de dados relacionais, a cardinalidade representa:
- O número de ocorrências entre as entidades em um relacionamento.
  3 - Qual tipo de join é utilizado para tetornar todos os registros das duas tabelas, mesmo que não haja
  correspondência entre as chaves?
- FULL JOIN
  4 - Quais são algumas das formas normais utilizadas na normalização de dados?
- 1NF, 2NF E 3NF
  5 - O que é normalização de dados em um banco de dados relacional?
- Processo de eliminar redundâncias e inconsistências nos dados.,
  6 - Qual é o conceito principal dos bancos de dados relacionais?
- Armazenamento de dados em tabelas.
  7 - Qual é o objetivo principal da utilização de chaves primárias em uma tabela?
- identificar registros exclusivos de uma tabela.
  8 - Quais são as consultas utilizadas para combinar dados de várias tabelas em um banco de dados relacional?
- INNER JOIN, RIGHT JOIN E LEFT JOIN
  9 - O que são subconsultas em um banco de dados relacional?
- Consultas aninhadas dentro de outras consultas.
  10 - Qual tipo de join é utilizado para retornar todos os registros da tabela da esquerda e os registros
  correspondentes da tabela da direita, mesmo que não haja correspondência entre as chaves?
- LEFT JOIN

# Conceitos Fundamentais de Bancos de Dados Relacionais

Os bancos de dados relacionais são a espinha dorsal da maioria dos sistemas de gerenciamento de dados modernos. Através
de conceitos como tabelas, chaves primárias, normalização e joins, eles proporcionam uma maneira eficiente e organizada
de armazenar, recuperar e gerenciar dados. Este artigo abordará os principais conceitos de bancos de dados relacionais,
incluindo tipos de joins, modelagem de dados, normalização e consultas.

## Tipos de Joins

Joins são operações que permitem combinar registros de duas ou mais tabelas com base em uma condição de correspondência.
Abaixo estão os principais tipos de joins utilizados em bancos de dados relacionais:

1. **INNER JOIN**: Utilizado para combinar registros de duas tabelas apenas quando há correspondência entre as chaves.
   Apenas os registros que atendem à condição de junção são retornados.
    ```sql
    SELECT * FROM tabela1
    INNER JOIN tabela2 ON tabela1.chave = tabela2.chave;
    ```

2. **FULL JOIN**: Retorna todos os registros das duas tabelas, mesmo que não haja correspondência entre as chaves. Se
   não houver correspondência, os campos das tabelas que não têm dados correspondentes serão preenchidos com NULL.
    ```sql
    SELECT * FROM tabela1
    FULL JOIN tabela2 ON tabela1.chave = tabela2.chave;
    ```

3. **LEFT JOIN**: Retorna todos os registros da tabela da esquerda e os registros correspondentes da tabela da direita,
   mesmo que não haja correspondência entre as chaves. Se não houver correspondência, os campos da tabela da direita
   serão preenchidos com NULL.
    ```sql
    SELECT * FROM tabela1
    LEFT JOIN tabela2 ON tabela1.chave = tabela2.chave;
    ```

4. **RIGHT JOIN**: Retorna todos os registros da tabela da direita e os registros correspondentes da tabela da esquerda,
   mesmo que não haja correspondência entre as chaves. Se não houver correspondência, os campos da tabela da esquerda
   serão preenchidos com NULL.
    ```sql
    SELECT * FROM tabela1
    RIGHT JOIN tabela2 ON tabela1.chave = tabela2.chave;
    ```

## Modelagem de Dados Relacionais

A modelagem de dados relacionais envolve a criação de um esquema de banco de dados que reflete as necessidades de uma
aplicação específica. Um conceito fundamental nesta modelagem é a **cardinalidade**, que representa o número de
ocorrências entre as entidades em um relacionamento. Por exemplo, em um relacionamento de um para muitos, uma ocorrência
de uma entidade está relacionada a muitas ocorrências de outra entidade.

## Normalização de Dados

A normalização é o processo de organizar os dados em um banco de dados para reduzir a redundância e melhorar a
integridade dos dados. As formas normais são um conjunto de regras que ajudam a atingir esses objetivos. As três
primeiras formas normais (1NF, 2NF e 3NF) são as mais comumente utilizadas:

1. **Primeira Forma Normal (1NF)**: Elimina grupos repetidos e garante que cada coluna contenha apenas valores atômicos.
2. **Segunda Forma Normal (2NF)**: Além de estar em 1NF, remove dependências parciais, onde uma coluna não-chave depende
   apenas de parte da chave primária.
3. **Terceira Forma Normal (3NF)**: Além de estar em 2NF, remove dependências transitivas, onde colunas não-chave
   dependem de outras colunas não-chave.

## Chaves Primárias

As **chaves primárias** são um conceito essencial em bancos de dados relacionais. Elas são utilizadas para identificar
de forma única cada registro em uma tabela. Cada tabela deve ter uma chave primária, que pode ser uma única coluna ou
uma combinação de colunas. A utilização de chaves primárias garante a integridade dos dados e facilita a realização de
operações de junção.

## Consultas e Subconsultas

Consultas são instruções SQL que permitem recuperar dados de um banco de dados. Quando há a necessidade de combinar
dados de várias tabelas, os joins são utilizados. Além dos joins, outro conceito importante são as **subconsultas**, que
são consultas aninhadas dentro de outras consultas. Subconsultas permitem realizar consultas complexas e são
frequentemente usadas em instruções WHERE para filtrar dados com base em resultados de outra consulta.

```sql
SELECT * FROM tabela1
WHERE chave IN (SELECT chave FROM tabela2 WHERE condicao);
```

## Conclusão

Os bancos de dados relacionais são uma ferramenta poderosa para a gestão de dados. Compreender os tipos de joins, a
modelagem de dados, a normalização e as consultas é essencial para trabalhar eficientemente com esses sistemas. Dominar
esses conceitos permitirá que você crie bancos de dados robustos, eficientes e escaláveis, capazes de atender às
necessidades das aplicações mais exigentes.