package Logic;

public class Peon extends Pieza implements ComportamientoPieza {

	public Peon(int coordenadaX, int coordenadaY) {
		super(coordenadaX, coordenadaY);
		
	}

	@Override
	public void comportamientoPieza() {
		int y = this.getCoordenadaY();
		if (y>6) {
			System.out.println("Maximo de movimientos de casilla posibles: 2 ");
		}
		else if(y<6) {
			System.out.println("Maximo de movimientos de casilla posibles: 1 ");
		}
		
	}

}
