/**
 * 
 */
package hundirFlota;

import java.util.Scanner;

/**
 * @author corda
 *
 */
public class HundirFlota {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		// Presentamos el juego
		System.out.println("COMIENZA EL JUEGO!!");
		System.out.println("¿Quieres un tablero por defecto? Responde SI o NO");
		String respuesta = sc.nextLine();
		Tablero tablero = new Tablero();
		
		if(respuesta.equals("NO")) {
			System.out.println("Introduce el número de filas: ");
			int filas = Integer.parseInt(sc.nextLine());
			System.out.println("Introduce el número de columnas: ");
			int columnas = Integer.parseInt(sc.nextLine());
			tablero = new Tablero(filas, columnas);
			
		} else if (respuesta.equals("SI")){
			tablero = new Tablero();
			
		} else { 
			System.out.println("Como no hay repsuesta, se finalizara la ejecución. Bye");
			System.exit(0);
		}
		
		System.out.println("¿Cuantos barcos quieres construir?");
		int num = Integer.parseInt(sc.nextLine());
		System.out.println("\n");
		System.out.println("EL tablero se ha organizado");
		System.out.println("\n");
		
		//Presentación del tablero.
		tablero.addShip(num);
		tablero.showMap();
		
		System.out.println("\n");
		System.out.println("Introduce la coordenada horizontal: ");
		int coorHor = Integer.parseInt(sc.nextLine());
		System.out.println("Introduce la coordenada vertical: ");
		int coorVer = Integer.parseInt(sc.nextLine());
		
		do {
			tablero.shoot(coorHor, coorVer);
		} while (!tablero.checkVictory());
	}
	
	
		
	
	
	
	

}
