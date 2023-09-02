# Aplicativo de Agendamento de Barbearia em Kotlin

Este é um aplicativo de agendamento de barbearia desenvolvido em Kotlin que permite aos clientes escolher o tipo de serviço desejado, selecionar um profissional disponível e agendar um horário de atendimento.

## Funcionalidades Principais

1. **Autenticação de Usuário**: Os clientes podem criar uma conta ou fazer login para acessar o aplicativo.

2. **Página Inicial**: A página inicial exibe informações gerais sobre a barbearia. 

3. **Agendamento de Serviço**: Os clientes podem navegar pelos tipos de serviço oferecidos, escolher um serviço específico e agendar um horário disponível.

4. **Seleção de Profissional**: Os clientes podem ver uma lista de profissionais disponíveis, incluindo suas informações de contato e horários de disponibilidade. Eles podem escolher um profissional específico para o agendamento.

5. **Calendário de Agendamentos**: Os clientes podem visualizar todos os seus agendamentos passados e futuros em um calendário.


## Tecnologias Utilizadas

- **Linguagem de Programação**: Kotlin
- **Banco de Dados**: SQLite ou Firebase Realtime Database
- **Framework de Desenvolvimento**: Android Studio
- **Autenticação de Usuário**: Firebase Authentication
- **Notificações**: Firebase Cloud Messaging (FCM)

## Estrutura do Projeto

```
- app/
  - src/
    - main/
      - java/
        - com/
          - exemplo/
            - barbearia/
              - activities/           # Atividades do aplicativo
              - adapters/             # Adaptadores para listas e recyclerviews
              - fragments/            # Fragmentos para exibir informações
              - models/               # Classes de modelo de dados
              - utils/                # Utilitários diversos
              - MainActivity.kt       # Atividade principal
              - ...
      - res/
        - layout/                    # Layouts XML das atividades e fragmentos
        - values/                    # Recursos de valores, strings, cores, estilos
      - AndroidManifest.xml           # Arquivo de manifesto do aplicativo
    - ...
- ...
```

## Configuração

Para configurar o projeto em seu ambiente de desenvolvimento, siga estas etapas:

1. Clone o repositório do projeto.
2. Abra o projeto no Android Studio.
3. Configure as chaves de autenticação do Firebase e outras configurações necessárias no arquivo `google-services.json`.
4. Personalize a aparência do aplicativo, como cores e estilos, nos arquivos de recursos.
5. Implemente a lógica de agendamento de serviços e integração com o banco de dados.

## Contribuição

Sinta-se à vontade para contribuir com melhorias, correções de bugs e novos recursos para este projeto. Basta criar um fork do repositório, fazer suas modificações e enviar uma solicitação pull.

Esperamos que este aplicativo de agendamento de barbearia em Kotlin seja útil e eficiente para você. Boa sorte com o desenvolvimento!
