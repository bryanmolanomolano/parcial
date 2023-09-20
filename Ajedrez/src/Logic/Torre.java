package Logic;

public class Torre extends Pieza implements ComportamientoPieza {

	public Torre(int coordenadaX, int coordenadaY) {
		super(coordenadaX, coordenadaY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void comportamientoPieza() {
		System.out.println("Maximo de movimientos de casilla posibles: 14 ");
	}

}
