package atividade06;

public class Notbook implements Processador, Aparelho, Bateria {
	
	private boolean carregado;
	private int porcentagem;
	private String marca; 
	
	
	
	public Notbook(String marca) {
		this.setCarregado(false);
		this.setMarca(marca);
		this.setPorcentagem(0);
	}
	
	
	
	@Override
	public int getMAH() {
		return 8800;
	}

	@Override
	public void carregar() {
		System.out.println("Notbook carregado!");
		this.setCarregado(true);
		this.setPorcentagem(100);
	}

	@Override
	public int porcentagem() {
		return this.getPorcentagem();
	}

	@Override
	public String getTipoTela() {
		return "Lcd";
	}

	@Override
	public String getTipoAparelho() {
		return "Notbook";
	}

	@Override
	public String getModeloProcessador() {
		return "Intel Core i7 8700";
	}

	@Override
	public String getPotencia() {
		return "3.7 GHz";
	}

	public boolean getCarregado() {
		return carregado;
	}

	public void setCarregado(boolean carregado) {
		this.carregado = carregado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}



	public int getPorcentagem() {
		return porcentagem;
	}



	public void setPorcentagem(int porcentagem) {
		this.porcentagem = porcentagem;
	}



	@Override
	public String toString() {
		return "Notbook [carregado=" + carregado + ", porcentagem=" + porcentagem + ", marca=" + marca
				+ "]";
	}

}
