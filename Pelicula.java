package cine;

public class Pelicula {

	private String nombre;
	private String director;
	private String genero;
	private int año;
	
	public Pelicula(String nombre, String director, String genero, int año) {
		super();
		this.nombre = nombre;
		this.director = director;
		this.genero = genero;
		this.año = año;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAño() {
		return año;
	}

	public void setAño(int año) {
		this.año = año;
	}
	
	

	@Override
	public String toString() {
		return "Pelicula [Nombre=" + nombre + ", Director=" + director + ", Género=" + genero + ", Año=" + año + "]";
	}
	public void mostrarPelicula() {
		System.out.println("La pelicula "+this.getNombre()+" pertenece al género "+this.getGenero());
		System.out.println("fue dirigida por "+this.getDirector()+ " en el año "+this.getAño());
	}
	
}
