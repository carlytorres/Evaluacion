package evaluacion;

public class Privado extends Empleado{
	private String comuna;
	private String empresa;
	


	public Privado(String rut, String nombres, String apellidos, String direccion, int telefono, double sueldo,
			String comuna, String empresa) {
		super(rut, nombres, apellidos, direccion, telefono, sueldo);
		this.comuna = comuna;
		this.empresa = empresa;
	}

	public Privado() {
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	
	
	
}
