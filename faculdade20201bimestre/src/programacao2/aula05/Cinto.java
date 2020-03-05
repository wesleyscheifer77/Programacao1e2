package programacao2.aula05;

public class Cinto extends VestuarioConstrutorMetodoAbstrato {
	boolean eCouro;
	int qdadeFuros;

	@Override
	public String toString() {
		return super.toString() + 
				" Cinto [eCouro=" + this.eCouro + ", qdadeFuros=" + this.qdadeFuros + "]";
	}

	@Override
	protected void aplicarDesconto() {
		if (this.aplicaDesconto && !this.eCouro) {
			this.preco = this.preco * this.percentualDesconto;
		}
	}
}
