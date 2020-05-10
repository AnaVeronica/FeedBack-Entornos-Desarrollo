package com.sanvalero.FeedBackEntornos.model;

public class Equipo {
	private String nombre;
	private String patrocinador;
	private String colorPrimeraCamiseta;
	private String colorSegundaCamiseta;
	private String categoria;
	
	public Equipo(String nombre, String patrocinador, String colorPrimeraCamiseta, String colorSegundaCamiseta, String categoria) {
		super();
		this.nombre = nombre;
		this.patrocinador = patrocinador;
		this.colorPrimeraCamiseta = colorPrimeraCamiseta;
		this.colorSegundaCamiseta = colorSegundaCamiseta;
		this.categoria = categoria;
		
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPatrocinador() {
		return patrocinador;
	}

	public void setPatrocinador(String patrocinador) {
		this.patrocinador = patrocinador;
	}

	public String getColorPrimeraCamiseta() {
		return colorPrimeraCamiseta;
	}

	public void setColorPrimeraCamiseta(String colorPrimeraCamiseta) {
		this.colorPrimeraCamiseta = colorPrimeraCamiseta;
	}

	public String getColorSegundaCamiseta() {
		return colorSegundaCamiseta;
	}

	public void setColorSegundaCamiseta(String colorSegundaCamiseta) {
		this.colorSegundaCamiseta = colorSegundaCamiseta;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
}
