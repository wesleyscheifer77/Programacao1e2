package programacao1.sexta.aula07.aovivo;

import java.util.Scanner;

public class CaixaInteligente {
	public static void main(String[] args) {
		new CaixaInteligente().processar();
	}

	Scanner leia = new Scanner(System.in).useDelimiter("\r\n");

	private String marca;
	private String modelo;
	private double preco;

	// modularizar - Uma das vantagens da OO
	private void lerDadosComuns() {
		System.out.println("Digite a marca:");
		marca = leia.next();
		System.out.println("Digite o modelo:");
		modelo = leia.next();
		System.out.println("Digite o preco:");
		preco = leia.nextDouble();

	}

	private void processar() {
		int op = 0;
		Carrinho car = new Carrinho();
		do {
			System.out.println("1 - Adicionar Camisa.");
			System.out.println("2 - Adicionar Calca.");
			System.out.println("3 - Adicionar Sapato.");

			System.out.println("7 - Fechar Pedido.");

			System.out.println("9 - Encerrar sistema.");
			System.out.println("Digite sua opção:");
			op = leia.nextInt();
			switch (op) {
			case 1:
				System.out.println("Adciionar camisa");
				Camisa cam = new Camisa();
				lerDadosComuns();

				System.out.println("Digite o tipo da gola:");
				String tpGola = leia.next();

				cam.setMarca(marca);
				cam.setModelo(modelo);
				cam.setPreco(preco);
				cam.setTpGola(tpGola);
				// adicionar no carrinho
				car.adicionarCamisa(cam);

				break;
			case 2:

				System.out.println("Adciionar calca");
				Calca cal = new Calca();
				lerDadosComuns();

				System.out.println("Digite se tem cinto (s/n):");
				String temCinto = leia.next();
				if (temCinto.equalsIgnoreCase("s")) {
					cal.setTemCinto(true);
				}
				cal.setMarca(marca);
				cal.setModelo(modelo);
				cal.setValor(preco);
				// adicionar no carrinho
				car.adicionarCalca(cal);

				break;

			case 3:

				System.out.println("Adciionar calca");
				Sapato sap = new Sapato();
				lerDadosComuns();
				System.out.println("Digite se tem cinto (s/n):");
				String eCouro = leia.next();
				if (eCouro.equalsIgnoreCase("s")) {
					sap.seteCouro(true);
				}
				sap.setMarca(marca);
				sap.setModelo(modelo);
				sap.setPreco(preco);
				// adicionar no carrinho
				car.adicionarSapato(sap);

				break;

			case 7:
				System.out.println("Fechar pedido camisa");
				double totalCompra = car.fecharPedidoCamisa();
				System.out.println("Total da compra:" + totalCompra);

				totalCompra += car.fecharPedidoCalca();
				System.out.println("Total da compra:" + totalCompra);

				break;

			default:
				break;
			}
		} while (op != 9);
	}

}
