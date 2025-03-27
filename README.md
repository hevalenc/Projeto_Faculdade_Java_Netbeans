# SISEMA DE GESTÃO UNIVERSITÁRIO

Programa para gestão acadêmica onde serão cadastrados os alunos, os professores, os cursos e as disciplinas com todas as informações necessárias.

O programa foi elaborado em camadas e seguiu o padrão de arquitetura MVC (Model-View-Controller), permitindo a melhor estruturação dos arquivos e permitindo o reuso dos códigos visando reduzir as linhas de programação e ter um melhor controle para revisão e atualização dos códigos.

O programa foi desenvolvido em **Java**, utilizando a IDE NetBeans. Todos os dados foram armazenados no banco de dados **PostgreSQL**.

![image](https://github.com/user-attachments/assets/6b86e6b4-1797-4d7f-b48a-2d2b03767bdb)

## Modelo (Model)

Os arquivos contidos nesta pasta são utilizados para estruturar os objetos que serão instanciados no programa para o cadastro dos alunos, professores, cursos e disciplinas. Utilizado também para estruturar os dados que serão utilizados em uma tabela.

## Controle (Controller)

Os arquivos contidos nesta pasta são utilizados para fornecer as funções necessárias para salvar, editar, pesquisar, excluir, ou seja, manipular os dados. Tem um arquivo que fornece os comandos para conectar o software desenvolvido com o banco de dados PostgreSQL.

## Telas (View)

Os arquivos contidos nesta pasta são utilizados para a criação das telas.

### Tela Principal da Aplicação

![image](https://github.com/user-attachments/assets/e804e346-24b7-400d-a40b-44d5f1d1530d)

### Tela de Cadastro de Aluno

![image](https://github.com/user-attachments/assets/c974cbb9-503e-4f97-a1c8-da0a2f580bad)

### Tela de Cadastro do Curso

![image](https://github.com/user-attachments/assets/28e11500-2d55-4077-861d-05238f5e7a7c)

### Tela de Cadastro da Disciplina

![image](https://github.com/user-attachments/assets/cdfe7e0b-cec7-412f-9e0e-9b120b49ee2d)

### Tela de Cadastro do Professor

![image](https://github.com/user-attachments/assets/e72deda4-56c3-4506-8c8f-59f6c0fa4e9b)

### Tela de Consular Disciplinas por Aluno

![image](https://github.com/user-attachments/assets/0812028d-5177-45ab-982a-5e667e8386d0)

### Tela de Consultar Disciplinas por Professor

![image](https://github.com/user-attachments/assets/3e0608f0-914b-4baa-b0d6-3d8b52f17cc4)

## Experiência com o desenvolvimento

Este projeto foi um grande desafio para mim. Primeiramente eu tinha pouca familiaridade com a linguagem Java e tinha feito um bootcamp em programação Kotlin utilizando interface gráfica, esta experiência serviu de base para utilizar a IDE Netbeans.

Como já fiz vários cursos de programação em outras linguagens como JavaScript, C#, Python e outras, utilizei este conhecimento para desenvolver o meu programa em Java.

A interface Swing é fácil de trabalhar visualmente, porém tem uma grande complexidade para utilizar algumas funções como o JTable.

Outra dificuldade foi conectar o banco de dados PostgrSQL com o programa, por ser algo novo para mim. Para me ajudar, fiz um curso na plataforma da Digital Innovation One que tem o foco em JDBC e JPA, li diversos documentos na internet e vi diversos tutoriais no youtube.

Fiz o bom uso dos documentos e tutoriais disponíveis nos sites da PostgreSQL, Oracle, Apache Netbeans e Devmedia.
