package modelo;

public class Equipo /*implements Comparable<Equipo>*/ {
	private int idEquipo;
	private String nombreCorto;
	private String nombre;
	
	
	public Equipo() {
		//Constructor vacío
	}
	
	
	public Equipo(int idEquipo, String nombreCorto, String nombre) {
		super();
		this.idEquipo = idEquipo;
		this.nombreCorto = nombreCorto;
		this.nombre = nombre;
	}
	
	


	// Redefinimos el método toString de Object   30/01/2019
	@Override
	public String toString() {
		return this.nombre;
	}

/*		
	// 06/02/2018
	@Override
	public int compareTo(Equipo o) {
		if (this.getIdEquipo() > o.getIdEquipo()) {
			return 1;  // Devolvemos un número positivo
			
		}else if(this.getIdEquipo() < o.getIdEquipo()) {
			return -1;
		 }	
		else {
			return 0;
		}
	}
	

	
	
	
	*/

	public int getIdEquipo() {
		return idEquipo;
	}


	public void setIdEquipo(int idEquipo) {
		this.idEquipo = idEquipo;
	}


	public String getNombreCorto() {
		return nombreCorto;
	}


	public void setNombreCorto(String nombreCorto) {
		this.nombreCorto = nombreCorto;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}	
}
