
package Logic;

abstract class Pieza {
private int coordenadaX;
private int coordenadaY;

public Pieza(int coordenadaX, int coordenadaY){
	this.coordenadaX = coordenadaX;
	this.coordenadaY = coordenadaY;
}



public int getCoordenadaX(){
	return coordenadaX;
	
}
public int getCoordenadaY(){
	return coordenadaY;
}


public void comportamientoPieza() {
	
}
}
