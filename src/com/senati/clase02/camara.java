package com.senati.clase02;

public class camara {
	//atributos de la clase camara
	String Descripcion;
	String Modelo;
	float Precio;
	
	
	//Metodos constructor
	public camara(String descripcion, String modelo, float precio) {
		super();
		Descripcion = descripcion;
		Modelo = modelo;
		Precio = precio;
	}

	
	
	//Metodo de acceso
	public camara() {
		super();
	}

	public String getDescripcion() {
		return Descripcion;
	}

	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}

	public String getModelo() {
		return Modelo;
	}

	public void setModelo(String modelo) {
		Modelo = modelo;
	}

	public float getPrecio() {
		return Precio;
	}

	public void setPrecio(float precio) {
		Precio = precio;
	}

	@Override
	public String toString() {
		return "camara [Descripcion=" + Descripcion + ", Modelo=" + Modelo + ", Precio=" + Precio + "]";
	}
	
	//Metodo para mostrar

}
