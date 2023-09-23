package main;

import java.math.BigDecimal;
import java.util.Scanner;

import exceptions.ErroTriangulos;
import factory.TrianguloFactory;
import triangulos.Triangulo;

public class ProgramaMain {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		boolean sair = false;

		do {
			System.out.println("entre com os lados:");
			System.out.print("Lado 1: ");
			double valor = entrada.nextDouble();
			BigDecimal lado1 = BigDecimal.valueOf(valor);
			
			System.out.print("Lado 2: ");
			valor = entrada.nextDouble();
			BigDecimal lado2 = BigDecimal.valueOf(valor);
			
			System.out.print("Lado 3: ");
			valor = entrada.nextDouble();
			BigDecimal lado3 = BigDecimal.valueOf(valor);
			
			try {
				Triangulo triangulo = TrianguloFactory.definirTriangulos(lado1, lado2, lado3);
				System.out.println(triangulo.getNome());
			} catch (ErroTriangulos e) {
				System.out.println(e.getMessage());
			}
		} while (sair == false);
		entrada.close();
	}
}
