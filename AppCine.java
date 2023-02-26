package cine;

import java.util.ArrayList;
import java.util.Scanner;

public class AppCine {

	public ArrayList<Pelicula> peliculas;
	
	public AppCine() {
		this.peliculas=new ArrayList<>();
	}
	
	public ArrayList<Pelicula> getPeliculas() {
		return peliculas;
	}
	
	public void setPeliculas(ArrayList<Pelicula> peliculas) {
		this.peliculas = peliculas;
	}


	public static void main(String[] args) {
		AppCine app=new AppCine();
		//Carga inical
		app.getPeliculas().add(new Pelicula("El Padrino", "Coppola", "Drama", 1972));
		app.getPeliculas().add(new Pelicula("Harry Potter y la piedra filosofal", "J.K.Rowling", "Fantasía/Aventura", 2001));
		app.getPeliculas().add(new Pelicula("Toy Story", "John Lasseter", "Infantil/Aventura", 1995));
		
		
		
		
		int opcion=0;
		Scanner teclado=new Scanner(System.in);
		do {
			app.menu();
			opcion=teclado.nextInt();
			switch(opcion) {
			case 1:
				app.nuevaPelicula();
				break;
			case 2:
				app.borrarPelicula();
				break;
			case 3:
				app.mostrarPeliculas();
				break;
			case 4:
				System.out.println("Género: ");
				String genero=teclado.next();
				app.buscarGenero(genero);
				break;
				
			}
			
		}while(opcion!=5);
	}

	private void borrarPelicula() {
		int i=1;
		Scanner teclado=new Scanner(System.in);
		
		for(Pelicula p:this.getPeliculas()) {
			System.out.println(i+") "+p.getNombre());
			i++;
		}
		System.out.println("¿Qué película quieres borrar?");
		int indice=teclado.nextInt();
		this.getPeliculas().remove(indice-1);
	}

	private void buscarGenero(String genero) {
		for(Pelicula p: this.getPeliculas()) {
			if(p.getGenero().equalsIgnoreCase(genero)) {
				System.out.println(p.getNombre());
			}
		}
		
	}

	private void mostrarPeliculas() {
		for(Pelicula p: this.getPeliculas()) {
			p.mostrarPelicula();
		}
		
	}
	private void nuevaPelicula() {
		Scanner tec=new Scanner(System.in);
		System.out.println("Nombre: ");
		String nombre=tec.nextLine();
		System.out.println("Género: ");
		String genero=tec.nextLine();
		System.out.println("Director: ");
		String director=tec.nextLine();
		System.out.println("Año: ");
		int año=tec.nextInt();
		
		this.getPeliculas().add(new Pelicula(nombre, director, genero, año));
	}

	private void menu() {
		System.out.println("1. Añadir película");
		System.out.println("2. Borrar película");
		System.out.println("3. Mostrar película");
		System.out.println("4. Buscar por género");
		System.out.println("5. Salir");
		System.out.println("Elige una opción");
		
	}
}
