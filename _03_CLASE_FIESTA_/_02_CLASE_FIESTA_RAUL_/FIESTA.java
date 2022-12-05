package _02_CLASE_FIESTA_RAUL_;

import java.time.*;

public class FIESTA {

	
	 //Variable de clase común a todos los objetos fiesta
    private static int contadorFiestas;
    //Declaro un tipo enumerado cerrado de tipo fiesta protected para acceso dentro del paquete
    protected static enum tipoFiesta {DISFRACES, INFANTIL, CUMPLEAÑOS, CASTILLOS};
    //Declaro variable de tipoFiesta fiesta que la referencia
    protected tipoFiesta fiesta;
    private int numboca;
    private int numbebidas;
    //Declaro como tipo hoy y ahora de tipo date y localtime
    private LocalDate hoy;
    private LocalTime ahora;
    private int invitados;
    private LocalDateTime fechaHora;
    //Contructor sin argumentos
    public FIESTA(){
        //El tipo enumerado se inicializa a disfraces
        this.fiesta=fiesta.DISFRACES;
        this.numboca=0;
        this.numbebidas=0;
        this.hoy = LocalDate.now();
        this.ahora= LocalTime.now();
        this.fechaHora = LocalDateTime.of(hoy, ahora);
        this.invitados=0;
        contadorFiestas++;
        
    }
    public FIESTA(String tipo, int numbocadillos, int numbebidas){
        this.fiesta=fiesta.DISFRACES;
        this.numboca=numbocadillos;
        this.numbebidas=numbebidas;
        this.hoy = LocalDate.now();
        this.ahora= LocalTime.now();
        this.fechaHora = LocalDateTime.of(hoy, ahora);
        this.invitados=0;
        contadorFiestas++;
        
    }
    public void settipoFiesta(tipoFiesta tipo){
        this.fiesta=tipo;
    }
    public void setInvitados(int num){
        this.invitados=num;
    }
    public void setnumBoca(int num){
        this.numboca=num;
    }
    public void setBebidas(int num){
        this.numbebidas=num;
    }
    public void setFechaHora(LocalDateTime fecha){
        this.fechaHora=fecha;
    }
    public tipoFiesta gettipoFiesta(){
        return this.fiesta;
    }
    public int getnumBoca(){
        return this.numboca;
    }
    public int getnumBebidas(){
        return this.numbebidas;
    }
    public LocalDateTime getFechaHora(){
        return this.fechaHora;
    }
    public int getInvitados(){
        return this.invitados;
    } 
    public void Consultar(){
         System.out.println("Tipo fiesta:"+this.gettipoFiesta()+",fecha:"+this.getFechaHora()+",número invitados:"+this.getInvitados()+",Bebidas:"+this.getnumBebidas()+",Bocadillos:"+this.getnumBoca());
    }
    public void invitar (int num){
        this.invitados=this.invitados+num;
    }
    //Ya tenemos la sobrecarga aquí
    public void invitar (){
        this.invitados=this.invitados+1;
    }
    public void cancelarInvitación(int num){
        this.invitados=this.invitados-num;
    }
    public int precioFiesta() {
        //5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada bocadillo
        return 5*this.getInvitados()+2*this.getnumBebidas()+3*this.getnumBoca();
    }
     public int cuentaConstructor() {
        //5 euros por cada invitado, 2 euros por cada bebida y 3 euros por cada bocadillo
        return contadorFiestas;
     }
}
