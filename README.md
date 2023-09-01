# Exercício de Fixação: Conta Bancária

Este é um exercício projetado para ajudar a fixar conceitos importantes de programação orientada a objetos, como encapsulamento e métodos.

## Descrição do Exercício

Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, o nome do titular da conta e o valor de depósito inicial que o titular depositou ao abrir a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito e o saldo inicial da conta será, naturalmente, zero.

**Importante:**
- Uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado.
- O nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, por exemplo).
- O saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. O saldo só aumenta por meio de depósitos e só diminui por meio de saques. Para cada saque realizado, o banco cobra uma taxa de $5.00. 

**Nota:**
- A conta pode ficar com saldo negativo se o saldo não for suficiente para realizar o saque e/ou pagar a taxa.

## Tarefas do Exercício

O programa a ser desenvolvido deve ser capaz de:

1. Realizar o cadastro de uma conta, dando opção para que seja ou não informado o valor de depósito inicial.
2. Realizar um depósito na conta.
3. Realizar um saque na conta, aplicando a taxa de $5.00, se necessário.
4. Mostrar os dados da conta após cada operação.

