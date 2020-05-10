package com.sanvalero.FeedBackEntornos.model;

import java.time.LocalDate;

public class DetallePartido {
	private LocalDate fecha;
	private int golesLocal;
	private int golesVisitante;
	private String observaciones;
	
	private Partido partido;
	
	public DetallePartido(LocalDate fecha, int golesLocal, int golesVisitante, String observaciones, Partido partido) {
		super();
		this.fecha = fecha;
		this.golesLocal = golesLocal;
		this.golesVisitante = golesVisitante;
		this.observaciones = observaciones;
		this.partido = partido;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public int getGolesLocal() {
		return golesLocal;
	}

	public void setGolesLocal(int golesLocal) {
		this.golesLocal = golesLocal;
	}

	public int getGolesVisitante() {
		return golesVisitante;
	}

	public void setGolesVisitante(int golesVisitante) {
		this.golesVisitante = golesVisitante;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	public Partido getPartido() {
		return partido;
	}

	public void setPartido(Partido partido) {
		this.partido = partido;
	}
}
