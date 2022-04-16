package principal;

public class CalcularFatorial {

	public static void main(String[] args) {
		int numero = 5;
		long fatorial = fatorial(numero);
		exibirFatorial(numero, fatorial);
	}

	private static long fatorial(int numero) {
		long fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
	
	private static void exibirFatorial(int numero, long fatorial) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("O fatorial de ")
		.append(numero)
		.append(" é ")
		.append(fatorial);
		System.out.println(stringBuilder.toString());
	}
	
}
