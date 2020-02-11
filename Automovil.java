package evaluacion;

public class Automovil {
	private String marca;
	private String modelo;
	private int año;
	private double precio;
	
	
	public Automovil(String marca, String modelo, int ano, double precio) {
		this.marca = marca;
		this.modelo = modelo;
		this.año = ano;
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
		return año;
	}
	public void setAno(int año) {
		this.año = año;
	}
	
	public void precio_final() {
		int patente = 100000;
		precio = precio *1.24+patente;
	}

}
