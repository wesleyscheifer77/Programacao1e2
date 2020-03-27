package programacao1.sexta.aula07.aovivo;

public class Camisa {
	private String marca;
	private String modelo;
	private double preco;
	private String tpGola;
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
	public String getTpGola() {
		return tpGola;
	}
	public void setTpGola(String tpGola) {
		this.tpGola = tpGola;
	}
	@Override
	public String toString() {
		return "Camisa [marca=" + marca + ", modelo=" + modelo + ", preco=" + preco + ", tpGola=" + tpGola + "]";
	}

	
}
