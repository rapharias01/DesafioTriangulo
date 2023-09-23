package factory;

import java.math.BigDecimal;
import exceptions.ErroTriangulos;
import triangulos.Triangulo;
import triangulos.TrianguloEquilatero;
import triangulos.TrianguloEscaleno;
import triangulos.TrianguloIsosceles;

/**
 * Classe que representa uma fábrica para criar instâncias de objetos Triângulo com base em medidas de lados.
 * 
 * Esta classe oferece um método estático para definir o tipo de triângulo (equilátero, isósceles, escaleno) com base nos comprimentos dos lados fornecidos.
 */
public class TrianguloFactory {
	/**
     * Cria e retorna uma instância de Triângulo com base nas medidas dos lados fornecidos.
     * 
     * @param lado1 O comprimento do primeiro lado do triângulo.
     * @param lado2 O comprimento do segundo lado do triângulo.
     * @param lado3 O comprimento do terceiro lado do triângulo.
     * @return Uma instância de Triângulo correspondente ao tipo de triângulo com base nos comprimentos dos lados.
     * @throws ErroTriangulos Se os comprimentos dos lados não formarem um triângulo válido.
     */
	public static Triangulo definirTriangulos(BigDecimal lado1, BigDecimal lado2, BigDecimal lado3) throws ErroTriangulos{
		// Verifica se algum lado tem tamanho não positivo, o que invalidaria o triângulo.
		if (lado1.compareTo(BigDecimal.ZERO) <= 0 || lado2.compareTo(BigDecimal.ZERO) <= 0 || lado3.compareTo(BigDecimal.ZERO) <= 0) {
			throw new ErroTriangulos("Operacao invalida, o triangulo nao existe");
		}
		// Verifica se a soma de dois lados é menor que o terceiro, o que também invalidaria o triângulo.
		if (lado1.add(lado2).compareTo(lado3) < 0 || lado1.add(lado3).compareTo(lado2) < 0
				|| lado2.add(lado3).compareTo(lado1) < 0) {
			throw new ErroTriangulos("Operacao invalida, o triangulo nao existe");
		}
		// Verifica o tipo de triângulo com base nas medidas dos lados e retorna a instância apropriada.
		if (lado1.compareTo(lado2) == 0 && lado1.compareTo(lado3) == 0) {
			return new TrianguloEquilatero();

		} else if (lado1.compareTo(lado2) == 0 || lado1.compareTo(lado3) == 0 || lado2.compareTo(lado3) == 0 && lado1.compareTo(lado2) != 0) {
			if (lado1.add(lado2) == lado3 || lado1.add(lado2).compareTo(lado3) >= 0) {
				System.out.println("E triangulo degenerado");
			}
			return new TrianguloIsosceles();

		} else if (lado1.compareTo(lado2) != 0 && lado1.compareTo(lado3) != 0 && lado2.compareTo(lado3) != 0) {
			if (lado1.add(lado2) == lado3 || lado1.add(lado2).compareTo(lado3) >= 0) {
				System.out.println("E triangulo degenerado");
			}
			return new TrianguloEscaleno();
		}
		throw new ErroTriangulos("Operacao invalida, o triangulo nao existe");
	}
}
