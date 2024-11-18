# ✅ Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway
### ✅ Publishing Your REST API to the Cloud Using Spring Boot 3, Java 17, and Railway

### Como usar:  
### How to use:
```
Projeto Funcionando somente com H2 DataBase
Project Working Only with H2 Database

Projeto dando Erro no PostgreSQL
Project Giving Error in PostgreSQL
```

## 📋 Linguagem usada : (Language used)
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white)

## 📋 Framework usada : (Framework used)
![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)

## 📋 Dependencias usadas : (Dependencies used)
![Swagger](https://img.shields.io/badge/-Swagger-%23Clojure?style=for-the-badge&logo=swagger&logoColor=white)

- JPA Repository
- H2 Data Base
- Spring Web
- PostgreSQL (error)

## 🕹 Gerenciador: (Package manager)
![Apache Maven](https://img.shields.io/badge/Apache%20Maven-C71A36?style=for-the-badge&logo=Apache%20Maven&logoColor=white)

## 💻 IDE Usada para Cria-lo: (IDE used to create it)
<img alt="IntelliJ IDEA" src="https://img.shields.io/badge/IntelliJIDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white"/>

## 💬  Contatos: (Contacts)
![LinkedIn](https://img.shields.io/badge/linkedin-%230077B5.svg?style=for-the-badge&logo=linkedin&logoColor=white)   ![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

[Meu LinkedIn](<www.linkedin.com/in/amrocha1>) ---  [Meu GitHub](<https://github.com/amrocha1>)

## 👨‍💻 Tecnologias Uteis: (Useful Technologies)
![Git](https://img.shields.io/badge/git-%23F05033.svg?style=for-the-badge&logo=git&logoColor=white)

![GitHub](https://img.shields.io/badge/github-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)

### ![Dev.to blog](https://img.shields.io/badge/dev.to-0A0A0A?style=for-the-badge&logo=dev.to&logoColor=white)  [@amrocha1](https://www.linkedin.com/in/amrocha1/)


## Diagrama de Classes

```mermaid
classDiagram
    class User {
        +String name
        +Account account
        +List~Feature~ features
        +List~News~ news
        +Card card
    }

    class Account {
        +String number
        +String agency
        +double balance
        +double limit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String number
        +double limit
    }

    class News {
        +String icon
        +String description
    }

    User "1" *--> "1" Account 
    User "1" *--> "N" Feature
    User "1" *--> "1" Card 
    User "1" *--> "N" News 
```
