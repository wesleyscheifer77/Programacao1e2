package programacao2.aula05.exercicio;

import java.util.Scanner;

public class Balcao {
	public static void main(String[] args) {
		new Balcao().processar();
	}

	private void processar() {
		/// menu
		Scanner leia = new Scanner(System.in);
		System.out.println("1 - Alugar Carro");
		System.out.println("2 - Alugar Patinete");
		System.out.println("1 - Alugar Moto");
		System.out.println("1 - Alugar Bicicleta");

		
		
		leia.close();
	}

}
