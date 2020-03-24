package programacao1.terca.aovivo.aula09;

public class Camisa {
	// Possui 2 Conteúdos
	// Primeiro ele pode conter Atributos
	// private foco no conceito de encapsulamento.

	private String marca;
	private Double preco;
	private String modelo;

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (marca == null || marca.isEmpty()) {
			throw new IllegalArgumentException();
		}
		this.marca = marca;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Camisa [marca=" + marca + ", preco=" + preco + ", modelo=" + modelo + "]";
	}

	// Segundo ela pode conter métodos

	
	
}
