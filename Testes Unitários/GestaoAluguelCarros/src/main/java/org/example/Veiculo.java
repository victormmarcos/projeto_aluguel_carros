package org.example;

public class Veiculo {
    private String modelo;
    private double valorDiaria;

    public Veiculo(String modelo, double valorDiaria) {
        if (valorDiaria < 0) {
            throw new IllegalArgumentException("Valor da diária não pode ser negativo.");
        }
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return modelo;
    }

    public double getValorDiaria() {
        return valorDiaria;
    }

    public double calcularCusto(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("Quantidade de dias não pode ser negativa.");
        }
        double total = valorDiaria * dias;
        return total - desconto(dias);
    }

    public double desconto(int dias) {
        if (dias >= 7) {
            return valorDiaria * dias * 0.10; // 10% de desconto
        }
        return 0;
    }

    public double calcularMulta(int diasAtraso) {
        if (diasAtraso < 0) {
            throw new IllegalArgumentException("Dias de atraso não pode ser negativo.");
        }
        return valorDiaria * diasAtraso * 0.20;
    }

    public double calcularDescontoProgressivo(int dias) {
        if (dias < 0) {
            throw new IllegalArgumentException("Dias inválido.");
        }

        double desconto = 0;
        int blocosDe5 = dias / 5;
        double descontoTotal = Math.min(0.05 * blocosDe5, 0.25);

        return valorDiaria * dias * descontoTotal;
    }
}