package com.maquina;

public class PruebasMaquina {

	public static void main(String[] args) {
		
		System.out.println("---------Prueba refresco------------");
		//Refresco r2= new Refresco("aa",1,2);
		//System.out.println(r);
		Maquina a = new Maquina(10);
		System.out.println("//muestro cuanto stock hay//");
		System.out.println(a.getStock());
		a.addBebida("cola");
		a.addBebida("cola");
		System.out.println("//Despues de añadir dos refrescos muestro el stock//");
		System.out.println(a.getStock());
		
		
		System.out.println("//Enseño el array//");
		for(Refresco r : a.getBebidas()) {
			if(r !=null) {
				System.out.println(r);
			}
		}
		a.borraRefresco(1);//Este es solo de pruebas el bueno es el de a.vender que te devuleve los cambios y aparte hace esto tambien
		System.out.println("//compro un refresco y miro stock//");
		System.out.println(a.getStock());
		System.out.println("//muestro cuantos he vendido//");
		a.getVendidos();
		
		
		System.out.println("//Vendo y muestro los cambios respecto a lo introducido//");
		System.out.println(a.vender(100, 0));
		System.out.println("//muestro el stock otra vez//");
		System.out.println(a.getStock());
		System.out.println("-------------DONE-------------");
		System.out.println("Stock, mostrar stock, comprar, cambios");
		System.out.println("-----------------------------");

}
	}
