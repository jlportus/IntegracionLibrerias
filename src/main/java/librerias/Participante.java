package librerias;

public class Participante {

	private String id;
	private String nombre;
	
	

	public Participante(String id, String nombreString) {
		super();
		this.id = id;
		this.nombre = nombreString;
	}

	public Participante() {
		
	}

	@Override
	public String toString() {
		return "Participante [id=" + id + ", nombre=" + nombre + "]";
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getElNombre() {
		return getNombre();
	}
}
