# MeuAppAndroid

Aplicativo Android moderno desenvolvido usando as melhores práticas e tecnologias atuais: Jetpack Compose, MVVM, Retrofit, Coroutines e Koin para injeção de dependência.

---

## Tecnologias utilizadas

- **Kotlin** — Linguagem principal do projeto  
- **Jetpack Compose** — Framework para UI declarativa e reativa  
- **MVVM (Model-View-ViewModel)** — Arquitetura para separação de responsabilidades  
- **Retrofit** — Biblioteca para chamadas HTTP/REST  
- **Coroutines** — Para programação assíncrona e concorrente  
- **Koin** — Framework leve para injeção de dependência  
- **StateFlow** — Para gerenciamento reativo do estado da UI  

---

## Funcionalidades

- Consumo de API REST para listar usuários (ou itens fictícios, etc)  
- Interface responsiva e moderna com Jetpack Compose  
- Gerenciamento de estado eficiente com StateFlow e coroutines  
- Tratamento de erros básico e carregamento assíncrono  
- Injeção de dependência com Koin para facilitar testes e modularização  

---

## Como executar

### Pré-requisitos

- Android Studio (última versão recomendada)  
- SDK Android atualizado  
- Emulador Android ou dispositivo físico conectado  
- Internet para consumir API (ou backend rodando localmente com `10.0.2.2` para emulador)  

### Passos para rodar

1. Clone este repositório:  https://github.com/marcsant13/cadastro-pessoa-compose-kotlin
   
2. Abra o projeto no Android Studio.

3. Aguarde o Gradle sincronizar e baixar as dependências.

4. Configure a URL base da API no arquivo de configuração (`RetrofitClient`).

5. Rode o app no emulador ou dispositivo físico.

---

## Estrutura do projeto

- `/app/src/main/java/.../viewmodel` — ViewModels usando StateFlow  
- `/app/src/main/java/.../repository` — Camada de acesso a dados e Retrofit  
- `/app/src/main/java/.../di` — Módulos do Koin para injeção  
- `/app/src/main/java/.../ui` — Composables e telas do app  
- `/app/src/main/res` — Recursos visuais e strings  

---

## Próximos passos / melhorias

- Implementar testes unitários e instrumentados  
- Melhorar tratamento de erros e mensagens para usuário  
- Adicionar navegação com Jetpack Navigation Compose  
- Otimizar performance e UX da LazyColumn  
- Suportar múltiplos idiomas (internacionalização)  

---

## Contato

[nome](Marcos Antonio) | [LinkedIn](https://www.linkedin.com/in/marcos-a-0bb3b9322/) | [Email](marcos.antonio.assis1307@gmail.com)

---
