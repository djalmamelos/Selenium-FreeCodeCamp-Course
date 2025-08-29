# 🧪 Selenium FreeCodeCamp Course

Este repositório contém os códigos e exemplos desenvolvidos durante o curso de **Selenium com Java** do FreeCodeCamp.  
O projeto está organizado seguindo o padrão **Page Object Model (POM)** e dividido em **partes** (Part1, Part2, Part3 e Part4), representando a evolução do aprendizado com diferentes aplicações: **SauceDemo** e **DemoQA**.  

---

## 🚀 Tecnologias Utilizadas
- [Java 11+](https://www.oracle.com/java/technologies/downloads/)  
- [Selenium WebDriver](https://www.selenium.dev/)  
- [JUnit 5](https://junit.org/junit5/) ou [TestNG](https://testng.org/doc/)  
- [Maven](https://maven.apache.org/)  
- [Git](https://git-scm.com/)  

---

## 📂 Estrutura do Projeto

### **Código Fonte (`src/main/java`)**
```bash
src/main/java/com/
├── base/                     # Classe base (BasePage)
│   └── BasePage.java
│
├── demoqa.pages/             # Page Objects do site demoqa.com
│   ├── Alerts_Frames_Windows/
│   ├── elements/
│   ├── forms/
│   ├── widgets/
│   └── HomePage.java
│
├── saucedemo.pages/          # Page Objects do site saucedemo.com
│   ├── LoginPage.java
│   └── ProductsPage.java
│
└── utilities/                # Classes utilitárias
    ├── ActionsUtility.java
    ├── DropDownUtility.java
    ├── GetUtility.java
    ├── JavaScriptUtility.java
    ├── SwitchToUtility.java
    ├── Utility.java
    └── WaitUtility.java
```

### **Testes (`src/test/java`)**
```bash
test/java/
├── Part1/                                # Primeiros testes simples
│   ├── FirstSeleniumTest.java
│   └── LogInShouldFail.java
│
├── Part2.com.saucedemo/                  # Testes do SauceDemo
│   ├── base/
│   │   └── BaseTest.java
│   └── tests/
│       ├── login/
│       │   └── LoginTest.java
│       └── products/
│           └── ProductsTest.java
│
└── Part3_4.com.demoqa/                   # Testes do DemoQA
    ├── base/
    │   └── BaseTest.java
    └── test/
        ├── part3/
        │   ├── elements/
        │   ├── forms/
        │   ├── javascript/
        │   └── widgets/
        └── part4/
            ├── Alerts/
            ├── Alerts_Frame_Widows.Modal/
            ├── dynamic_wait/
            ├── frames/
            ├── interactions/
            └── modals/
```

---

## 🏗️ Principais Componentes

### 🔹 BasePage
- Centraliza métodos genéricos (`find`, `click`, `set`, `waits`)  
- Facilita o reaproveitamento de código nas páginas  
- Segue o padrão **Page Object Model (POM)**  

### 🔹 BaseTest
- Classe de inicialização e finalização do **WebDriver**  
- Garante ambiente de execução consistente para os testes  

### 🔹 Page Objects
- Representação das páginas web (camada de abstração)  
- Exemplos:
  - `LoginPage.java` e `ProductsPage.java` → **SauceDemo**  
  - `HomePage.java` e demais → **DemoQA**  

### 🔹 Utilities
- Funções auxiliares reutilizáveis:
  - `ActionsUtility` → drag & drop, hover etc.  
  - `DropDownUtility` → selects  
  - `WaitUtility` → espera explícita  
  - `JavaScriptUtility` → execução de JS  
  - Outros helpers  

---

## 🧪 Estrutura de Testes

- **Part1:** primeiros testes básicos com Selenium  
  - `FirstSeleniumTest`  
  - `LogInShouldFail`  

- **Part2 (SauceDemo):**  
  - `LoginTest` → autenticação  
  - `ProductsTest` → fluxo de produtos  

- **Part3 e Part4 (DemoQA):**  
  - Testes para **elements, forms, widgets, alerts, frames, modals, waits e interações**  

---

## ⚙️ Como Executar

### 1. Clonar o repositório
```bash
git clone https://github.com/djalmamelos/Selenium-FreeCodeCamp-Course.git
cd Selenium-FreeCodeCamp-Course
```

### 2. Instalar dependências
```bash
mvn clean install
```

### 3. Executar os testes
```bash
mvn test
```

---

## 📌 Objetivo do Repositório
- Consolidar conhecimento em **Selenium com Java**  
- Praticar boas práticas de automação (Page Object Model, reutilização de código, waits explícitos)  
- Estruturar testes em diferentes aplicações:  
  - [SauceDemo](https://www.saucedemo.com/)  
  - [DemoQA](https://demoqa.com/)  
- Evoluir progressivamente com exemplos de fácil entendimento até cenários mais avançados  

---

## 🤝 Contribuições
Este repositório é voltado para estudos pessoais, mas contribuições são bem-vindas.  
Abra uma **issue** ou envie um **pull request**.  

---

## 📄 Licença
Este projeto está sob a licença MIT.  
