package evaluacion;

public class Automovil {
	private String marca;
	private String modelo;
	private int a�o;
	private double precio;
	
	
	public Automovil(String marca, String modelo, int ano, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.a�o = ano;
		this.precio = precio;
	}
	
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
	public int getAno() {
		return a�o;
	}
	public void setAno(int a�o) {
		this.a�o = a�o;
	}
	
	public void precio_final() {
		int patente = 100000;
		precio = precio *1.24+patente;
	}

}
