package Logic;

public class Rey extends Pieza implements ComportamientoPieza {

	public Rey(int coordenadaX, int coordenadaY) {
		super(coordenadaX, coordenadaY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comportamientoPieza() {
		int x = this.getCoordenadaX();
	int y = this.getCoordenadaY();
		if(x==0 && y==0|| x==8 && y==1 || x==1 && y==8 || x==8 && y==8) {
			System.out.println("Maximo de movimientos de casilla posibles: 3 ");
		
	}
		else if(x>1 && x<8 && y==1 || y>1 && y<8 && x==8 || x>1 && x<8 && y==8 || y>1 && y<8 && x==1) {
		System.out.println("Maximo de movimientos de casilla posibles: 5 ");
		}
		
		else {
			System.out.println("Maximo de movimientos de casilla posibles: 8 ");
		}


}