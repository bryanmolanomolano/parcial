package Logic;

public class Dama extends Pieza implements ComportamientoPieza {

	public Dama(int coordenadaX, int coordenadaY) {
		super(coordenadaX, coordenadaY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comportamientoPieza() {
		int x = this.getCoordenadaX();
		int y = this.getCoordenadaY();
		if(x>1 && y==1 || x==8 && y>1 || x>1 &&  y==8 || x==8 && y>1) {
			System.out.println("Maximo de movimientos de casilla posibles: 8 ");
		}
		
		
	}

}
