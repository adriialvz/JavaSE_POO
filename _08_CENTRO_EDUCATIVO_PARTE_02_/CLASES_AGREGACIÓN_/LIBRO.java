package CLASES_AGREGACIÓN_;

public class LIBRO {

	//PROPIEDADES
	private String titulo;
	private String genero;
	private AUTOR autor;
	
	
	//CONSTRUCTOR
	public LIBRO(String titulo, String genero, AUTOR autor) {
		
		this.titulo = titulo;
		this.genero = genero;
		this.autor = autor;
	}


	//METODOS
	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public AUTOR getAutor() {
		return autor;
	}


	public void setAutor(AUTOR autor) {
		this.autor = autor;
	}


	@Override
	public String toString() {
		return "LIBRO [titulo=" + titulo + ", genero=" + genero + ", " + autor + "]";
	}
}
