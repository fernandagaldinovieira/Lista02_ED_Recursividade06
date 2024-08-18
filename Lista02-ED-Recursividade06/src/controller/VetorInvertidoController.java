package controller;

public class VetorInvertidoController {

	public VetorInvertidoController() {
		super();
	}

	public int[] VetorInvertido(int[] vet, int inicio, int fim) {
		int aux;
		if (inicio >= fim) {
			return vet;
		} else {
			aux = vet[inicio];
			vet[inicio] = vet[fim];
			vet[fim] = aux;
			
			return VetorInvertido(vet, inicio + 1, fim -1);
		}
	}
}
