```mermaid
classDiagram
    class Usuario {
        -String email
        -String nome
        -String login
        -String senha
    }

    class RegistrarUsuarioEndpoint {
        +POST /api/registrar-usuario(Usuario usuario): ResponseEntity<String>
    }

    class BuscarUsuarioEndpoint {
        +GET /api/usuario(String email): ResponseEntity<Usuario>
    }

    class ListarUsuariosEndpoint {
        +GET /api/todos-usuarios(): ResponseEntity<List<Usuario>>
    }

    class AtualizarPerfilEndpoint {
        +PUT /api/atualizar-perfil(Usuario usuario): ResponseEntity<Usuario>
    }

    class DeletarPerfilEndpoint {
        +DELETE /api/deletar-perfil(String email): ResponseEntity<String>
    }

    Usuario <-- RegistrarUsuarioEndpoint
    Usuario <-- BuscarUsuarioEndpoint
    Usuario <-- ListarUsuariosEndpoint
    Usuario <-- AtualizarPerfilEndpoint
    Usuario <-- DeletarPerfilEndpoint



    
    
    
```





-------------------------


## SISTEMA DE GERENCIAMENTO DE USUÁRIOS   👩🏻‍💻 👥
---------------------------------------------


#### INTRODUÇÃO: 
Um projeto com a inteção de criar uma API RESTful em Java para um sistema de gerenciamento de usuários.
O sistema permite que os usuários se registrem, façam login e realizem operações CRUD (Create, Read, Update, Delete) em seus perfis.
A API é protegida por JWT (JSON Web Tokens) para garantir que somente usuários autenticados possam realizar essas operações.

---------------------------------------------


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
-------------------------------------------------------------------------------------------

  #### FERRAMENTAS USADAS:
##### IDE: Eclipse
##### Controle de Versão: Git
##### Hospedagem de Código: GitHub
##### Programa de teste da API : Postman 

--------------------------------------------------------------------------------------------
#### DEPENDÊNCIAS USADAS: 
- Spring Web
- Spring Security
- Spring Data Jpa
- Maven
- jUnit

-------------------------------------------------------------------------------------------



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
1- Abra o arquivo pom.xml na IDE

2- Localize a seção dependencies no arquivo

3- Dentro da seção dependencies adicione o bloco de código acima

4- Salve o arquivo


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


------------------------------------------------------------------------------------------------
#### RODANDO O PROJETO: 

1- Clone o reposiório 
```
git clone https://github.com/AlbuquerqueRebeca/Gerenciamento-de-Usuario-2.git
```

2- Navegue até o diretório do projeto:
```
cd Gerenciamento-de-Usuario-2
```
  
3- Instale as dependências:
```
mvn install
```
3- Para iniciar execute:
```
mvn start

```

-----------------------------------------------------------------------------------------------------------------------

## Rotas da API
----------------------------------------------------------------------------------------------------------------------
| Método | URL                       | Descrição                   |
|--------|---------------------------|-----------------------------|
| POST   | api/registrar-usuarios    | Cria um novo Usuário        |
| GET    |  api/usuario?email=       | Busca usuário por email     |
| GET    | api/todos-usuarios        | Lista todos os usuários     |
| PUT    | api/atualizar-perfil      |  Atualiza perfil de usuario |
| POST   |  api/login                | Verifica os dados de usuario|
| DELETE | api/deletar-perfil?email= | Deleta perfil de usuário    |


--------------------------------------------------------------------------------------------------------------
#### TOKEN (JWT)

- Fazendo login
```
{ "username": "Rafaella",
 "password": "242526"
}
```

- Um token é gerado após a verificação de dados do usuário
```
{
    "token": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJyYWZhZWxsYSIsImlhdCI6MTczNjE5NDQ5Nn0.4XxnWYkEAhpH2QEndp1LaGa28ye7j9ISgt-Spswff75uSQ8c6Akq4V26JMofa8Gtsf0vwG413TDBGx4K6CJdPg"
}
```
##### Com o uso de Bearer Token e adicionando o token gerado, o usuário tem acesso a todas as rotas de autentição:
- Buscar usuário por email
- Listar todos os usuários
- Atualizar perfil
- Deletar perfil

----------------------------------------------------------------------------------------------------------------------------------------------------

#### REQUISIÇÕES

##### REGISTRO DE USUÁRIO: 
```
{   "email":   "Rafaella-Floriano@hotmail.com",
    "nome":   "Rafaella Floriano",
    "login":   "Rafaella",
    "senha":   "242526"
}
```

- Usuário registrado retorna um status HTTP 200 (Ok)
- Retornando a mensagem
```
Usuario registrado com sucesso!!!Rafaella Floriano
```

- Se houver um cadastro com mesmo email, retorna um status HTTP 400 (Bad Request)
- Retornando a mensagem 
  ```
  Esse email já existe!!
  ```
  ##### BUSCANDO USUÁRIO POR EMAIL:

  ```
  http://localhost:8080/api/usuario?email=Rafaella-Floriano@hotmail.com
  
  ```

   - Se o perfil de usuário for encontrado através do email, retorna um status HTTP 200 (OK)
  - Retornando o perfil de usuário com a senha codificada:


   ```
  {
    "email": "Rafaella-Floriano@hotmail.com",
    "nome": "Rafaella Floriano",
    "login": "rafaella",
    "senha": "$2a$10$Z.QpcrdER0DNsHD1vUF0aOCJaU4v/yCRHzKE65jSbsQ8AOzYz29TW"
  }
   ```

   - Se o email nao existir, retorna um status HTTP 404 (Not Found)
 
   ##### LISTAR TODOS OS USUÁRIOS

    - Usando o  Bearer Token com o token gerado, retorna um status 200 (OK)
      
    - O usuário consegue listar todos os outros usuários
  
     ```
    {
        "email": "aylla-rocha@hotmail.com",
        "nome": "Aylla Rocha",
        "login": "aylla",
        "senha": "$2a$10$qjYXMqQYuavJxR9BUPhH6uFA/w3TeCyrWC3DXXj1CpZsXu.sDfNpW"
    },
    {
        "email": "benjamin-oliveira@hotmail.com",
        "nome": "Benjamin Oliveira",
        "login": "bejnamin",
        "senha": "$2a$10$ZD7NQflsIqCcF9AtLFNfwuy4/m.3YFcip765bHgDAZv1gQGcsZEC."
    },
    {
        "email": "bob-albuquerque@hotmail.com",
        "nome": "Bob Guanaes Albuquerque",
        "login": "bob",
        "senha": "$2a$10$CW3waWv61DoDS14LRniFHeS6BST2iKXGO9xG6u6tec5X0sR526AXi"
    },
    {
        "email": "caio-nunes@hotmail.com",
        "nome": "Caio Nunes",
        "login": "caio",
        "senha": "$2a$10$FVhQlkIDXo5eUXxShalCVuI6wyOedhv/JIU41.DT0uhxD9VGk9HNO"
    },
    {
        "email": "catarina-fontenelle@hotmail.com",
        "nome": "Catarina Fontenelle",
        "login": "catarina",
        "senha": "$2a$10$CxTC6FPa90AsrL3hYk9HYODUZ1spN49WyZyIpX3tISpkkB5LdtuHO"
    },
    ```
   
   ##### ATUALIZAR PERFIL

   - Usando o Bearer Token e adicionando o token gerado, o usuário consegue atualizar qualquer dado do seu perfil
  ```
  {   "email":   "Rafaella-Floriano@hotmail.com",
    "nome":   "Rafaella Floriano",
    "login":   "Rafaella",
    "senha":   "242526"
  }

    ```

- Após adicionar o token o login foi alterado, retornando um status HTTP 200 (OK)
- 
- Retornando perfil alterado
  
 ```
{
    "email": "Rafaella-Floriano@hotmail.com",
    "nome": "Rafaella Floriano",
    "login": "Rafa",
    "senha": "242526"
}
 ``` 
##### DELETAR PERFIL

- Usando o email para buscar e deletar o perfil
-  Perfil encontrado retorna um status 200 (OK) deletando o perfil com sucesso 
 ```
http://localhost:8080/api/deletar-perfil?email=Rafaella-Floriano@hotmail.com
 ```
```
Perfil deletado com sucesso!!!
```
- Se o perfil não for encontrado retorna um status 404 (Not Found)
----------------------------------------------------------------------------------------

#### TESTE UNITÁRIO

1- Validando se a requisição registro de usuario está de fato criando um novo usuário
```
//Registrando usuario
	@Test
	void salvandoUsuario() { 
	Usuario usuario = new Usuario(); 	
	usuario.setEmail("Rafaella-Floriano@hotmail.com"); 
	usuario.setNome("Rafaella Floriano"); 
	usuario.setLogin("Rafaella"); 
	usuario.setSenha("24294"); 
	
	
	usuarioService.registrandoUsuario(usuario); 
	
	assertEquals("Rafaella-Floriano@hotmail.com", usuario.getEmail(), "Email salvo com sucesso!!");
	assertEquals("Rafaella Floriano", usuario.getNome(), "Nome de usuario salvo com sucesso!!");
	assertEquals("Rafaella", usuario.getLogin(), "Login salvo com sucesso!!"); 
	
	assertTrue(passwordEncoder.matches("24294", usuario.getSenha()),"Senha codificada com sucesso"); 

		
	}
	
  ```

 2-  Validando se a requisição listar todos está de fato buscando o perfil de usuario através do email
  ```
  //Buscando usuario por email
	@Test
	void buscandoUsuario() { 
	String email = "Rafaella-Floriano@hotmail.com";
	Optional<Usuario> usuario = usuarioService.buscandoUsuario(email); 
	assertTrue(usuario.isPresent(), "Usuario encontrado"); 
		
	}
   ```

3- Validando se a requisição atualizar perfil está de fato atualizando o perfil de usário 

```
//Atualizando perfil de usuario
	
	@Test
	void atualizandoPerfil() { 
	Usuario usuario = new Usuario();
	usuario.setEmail("Rafaella-Floriano@hotmail.com"); 
	usuario.setNome("Rafaella Floriano"); 
	usuario.setLogin("Rafaella"); 
	usuario.setSenha("24294"); 
	
	usuario.setLogin("Rafaella");
	
	usuarioService.atualizandoPerfil(usuario); 
	
	Usuario perfilAtualizado = usuarioService.buscandoUsuario("Rafaella-Floriano@hotmail.com")
			.orElseThrow(() -> new RuntimeException("Usuario não encontrado")); 
			
			assertEquals("Rafaella", perfilAtualizado.getLogin() , "Login atualizado com sucesso!!"); 
			System.out.println("Perfil atualizado com sucesso!!!!!");
		
	  }

  ```

4-  Validando se a requisiçao deletar perfil está de fato deletando perfil de usuário através do email

```
 @Test
	 void deletandoPerfil() { 
	 Usuario usuario = new Usuario();
	 usuario.setEmail("Rafaella-Floriano@hotmail.com"); 
	 usuario.setNome("Rafaella Floriano"); 
	 usuario.setLogin("Rafaella"); 
	 usuario.setSenha("24294");
	 
	 
	 usuarioService.buscandoUsuario(usuario.getEmail()); 
	 
	 Optional<Usuario> deletarUsuario = usuarioService.buscandoUsuario(usuario.getEmail());
	 assertTrue(deletarUsuario.isEmpty(), "Perfil deletado com sucesso"); 
	 
	 System.out.println("Perfil deletado com sucesso!!!");
		 
	 }
	

```

---------------------------------------------------------------------------------------------------------------------

#### CONCLUSÃO

Este projeto é uma aplicação onde o usuário é capaz de criar uma nova conta com dados básicos (email, nome e senha). Os usuários devem fazer login em suas contas usando suas credenciais, e todas as senhas são codificadas. Após o login e a verificação dos dados, eles receberão um token JWT que será usado para autenticar suas solicitações.

Os usuários autenticados serão capazes de visualizar, atualizar e deletar seus perfis.

Apesar de ser uma aplicação simples, este projeto foi essencial para praticar meus conhecimentos até aqui, incluindo Spring Web, Spring Security, banco de dados relacional, Maven e testes unitários.





