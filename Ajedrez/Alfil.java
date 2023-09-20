package Logic;

public class Alfil extends Pieza implements ComportamientoPieza {

	

	public Alfil(int coordenadaX, int coordenadaY) {
		super(coordenadaX, coordenadaY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comportamientoPieza() {
		int x = this.getCoordenadaX();
		int y = this.getCoordenadaY();
		if (x==1 || y==8) {
			System.out.println("Maximo de movimientos de casilla posibles: 7 ");
		}
		
		else if(x>3) {
			System.out.println("Maximo de movimientos de casilla posibles: 1 ");
		}
		
		
	}

}
