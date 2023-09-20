
package Logic;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int op=0;
		do {
		System.out.println("Bienvenido, este es un programa en el que ingresando las coordenadas de una pieza de ajedrez, calcula sus movimientos posibles. Por favor ingrese la pieza en cuestion:\n"
			+ "1. Peon\n"
			+ "2. Torre\n"
			+ "3. Alfil\n"
			+ "4. Caballo\n"
			+ "5. Rey\n"
			+ "6. Dama \n");
		if(op==1) {
			System.out.println("Ingrese la coordenada X:");
			int coordenadaX = sc.nextInt();
			System.out.println("Ingrese la coordenada Y");
			int coordenadaY = sc.nextInt();
			Peon peon = new Peon(coordenadaX, coordenadaY);
			peon.comportamientoPieza();

			
			
		}
		if(op==2) {
			System.out.println("Ingrese la coordenada X:");
			int coordenadaX = sc.nextInt();
			System.out.println("Ingrese la coordenada Y");
			int coordenadaY = sc.nextInt();
			Torre torre = new Torre(coordenadaX, coordenadaY);
			torre.comportamientoPieza();
		}
			
		
		if(op==3) {
			System.out.println("Ingrese la coordenada X:");
			int coordenadaX = sc.nextInt();
			System.out.println("Ingrese la coordenada Y");
			int coordenadaY = sc.nextInt();
			Alfil alfil = new Alfil(coordenadaX, coordenadaY);
			alfil.comportamientoPieza();
			
			
		}
		if(op==4) {
			System.out.println("Ingrese la coordenada X:");
			int coordenadaX = sc.nextInt();
			System.out.println("Ingrese la coordenada Y");
			int coordenadaY = sc.nextInt();
			Caballo caballo = new Caballo(coordenadaX, coordenadaY);
			caballo.comportamientoPieza();
		}
			
		
		if(op==5) {
			System.out.println("Ingrese la coordenada X:");
			int coordenadaX = sc.nextInt();
			System.out.println("Ingrese la coordenada Y");
			int coordenadaY = sc.nextInt();
			Rey rey = new Rey(coordenadaX, coordenadaY);
			rey.comportamientoPieza();
		}
			
		
		if(op==6) {
			System.out.println("Ingrese la coordenada X:");
			int coordenadaX = sc.nextInt();
			System.out.println("Ingrese la coordenada Y");
			int coordenadaY = sc.nextInt();
	
			Dama dama = new Dama(coordenadaX, coordenadaY);
			dama.comportamientoPieza();
			
		}
		
		
		}while(op != 0);
		sc.close();
		

}
}