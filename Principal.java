package evaluacion;

import java.util.Scanner;
public class Principal {
	public static void main(String[] args) {
		Tarjeta t[] = new Tarjeta[5];
		Scanner sc = new Scanner(System.in);	
		int op=0;
		int c=0;
		int numero;
		
	do
	{
		System.out.println("\n         BIOTREN         ");
		System.out.println("*************************");
		System.out.println("1.- Crear nuevo usuario  ");
		System.out.println("2.- Abonar a tarjeta     ");
		System.out.println("3.- Descuento por viaje  ");
		System.out.println("4.- Consultar saldo      ");
		System.out.println("5.- Verificar tarjeta    ");
		System.out.println("6.- Salir                \n");
		System.out.println("Ingrese opcion :          ");
		op= sc.nextInt();
		
		switch(op) {
		//Ingreso nuevo usuario
		case 1:	
			t[c] = new Tarjeta();
			t[c].crearUsuario(c, t, sc);
			c++;
			break;
		
		//Abono de dinero	
		case 2:
			int abono;
			
			System.out.println("Ingrese numero de tarjeta");
			numero = sc.nextInt();
			
			System.out.println("Ingrese abono");
			abono = sc.nextInt();
			
			for(int i=0;i<c;i++) 
				if(t[i].getNum()==numero) {
					t[i].setSaldo(t[i].getSaldo()+abono);
					System.out.println("Saldo total disponible : "+ t[i].getSaldo() );
					t[i].setActiva(true);
				}
			break;
		
		case 3:
			//descuento por viaje
			System.out.println("\n Valor del viaje $500 \n");
			System.out.println("Ingrese numero de tarjeta");
			numero = sc.nextInt();
			for(int i=0;i<c;i++) 
				if(t[i].getNum()==numero) {
					System.out.println("Su saldo disponible es:"+t[i].getSaldo());
					if(t[i].getSaldo()>500) {
						t[i].setSaldo(t[i].getSaldo()-500);
						System.out.println("Su saldo restante es :"+t[i].getSaldo());
						t[i].getSaldo();
					    t[i].setActiva(true);}

					else
						System.out.println("Su saldo es insuficiente");
		
				}
			break;
			
		case 4:
			//consultar saldo
			System.out.println("Ingrese numero de tarjeta");
			numero = sc.nextInt();
			for(int i=0;i<c;i++)
				if(t[i].getNum()==numero)
					System.out.println("Su saldo disponible es :" +t[i].getSaldo());
			break;
			
		case 5:
			//Verificacion tarjeta activa o inactiva
			System.out.println("Ingrese numero de tarjeta");
			numero = sc.nextInt();
			for(int i=0;i<c;i++)
				if(t[i].getNum()==numero)
					if(t[i].isActiva()==true)
						System.out.println("La tarjeta está activa");
					else
						System.out.println("La tarjeta no está activa");
				
			break;
		case 6:
			break;
		default:
			System.out.println("Ingrese una opción válida");
	}
	}while(op!=6);
	}	
		
}



