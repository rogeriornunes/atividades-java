package principal;

public class CalcularFatorial {

	public static void main(String[] args) {
		int numero = 5;

		System.out.println("O fatorial de " + numero + " é: " + fatorial(numero));
	}

	public static long fatorial(int numero) {
		long fatorial = 1;
		for (int i = 1; i <= numero; i++) {
			fatorial *= i;
		}
		return fatorial;
	}
}
