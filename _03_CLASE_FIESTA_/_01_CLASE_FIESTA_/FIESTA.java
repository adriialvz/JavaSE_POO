package _01_CLASE_FIESTA_;

import java.time.*;

public class FIESTA {
	
	///INSTANCIA DE LA CLASE LOCALDATETIME CON PARAMETROS
	LocalDateTime fh= LocalDateTime.of(2022,02,15,07,05);
	
	//LLAMAMOS A LOS METODOS DE LOCALDATETIME Y GUARDAMOS INFORMACION EN LAS VARIABLES.
	int dia1=fh.getDayOfMonth();
	int mes1=fh.getMonthValue();
	int año1=fh.getYear();
									
	int hora1=fh.getHour();
	int min1=fh.getMinute();
	
	
	//PROPIEDADES
	private String tipo;
	private int bocadillos;
	private int bebidas;
	private int dia=dia1;	
	private int mes=mes1;
	private int año=año1;
	
	private int hora=hora1;	
	private int min=min1;
	
	private String fechaHora2;
	private String direccion;
	private int invitados;
	
	
	//CONSTRUCTOR CON PARAMETROS
	public FIESTA(String tipo, int bocadillos, int bebidas, String direccion) {
		this.tipo=tipo; 
		this.bocadillos=bocadillos;
		this.bebidas=bebidas; 
		this.dia=dia1;
		this.mes=mes1;
		this.año=año1;
		this.direccion=direccion;
		this.invitados=0;
	}
	
	
	//CONSTRUCTOR SIN PARAMETROS
	public FIESTA() {
		this.tipo="Sin categoria";
		this.bocadillos=5;
		this.bebidas=9;
		this.fechaHora2="El 24 de Enero de 2022 a las 22:00 ";
		this.direccion="Gran Vía 48, 35020 Madrid";
		this.invitados=0;
	}
	
	//METODO QUE CUENTA LOS BOCATAS EN FUNCION DEL NUMERO DE PERSONAS
	public void setBocatas() {
		bocadillos--;
	}
	
	//METODO QUE CUENTA LAS BEBIDAS EN FUNCION DEL NUMERO DE PERSONAS
	public void setBebidas() {
		bebidas--;
	}
	
	//METODO QUE SUMA EL NUMERO DE INVITADOS SEGUN EL NUMERO DE INVITADOS INTRODUCIDOS EN EL MAIN
	public void setInvitar() {
		invitados++;
	}
	
	//METODO QUE CANCELA EL NUMERO DE INVITADOS QUE SE HAN DADO DE BAJA SEGUN EL NUMERO INTRODUCIDO EN EL MAIN
	public void setCancelarInvitados() {
		invitados--;
	}
	
	//METODO QUE CALCULA EL PRECIO TOTAL DE LA FIESTA EN FUNCION DEL NUMERO DE INVITADOS MULTIPLICANDO * 5 QUE ES LO QUE VALE LA FIESTA POR PERSONA
	public double getPrecioFiesta() {
		return invitados*5;
	}
	
	//METODO QUE SACA TODA LA INFORMACION
	public String getConsultar1() {
		return "Tipo de fiesta: "+tipo+"\nBocadillos: "+bocadillos+ "\nBebidas: "+bebidas+"\nFecha y hora: "+dia+"/0"+mes+"/"+año+" a las ---->  "+"0"+hora+":0"+min+"\nDireccion: "+direccion+"\nInvitados: "+invitados+"\nEl precio total de la fiesta: "+getPrecioFiesta()+"€";
	}
	
	//METODO QUE SACA TODA LA INFORMACION
	public String getConsultar2() {
		return "Tipo de fiesta: "+tipo+"\nBocadillos: "+bocadillos+ "\nBebidas: "+bebidas+"\nFecha y hora: "+fechaHora2+"\nDireccion: "+direccion+"\nInvitados: "+invitados+"\nEl precio total de la fiesta: "+getPrecioFiesta()+"€";
	}
}
