# Locadora de Veículos

Projeto em Java com foco em testes unitários utilizando JUnit. Simula o funcionamento básico de uma locadora de veículos, incluindo cálculo de custos, aplicação de descontos e multas por atraso.

## 🎯 Objetivo

- Modelar uma classe `Veiculo` com regras de negócio básicas.
- Implementar testes unitários com JUnit 5.
- Simular o uso da classe com uma classe `Main`.

## 📁 Estrutura do Projeto

src/ ├── main/ │ └── java/ │ └── org/example/ │ ├── Veiculo.java │ └── Main.java └── test/ └── java/ └── org/example/ └── VeiculoTest.java

## ⚙️ Funcionalidades

- Cálculo de custo de aluguel por diária.
- Desconto de 10% para 7 dias ou mais.
- Multa de 20% por dia de atraso.
- Desconto progressivo (5% a cada 5 dias, até 25%).

## ✅ Tecnologias

- Java 17
- Maven
- JUnit 5
