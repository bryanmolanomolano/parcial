package Logic;

public class Caballo extends Pieza implements ComportamientoPieza {

	public Caballo(int coordenadaX, int coordenadaY) {
		super(coordenadaX, coordenadaY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comportamientoPieza() {
		int x = this.getCoordenadaX();
		int y = this.getCoordenadaY();
		if (x==1 && y==1 || x==8 && y==0|| x==1 && y==8 || x==8 && y==8) {
			System.out.println("Maximo de movimientos de casilla posibles: 2 ");
		}
		else if(x==2 && y==2 || x==7 && y==2 || x==7 && y==7||x==2 && y==7) {
			System.out.println("Maximo de movimientos de casilla posibles: 4 ");
		}
		else if(x>1 && x<8 && y==1 || y>1 && y<8 && x==8 || x>1 && x<8 && y==8 || y>1 && y<8 && x==1) {
			System.out.println("Maximo de movimientos de casilla posibles: 4 ");
		}
		else if(x>2 && x<7 && y==2 || y>2 && y<1 && x==7 || x>2 && x<7 && y==7 || y>2 && y<7 && x==2) {
			System.out.println("Maximo de movimientos de casilla posibles: 6 ");
		}
		else if(x==3 && y==3 || x==6 && y==3 || x==6 && y==6||x==3 && y==6) {
			System.out.println("Maximo de movimientos de casilla posibles: 8 ");
		}
		else if(x>3 && x<6 && y==3 || y>3 && y<2 && x==6 || x>3 && x<6 && y==3 || y>2 && y<7 && x==2) {
			System.out.println("Maximo de movimientos de casilla posibles: 6 ");
		}
		
			
		
		
	}

}
