package factory;

import java.math.BigDecimal;
import exceptions.ErroTriangulos;
import triangulos.Triangulo;
import triangulos.TrianguloEquilatero;
import triangulos.TrianguloEscaleno;
import triangulos.TrianguloIsosceles;

public class TrianguloFactory {

	public static Triangulo definirTriangulos(BigDecimal lado1, BigDecimal lado2, BigDecimal lado3) throws ErroTriangulos{

		if (lado1.compareTo(BigDecimal.ZERO) <= 0 || lado2.compareTo(BigDecimal.ZERO) <= 0 || lado3.compareTo(BigDecimal.ZERO) <= 0) {
			throw new ErroTriangulos("Operacao invalida, o triangulo nao existe");
		}

		if (lado1.add(lado2).compareTo(lado3) < 0 || lado1.add(lado3).compareTo(lado2) < 0
				|| lado2.add(lado3).compareTo(lado1) < 0) {
			throw new ErroTriangulos("Operacao invalida, o triangulo nao existe");
		}

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
