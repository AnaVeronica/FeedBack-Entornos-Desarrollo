package com.sanvalero.FeedBackEntornos.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Partido {
	private String equipoLocal;
	private String equipoVisitante;
	private String campo;
	private String arbitro;
	private String incidencia;

	private List<DetallePartido> detalles;
	
	public Partido(String equipoLocal, String equipoVisitante, String campo, String arbitro, String incidencia) {
		super();
		this.equipoLocal = equipoLocal;
		this.equipoVisitante = equipoVisitante;
		this.campo = campo;
		this.arbitro = arbitro;
		this.incidencia = incidencia;
		
		detalles = new ArrayList<>();
	}
	
	public void registrarDetalles(LocalDate fecha, int golesLocal, int golesVisitante, String observaciones, Partido partido) {
		DetallePartido nuevoDetalle = new DetallePartido(fecha, golesLocal, golesVisitante, observaciones, partido);
		detalles.add(nuevoDetalle);
	}
	
	public String getEquipoLocal() {
		return equipoLocal;
	}

	public void setEquipoLocal(String equipoLocal) {
		this.equipoLocal = equipoLocal;
	}

	public String getEquipoVisitante() {
		return equipoVisitante;
	}

	public void setEquipoVisitante(String equipoVisitante) {
		this.equipoVisitante = equipoVisitante;
	}

	public String getCampo() {
		return campo;
	}

	public void setCampo(String campo) {
		this.campo = campo;
	}

	public String getArbitro() {
		return arbitro;
	}

	public void setArbitro(String arbitro) {
		this.arbitro = arbitro;
	}

	public String getIncidencia() {
		return incidencia;
	}

	public void setIncidencia(String incidencia) {
		this.incidencia = incidencia;
	}
	
}
