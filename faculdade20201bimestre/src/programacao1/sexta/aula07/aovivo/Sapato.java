package programacao1.sexta.aula07.aovivo;

public class Sapato {
	private String marca;
	private String modelo;
	private double preco;
	private boolean eCouro;
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean iseCouro() {
		return eCouro;
	}
	public void seteCouro(boolean eCouro) {
		this.eCouro = eCouro;
	}
	@Override
	public String toString() {
		return "Sapato [marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", eCouro=" + eCouro + "]";
	}
	

}
