package _09_TEATRO_;

public class OBRA {

		
		private String titulo; 
		private String genero; 
		private int minutosDuracion;

		public OBRA(String titulo, String genero, int minutosDuracion) {
			this.titulo = titulo;
			this.genero = genero; 
			this.minutosDuracion = minutosDuracion;
		}
		
		
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

		public int getMinutosDuracion() {
			return minutosDuracion;
		}

		public void setMinutosDuracion(int minutosDuracion) {
			this.minutosDuracion = minutosDuracion;
		}
	
}
