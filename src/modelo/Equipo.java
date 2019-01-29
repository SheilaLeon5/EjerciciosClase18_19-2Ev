package modelo;

public class Equipo {
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
