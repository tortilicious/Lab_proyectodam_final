package testing;

import dao.CalculadoraDao;
import dao.CalculadoraDaoImpl;

public class TestCalculadora {

    public static void main(String[] args) {
        CalculadoraDao calculadora = new CalculadoraDaoImpl();

        System.out.println(calculadora.sumar(20, 5));
        System.out.println(calculadora.restar(20, 5));
        System.out.println(calculadora.multiplicar(20, 5));
        System.out.println(calculadora.dividir(20, 5));
        System.out.println(calculadora.resto(20, 5));

    }
}
