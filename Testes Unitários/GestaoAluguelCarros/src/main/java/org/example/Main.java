package org.example;

public class Main {
    public static void main(String[] args) {
        Veiculo carro1 = new Veiculo("Gol", 120.0);

        int diasAluguel = 8;
        int diasAtraso = 2;

        double custo = carro1.calcularCusto(diasAluguel);
        double multa = carro1.calcularMulta(diasAtraso);
        double descontoProgressivo = carro1.calcularDescontoProgressivo(diasAluguel);

        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Dias de aluguel: " + diasAluguel);
        System.out.println("Custo total com desconto (10% se aplicável): R$ " + custo);
        System.out.println("Multa por atraso de " + diasAtraso + " dias: R$ " + multa);
        System.out.println("Desconto progressivo aplicado: R$ " + descontoProgressivo);
    }
}