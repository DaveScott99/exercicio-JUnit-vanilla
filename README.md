# Exercício de testes unitários com JUnit Vanilla

Um financiamento possui três dados:
-	totalAmont: valor total de dinheiro financiado
-	income: renda mensal do cliente que está financiando
- months: número de meses do financiamento

E dois métodos:
-	entry: entrada do financiamento, igual a 20% do valor total
-	quota: prestação mensal do financiamento (sem juros)

Você deve implementar os seguintes testes para validar esta classe (total = 10 testes):

## Construtor
- Deve criar o objeto com os dados corretos quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

## setTotalAmount
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

## setIncome
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

## setMonths
- Deve atualizar o valor quando os dados forem válidos
- Deve lançar IllegalArgumentException quando os dados não forem válidos

## entry
- Deve calcular corretamente o valor da entrada

## quota
- Deve calcular corretamente o valor da prestação
