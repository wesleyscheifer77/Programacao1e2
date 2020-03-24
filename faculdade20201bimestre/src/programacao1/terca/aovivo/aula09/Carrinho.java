package programacao1.terca.aovivo.aula09;

public class Carrinho {
	// atributos
	// metodos
	Camisa vetorCamisa[] = new Camisa[50];
	int controleQdadeCam = 0;

	public void adicionarCamisa(Camisa c) {
//		this.vetorCamisa[this.controleQdadeCam] = c; // possivel problema
		this.vetorCamisa[this.controleQdadeCam] = new Camisa();
		this.vetorCamisa[this.controleQdadeCam] = c;
		this.controleQdadeCam++;
	}

	public double fecharCamisa() {
		double totalCam = 0.0;
//		for (int i = 0; i < this.vetorCamisa.length; i++) {// por que dara erro.
		for (int i = 0; i < this.controleQdadeCam; i++) {// por que dara erro.
			totalCam = totalCam + this.vetorCamisa[i].getPreco();
		}
		return totalCam;
	}

}
