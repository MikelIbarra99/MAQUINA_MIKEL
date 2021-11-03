package com.maquina;

public  class Refresco {
	
	private String nombreRefresco;
	private double precio= 2;
	private int stock=5;
	

	public Refresco (String nombreRefresco, double precio) {
		super();
		
		//VALIDAR no null
		this.nombreRefresco=nombreRefresco;
		this.precio=precio;
		//this.stock= stock;
	}
	
	
	public String getNombreRefresco() {
		return nombreRefresco;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	
	public int getStock() {
			return stock;
	}
	
	public boolean estaAgotado() {
		return this.stock == 0;
	}
	
	public boolean entregar() {
		boolean res = false;
		if (!this.estaAgotado()) {
			this.stock --;
			res = true;
		}
		return res;
	}
	
	
	
	public void reponer(int cantidad) {
		if(stock<5 && cantidad+stock <= 5) {
			
			this.stock += cantidad;
		}
		else {
			System.out.println("No puedes ingresar tantos refrescos");
		}
	}

	@Override
	public String toString() {
		return "Refresco [nombreRefresco=" + nombreRefresco + ", precio=" + precio+"€" ;
	}


}
