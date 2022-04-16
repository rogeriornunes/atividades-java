package principal;

public class OrdenarBubbleSort {
	public static void main(String[] args) {
		
	    int vetor[] ={5,3,2,4,7,1,0,6};  
          
        ordernar(vetor);     
        imprimirOrdenacao(vetor);  
	}

	public static void imprimirOrdenacao(int[] vetor) {
		for(int i=0; i < vetor.length; i++){  
                System.out.print(vetor[i] + " ");  
        }
	}
	
	public static void ordernar(int[] vetor) {
		int tamanho = vetor.length;
		int auxiliar = 0;
		  //controlar a quantidade de vezes que o vetor será ordenado.
		for (int i = 0; i < tamanho; i++) {
			/*controla quantidade de vezes que ja percorreu o vetor,
			 *  para não percorrer todo vetor novamente condiderando j < tamanho - i.
			 */
			for (int j = 1; j < (tamanho - i); j++) {
				if (vetor[j - 1] > vetor[j]) {
					//swap dos elementos comparando de dois em dois
					auxiliar = vetor[j - 1];
					vetor[j - 1] = vetor[j];
					vetor[j] = auxiliar;
				}
			}
		}
	}
}
