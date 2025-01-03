## SISTEMA DE GERENCIAMENTO DE USUÁRIOS



#### INTRODUÇÃO: 
Um projeto com a inteção de criar uma API RESTful em Java para um sistema de gerenciamento de usuários.
O sistema permite que os usuários se registrem, façam login e realizem operações CRUD (Create, Read, Update, Delete) em seus perfis.
A API é protegida por JWT (JSON Web Tokens) para garantir que somente usuários autenticados possam realizar essas operações.


#### FERRAMENTAS USADAS:
###### IDE: Eclipse
###### Controle de Versão: Git
###### Hospedagem de Código: GitHub
###### Dependências Usadas: Maven, JUnit, Jupiter

#### TECNOLOGIAS USADAS: 
- Java versão: 17

- Link: https://www.oracle.com/java/technologies/downloads/

- Spring Boot versão: 2.5.4

- Spring Web versão: 5.3.9

- Spring Security versão: 5.5.1

- JPA Hibernate versão: 5.4.32

- Banco de Dados MySQL versão: 8.0

- Maven versão: 3.8.1

- Link: https://maven.apache.org/download.cgi

- JUnit 5 versão: 5.7.1

#### INSTRUÇOES DE INSTALAÇÃO: 
#### JAVA
1- Visite o site da Oracle
2- Escolha a versão do JDK 17
3- Clique no link de download ao lado da versão do sistema operacional.
4- Aceite o acordo de licença e siga as instruções

#### SPRING BOOT
1- Visite o site Spring Initializr
2- Configure seu projeto (escolha a versão do Spring Boot, nome do projeto, dependências, etc.)
3- Clique em "Generate" para baixar o projeto
4- Extraia o arquivo baixado e importe o projeto para a sua IDE

#### MSQL
1- Visite o site oficial do MySQL  https://www.mysql.com/
2- Clique em "Download" e escolha a versão apropriada para o seu sistema operacional
3- Siga as instruções na tela para instalar o MySQL
4- Configure um banco de dados e usuário para seu projeto



#### MAVEN
1- Visite o Site
2- Na seção “Apache Maven”, escolha a versão do Maven que corresponde ao seu sistema operacional
3- Clique no link de download ao lado da versão do sistema operacional
4- Siga as instruções na tela para instalar o Maven

#### jUnit Jupiter
```
 <dependencies>
    <dependency>
        <groupId>org.junit.jupiter</groupId>
        <artifactId>junit-jupiter-api</artifactId>
        <version>5.7.1</version>
        <scope>test</scope>
    </dependency>
</dependencies> 

```
1- Abra o arquivo pom.xml na IDE
2- Localize a seção dependencies no arquivo
3- Dentro da seção dependencies adicione o bloco de código acima
4- Salve o arquivo

#### RODANDO O PROJETO: 
1- Clone o reposiório 
-
2- Instale as dependências
```
mvn install
```
3- Execute os Testes
```
mvn test
```






