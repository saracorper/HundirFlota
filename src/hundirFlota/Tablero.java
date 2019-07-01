/**
 * 
 */
package hundirFlota;

/**
 * @author corda
 *
 */
public class Tablero {
	
	int[][] matriz;
	
	//Costructor vacío.
	public Tablero() {
		this(10, 10);
	}
	
	// Constructor con parámetros.
	public Tablero(int filas, int columnas ) {
		this.matriz =  new int[filas][columnas];		
	}
	
	//Métodos 
	public void addShip(int num) {
		int numNaves = num;
		int contador = 0;
		
		for(int i = 0; i < matriz.length; i++) { 
			for ( int j = 0;j < matriz[i].length; j++ ) {
				if(contador < numNaves) {
						matriz[i][j] = (int)Math.round(Math.random());
						if(matriz[i][j] == 1)contador++;	
				} else {
						matriz[i][j] = 0;
				}
			}		
		}
	} 
	
	public void showMap() {
		for(int i = 0; i < matriz.length; i++) {
			for(int j = 0; j < matriz[i].length; j++) {
				System.out.print(matriz[i][j]);
			}
			System.out.println();
		}
	}
	
	public void shoot(int coorHor, int coorVer) {
		int i = coorHor;
		int j = coorVer;
		
		if(matriz[i][j] == 1) {
			System.out.println("Genial, has hundido un barco!");
			matriz[i][j] = 0;
		} else {
			System.out.println("OHHHH! Vuelve a intentarlo");
		}
	}
	
	public boolean checkVictory() {
		int contador = 0;
		
		for(int i = 0; i < matriz.length; i++) { 
			for (int j = 0; j < matriz[i].length; j++) {
				if(matriz[i][j] == 1) { 
					contador++;
					if(contador == 0) {
						System.out.println("Felicidades! Has Hundido todos los barcos");
						return true;
					}
		        }
	        }
		}
		System.out.println("Faltan " + contador + "naves por destruir");
		return false;
    }
}
