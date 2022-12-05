package _09_TEATRO_;


	public interface SALA {
	    public String verProgramacion();
	    public String verLocalidades();
	    public String verLocalidadesOcupadas();
	    public String venderLocalidad(int fila, int butaca, ESPECTADOR e);
	    public String cancelarLocalidad(int fila, int butaca);
	    public String consultarLocalidad(int fila, int butaca);
	    public double calcularRecaudacion(); 
	}
