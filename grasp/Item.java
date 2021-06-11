package ADSII.grasp;

public class Item {

	private int id;
	private double valor;
	private int quatidade;


	public Item(int id, double valor, int quatidade) {
		this.id = id;
		this.valor = valor;
		this.quatidade = quatidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuatidade() {
		return quatidade;
	}

	public void setQuatidade(int quatidade) {
		this.quatidade = quatidade;
	}
}
