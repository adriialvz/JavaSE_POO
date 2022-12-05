package _06_OPERACIONES_RETURN_;

public class VIVIENDA {

	
		//PROPIEDADES
        private String zona;
        private int metros;
        private float precioMetro;
        
     
        //CONSTRUCTOR
        public VIVIENDA(String zona, int metros, float precioMetro) {

                      this.zona = zona;

                      this.metros = metros;

                      this.precioMetro = precioMetro;
        }

        //MÉTODOS
        public String informar() {

                      return "Bonito piso en "+zona+" con "+metros+" metros cuadrados por valor de "+(precioMetro * metros);
           }
}
	

