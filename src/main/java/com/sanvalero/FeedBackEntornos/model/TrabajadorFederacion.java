package com.sanvalero.FeedBackEntornos.model;

import java.util.ArrayList;
import java.util.List;

public class TrabajadorFederacion {
	
	private List<Jugador> jugadores;
	private List<Equipo> equipos;
	private List<Partido> partidos;
	
	public TrabajadorFederacion() {
		jugadores = new ArrayList<>();
		equipos = new ArrayList<>();
		partidos = new ArrayList<>();
	}
	
	/**
	 * Método que permite registrar un Equipo por parte de los trabajadores de la federación
	 * @param equipo
	 * @return
	 */
	public boolean registrarEquipo(Equipo equipo) {
		for(Equipo nuevoEquipo : equipos) {
			if(nuevoEquipo.getNombre().equals(equipo.getNombre())) {
				return false;
			}
		}
		equipos.add(equipo);
		return true;	
	}
	
	/**
	 * Método que permite registrar un Jugador por parte de los trabajadores de la federación
	 * @param jugador
	 * @return
	 */
	public boolean registrarJugador(Jugador jugador) {
		for(Jugador nuevoJugador : jugadores) {
			if(nuevoJugador.getNombre().equals(jugador.getNombre())){
				return false;
				
			}else if (jugador.getNombre() == null) {
				return false;
			}
		}
		jugadores.add(jugador);
		return true;
	}
	
	/**
	 * Método que permite registrar un Equipo por parte de los trabajadores de la federación
	 * @param partido
	 * @return
	 */
	public boolean registrarPartido(Partido partido) {
			
			if(partido.getEquipoLocal() == null) {
				return false;
			} else if(partido.getEquipoVisitante() == null) {
				return false;
			}
	
		partidos.add(partido);
		return true;
	}
}
