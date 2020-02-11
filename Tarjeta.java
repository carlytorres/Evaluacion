package evaluacion;
import java.util.Scanner;


public class Tarjeta {
	private int num;
	private int tipo;
	private int saldo;
	private int desc;
	private boolean activa;
	
	public Tarjeta(int num, int tipo, int saldo, int desc,boolean activa) {
		super();
		this.num = num;
		this.tipo = tipo;
		this.saldo = saldo;
		this.desc = desc;
		this.activa = activa;
		
	}
	public Tarjeta() {
		super();
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public int getTipo() {
		return tipo;
	}
	public boolean isActiva() {
		return activa;
	}
	public void setActiva(boolean activa) {
		this.activa = activa;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public int getSaldo() {
		return saldo;
	}
	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public int getDesc() {
		return desc;
	}
	public void setDesc(int desc) {
		this.desc = desc;
	}
	
	public void crearUsuario(int c,Tarjeta t[],Scanner sc) {
		
		System.out.println("\n Tarjeta N°: " + (c+1));
		t[c].setNum(c+1);
		System.out.print("Ingrese tipo de usuario ");
		System.out.println("1.-Común 2.-TNE 3.-Bip");
		t[c].setTipo(sc.nextInt());
		System.out.print("Ingrese monto a cargar");
		t[c].setSaldo(sc.nextInt());
		System.out.print("Descuento por tiempo de inactividad");
		t[c].setDesc(sc.nextInt());
		if(t[c].getDesc()>0)
			t[c].setSaldo(t[c].getSaldo()-t[c].getDesc());
		t[c].setActiva(false);
		System.out.println("\n Usuario creado con exito!!\n");
	}
	
		
}
