package evaluacion;

public class Publico extends Empleado{
	private String municipalidad;
	private String departamento;
	
	
	
	public Publico(String rut, String nombres, String apellidos, String direccion, int telefono, double sueldo,
			String municipalidad, String departamento) {
		super(rut, nombres, apellidos, direccion, telefono, sueldo);
		this.municipalidad = municipalidad;
		this.departamento = departamento;
	}

	public Publico() {
	}

	public String getMunicipalidad() {
		return municipalidad;
	}

	public void setMunicipalidad(String municipalidad) {
		this.municipalidad = municipalidad;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	

	
	
}
