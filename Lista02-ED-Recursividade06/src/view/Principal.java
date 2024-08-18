package view;

import controller.VetorInvertidoController;

public class Principal {

	public static void main(String[] args) {

		VetorInvertidoController vetorInvertido = new VetorInvertidoController();
		
		int [] vet10 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int inicio = 0;
		
		vet10 = vetorInvertido.VetorInvertido(vet10, inicio, vet10.length - 1);
		
		for (int i = 0; i < vet10.length; i++) {
			System.out.println("Vetor[ " + i + " ] = " + vet10[i]);
		}
		
		System.out.println("\n***************\n");
		
		int [] vet11 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
		vet11 = vetorInvertido.VetorInvertido(vet11, inicio, vet11.length - 1);
		
		for (int i = 0; i < vet11.length; i++) {
			System.out.println("Vetor[ " + i + " ] = " + vet11[i]);
		}
	}

}
