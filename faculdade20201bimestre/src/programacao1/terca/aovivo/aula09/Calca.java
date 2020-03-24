package programacao1.terca.aovivo.aula09;

public class Calca {
	private String modelo;
	private String marca;
	private double preco;
	private boolean temCinto;
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public boolean isTemCinto() {
		return temCinto;
	}
	public void setTemCinto(boolean temCinto) {
		this.temCinto = temCinto;
	}
	@Override
	public String toString() {
		return "Calca [modelo=" + modelo + ", marca=" + marca + ", preco=" + preco + ", temCinto=" + temCinto + "]";
	}
	
	
	

}
