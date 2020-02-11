package evaluacion;

public class Persona {

	public static void main(String[] args) {
		
		Publico pu = new Publico("152423566", "Fernando", "Mellado Salinas", "Los laureles 45", 945281947, 780000, "Municipalidad de Los Alamos", "Administrativo");
		Privado pr = new Privado("123456787", "Francisco", "Risopatrón de Lourdes", "Juan Bosco 1786", 976834616, 6000000, "Las condes", "Gerencia");
		
		System.out.println("Empleado público");
		System.out.println("Rut           :" + pu.getRut());
		System.out.println("Nombre        :" + pu.getNombres());
		System.out.println("Apellido      :" + pu.getApellidos());
		System.out.println("Dirección     :" + pu.getDireccion());
		System.out.println("Telefono      :" + pu.getTelefono());
		System.out.println("Sueldo        :" + pu.getSueldo());
		System.out.println("Municipalidad :" + pu.getMunicipalidad());
		System.out.println("Cargo         :" + pu.getDepartamento());
		
		System.out.println();
		System.out.println("Empleado privado");
		System.out.println("Rut           :" + pr.getRut());
		System.out.println("Nombre        :" + pr.getNombres());
		System.out.println("Apellido      :" + pr.getApellidos());
		System.out.println("Dirección     :" + pr.getDireccion());
		System.out.println("Telefono      :" + pr.getTelefono());
		System.out.println("Sueldo        :" + pr.getSueldo());
		System.out.println("Comuna        :" + pr.getComuna());
		System.out.println("Cargo         :" + pr.getEmpresa());
		
	}

}
