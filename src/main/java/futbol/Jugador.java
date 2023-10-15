package futbol;

public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	
	public Jugador(String nombre, int edad, String posicion, short goles, byte dorsal) {
		
		super(nombre, edad, posicion);
		this.golesMarcados = goles;
		this.dorsal = dorsal;
	}
	
	public Jugador() {
		
		super();
		this.golesMarcados = 289;
		this.dorsal = 7;
	}

	public int compareTo(Futbolista o) {
		
		if (this.getEdad() > o.getEdad()) {
			
			return this.getEdad()-o.getEdad();
		}
		
		else {
			
			return o.getEdad()-this.getEdad();
		}
	}

	public boolean jugarConLasManos() {
		return false;
	}
	
	public String toString() {
		
		return "El futbolista "+this.getNombre()+" tiene "+this.getEdad()+", y juega de "+this.getPosicion()+" con el dorsal "+this.dorsal+". Ha marcado "+this.golesMarcados;
	}
}