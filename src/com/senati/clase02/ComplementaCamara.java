package com.senati.clase02;

public class ComplementaCamara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		camara camara1 = new camara(); // Instancia de la clase Ca
		camara1.Descripcion="Camara Fotográfica";
		camara1.Modelo="Tripode";
		camara1.Precio=800f;
		
		System.out.println(camara1.toString());
		
		camara camara2= new camara("Camara Fotográfica", "Seus", 1800);
		System.out.println(camara2.toString());
		}

}
