package modelo;

public class Equipo /*implements Comparable<Equipo>*/ {
	private int idEquipo;
	private String nombreCorto;
	private String nombre;
	
	
	private int pg;
	private int pe;
	private int pp;
	private int gf;
	private int gc;
	
	
	public Equipo() {
		//Constructor vac�o
	}
	
	
	public Equipo(int idEquipo, String nombreCorto, String nombre) {
		super();
		this.idEquipo = idEquipo;
		this.nombreCorto = nombreCorto;
		this.nombre = nombre;
	}
	
	


	// Redefinimos el m�todo toString de Object   30/01/2019
	@Override
	public String toString() {
		return this.nombre;
	}

/*		
	// 06/02/2018
	@Override
	public int compareTo(Equipo o) {
		if (this.getIdEquipo() > o.getIdEquipo()) {
			return 1;  // Devolvemos un n�mero positivo
			
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
	
	public int getPg() {
		return pg;
	}


	public int getPe() {
		return pe;
	}


	public int getPp() {
		return pp;
	}


	public int getGf() {
		return gf;
	}


	public int getGc() {
		return gc;
	}


	public void setPg(int pg) {
		this.pg = pg;
	}


	public void setPe(int pe) {
		this.pe = pe;
	}


	public void setPp(int pp) {
		this.pp = pp;
	}


	public void setGf(int gf) {
		this.gf = gf;
	}


	public void setGc(int gc) {
		this.gc = gc;
	}



	
	
}
