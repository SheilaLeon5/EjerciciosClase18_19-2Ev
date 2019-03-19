package modelo;

public class Jugador extends Persona implements Comparable<Persona> {
	private int idJugador;
	private int dorsal;
	private int codigoEquipo;
	
	
	
	public Jugador() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public Jugador(String nif, String nombre, int longitudPaso, String fecha_nac, char sexo, int idJugador,int dorsal,int codigoEquipo) {
		super(nif, nombre, longitudPaso, fecha_nac, sexo);
		this.idJugador = idJugador;
		this.dorsal = dorsal;
		this.codigoEquipo = codigoEquipo;
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	//19/03/2019
	public int compareTo(Jugador o1, Jugador o2) {
		if(o1.getNombre().compareToIgnoreCase(o2.getNombre()) > 1) {
			return 1;
		}
		else if(o1.getNombre().compareToIgnoreCase(o2.getNombre()) < -1) {
			return -1;
		}else {
			if (o1.getIdJugador() > o2.getIdJugador() ) {
				return 1;
			}else {
				return -1;
			}
		}
	}
	
	
	
	
	
	public int getIdJugador() {
		return idJugador;
	}
	public void setIdJugador(int idJugador) {
		this.idJugador = idJugador;
	}
	public int getDorsal() {
		return dorsal;
	}
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	public int getCodigoEquipo() {
		return codigoEquipo;
	}
	public void setCodigoEquipo(int codigoEquipo) {
		this.codigoEquipo = codigoEquipo;
	}
	
	
	
	
	
}



