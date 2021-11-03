package com.maquina;

public class Maquina {
	
	private int numeroBebidas;
	private Refresco[] refresco;
	private int vendidos;
	
	//dinero
	private double recaudado;
	private double cambios;
	
	public Maquina(double cambiosIniciales) {
		super();
		this.refresco = new Refresco[5];
		this.cambios= cambiosIniciales;
		this.recaudado=0;
		
	}
	public int getStock() {
		return numeroBebidas;
	}
	
	public void addBebida(String n) {
		this.refresco[numeroBebidas]= new Refresco(n,2);
		numeroBebidas++;
	}
	
	public Refresco getBebida(int index) {
		
		return refresco[index];
	}
	
	public Refresco[] getBebidas() {
		return refresco;
	}
	
	public void borraRefresco(int index) {
		refresco[index]=null;
		numeroBebidas--;
		vendidos++;
	}
	public void getVendidos() {
		System.out.println(vendidos);
	}
	
	public double vender(double dineroIng, int index) {
		double cambios=0;
		if(numeroBebidas==0) {
			System.out.println("No hay stock");
		}
		
		double cambioNec= dineroIng-this.refresco[index].getPrecio();
		refresco[index]=null;
		numeroBebidas--;
		vendidos++;
		if(cambioNec<0) {
			System.out.println("devolver"+ cambioNec +" dinero");
		}
		
		return cambioNec;
		
	}
	
	
	

}
