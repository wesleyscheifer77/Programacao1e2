package programacao1.sexta.aula07.aovivo;

public class Calca {
	private String marca;
	private String modelo;
	private double valor;
	private boolean temCinto;
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
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public boolean isTemCinto() {
		return temCinto;
	}
	public void setTemCinto(boolean temCinto) {
		this.temCinto = temCinto;
	}
	@Override
	public String toString() {
		return "Calca [marca=" + marca + ", modelo=" + modelo + ", valor=" + valor + ", temCinto=" + temCinto + "]";
	}
	
	
	

}
