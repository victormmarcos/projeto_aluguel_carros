package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VeiculoTest {

    @Test
    public void testCalcularCustoSemDesconto() {
        Veiculo v = new Veiculo("Fusca", 100.0);
        double custo = v.calcularCusto(5);
        assertEquals(500.0, custo);
    }

    @Test
    public void testCalcularCustoComDesconto() {
        Veiculo v = new Veiculo("Gol", 100.0);
        double custo = v.calcularCusto(7);
        assertEquals(630.0, custo); // 700 - 10%
    }

    @Test
    public void testDescontoMenorQue7Dias() {
        Veiculo v = new Veiculo("Uno", 100.0);
        assertEquals(0.0, v.desconto(3));
    }

    @Test
    public void testDescontoMaiorOuIgualA7Dias() {
        Veiculo v = new Veiculo("Celta", 100.0);
        assertEquals(70.0, v.desconto(7));
    }

    @Test
    public void testMultaPorAtraso() {
        Veiculo v = new Veiculo("Palio", 100.0);
        assertEquals(60.0, v.calcularMulta(3));
    }

    @Test
    public void testDescontoProgressivo() {
        Veiculo v = new Veiculo("Corolla", 100.0);
        assertEquals(1250.0, v.calcularDescontoProgressivo(50));
    }

    @Test
    public void testDescontoProgressivoLimiteMaximo() {
        Veiculo v = new Veiculo("Hilux", 100.0);
        assertEquals(1250.0, v.calcularDescontoProgressivo(50));
    }

    @Test
    public void testValorDiariaNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Veiculo("Ka", -50.0));
    }

    @Test
    public void testAluguelComDiasNegativos() {
        Veiculo v = new Veiculo("Civic", 100.0);
        assertThrows(IllegalArgumentException.class, () -> v.calcularCusto(-3));
    }

    @Test
    public void testMultaComDiasNegativos() {
        Veiculo v = new Veiculo("HB20", 100.0);
        assertThrows(IllegalArgumentException.class, () -> v.calcularMulta(-1));
    }
}