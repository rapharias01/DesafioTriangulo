package main;

import java.math.BigDecimal;
import java.util.Scanner;

import exceptions.ErroTriangulos;
import factory.TrianguloFactory;
import triangulos.Triangulo;

/**
 * Classe que contém o método principal para interagir com o usuário e determinar o tipo de triângulo com base em medidas de lados.
 */
public class ProgramaMain {
	/**
     * O método principal do programa que lida com a entrada do usuário e determina o tipo de triângulo.
     * 
     * @param args Os argumentos de linha de comando (não são usados neste programa).
     */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String sair = "N";
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
			
			//Sair do Programa
			System.out.println("deseja sair do programa?(S ou N)");
			sair = entrada.next();			
		} while (sair.equalsIgnoreCase("N") || sair.equalsIgnoreCase("n"));
		System.out.println("Fim do Programa.");
		entrada.close();
	}
}
