package principal;

import java.util.stream.IntStream;

public class CalcularMultiplo {

	public static void main(String[] args) {
	
		int numero = 10;	
		
		long resultado = somarMultiplo(numero);
		exibirSomaMultiplo(numero, resultado);
	}
	
	private static long somarMultiplo(int numero) {
		IntStream stream = IntStream.range(1, numero);
		long result = stream.filter(value -> (value % 3 == 0 || value % 5 == 0)).sum();
		return result;
	}
	
	private static void exibirSomaMultiplo(int numero, long resultado) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("A soma dos multiplos de 3 e 5 abaixo de ")
		.append(numero)
		.append(", é: ")
		.append(resultado);
		System.out.println(stringBuilder.toString());
	}
}
