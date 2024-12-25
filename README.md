> Status: Em andamento 👷🏻<br>
O sistema básico está finalizado, mas ainda há melhorias e novas funcionalidades a serem implementadas.

<br>

### Sobre (v1.0)
Este projeto implementa um sistema bancário simples em Java com funcionalidades básicas, como cadastro de clientes, consulta de saldo, depósitos e saques. Minha ideia é praticar comandos de entrada e saída de dados, controle de fluxo (switch e if-else), e estruturas como Map e Scanner.

<br>

### Funcionalidades
- Cadastro de novo cliente: O usuário fornece nome, idade, cidade, ID (código numérico de 6 dígitos) e saldo inicial. Os dados são armazenados em um mapa com o ID do cliente como chave.

- Consulta de informações: O usuário pode visualizar suas informações (nome, idade, cidade e saldo) fornecendo seu ID.

- Consulta de saldo: O sistema exibe o saldo atual da conta do usuário, dado seu ID.

- Saque e Depósito: O usuário pode realizar saque (se houver saldo suficiente) ou depósito. O valor inserido é somado ou subtraído do saldo da conta.

- Encerramento: O programa permite encerrar o sistema a qualquer momento.

<br>

### Como Funciona
- Cadastro: O usuário escolhe a opção de criar uma conta, preenche seus dados e esses são armazenados em um mapa (Map<Integer, Usuario>).

- Operações bancárias: Após o cadastro, o usuário pode consultar suas informações ou realizar operações bancárias, como saque ou depósito, baseando-se em seu ID.

### Exemplo de Uso
1. O usuário escolhe 1 para se cadastrar, preenche os dados, define um ID e o sistema confirma o cadastro.
2. O usuário escolhe 2 para consultar suas informações, inserindo seu ID.
3. O usuário escolhe 3 para ver seu saldo atual.
4. O usuário escolhe 4 para realizar saque ou depósito.
5. O usuário escolhe 5 para sair do sistema.

### Tecnologias Utilizadas
- Java
- Scanner (entrada de dados)
- Map (HashMap) (armazenamento de dados)
- Locale.US (formatação de valores monetários)

### Conclusão
Este sistema básico de gerenciamento de contas bancárias em Java me ofereceu uma excelente base para entender manipulação de dados, controle de fluxo e armazenamento simples em memória. O código está funcional, e a minha intenção é expandi-lo para incluir novas funcionalidades no futuro, à medida que meu aprendizado evolui. Meu objetivo é transformar este código simples em um projeto completo, integrando-o a outras tecnologias e utilizando front-end para criar um design mais apresentável e interativo.
