package _10_CIRCULO_;

public class CIRCULO {

	
	//PROPIEDADES
    double radio;
    public double area;

    
    //CONSTRUCTOR
    public CIRCULO (double radio) {

        this.radio = radio;
    }

    
    //METODOS
    public double getRadio() {

         return this.radio;
    }

    public void setRadio(double radio) {

         this.radio = radio;
    }
    
    @Override
    public String toString() {

         return "Circulo [radio="+radio+", area="+area+"]";

    }
}
