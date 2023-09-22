package main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public abstract class TrianguloFactory {
	public static Triangulo definirTriangulos(BigDecimal lado1, BigDecimal lado2, BigDecimal lado3) {

		List<BigDecimal> list = new ArrayList<BigDecimal>();
		list.add(lado1);
		list.add(lado2);
		list.add(lado3);
		for (BigDecimal i : list) {
			if (i.compareTo(BigDecimal.ZERO) < 0) {
				System.out.println("Operacao invalida");
			}
		}
		if(lado1.compareTo(lado2) == 0 && lado1.compareTo(lado3) == 0) {
			 return new TrianguloEquilatero();
		}else if(lado1.compareTo(lado2) != 0 && lado1.compareTo(lado3) == 0 && lado2.compareTo(lado3) != 0) {
			return new  TrianguloIsosceles();
		}else if(lado1.compareTo(lado2) != 0 && lado1.compareTo(lado3) != 0 && lado2.compareTo(lado3) != 0){
			return new TrianguloEscaleno();
		}
		if(lado1.add(lado2) == lado3) {
			return new TrianguloDegenerado();
		}
		
		return null;
	}
}
