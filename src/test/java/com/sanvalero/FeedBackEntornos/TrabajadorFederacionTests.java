package com.sanvalero.FeedBackEntornos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.sanvalero.FeedBackEntornos.model.Equipo;
import com.sanvalero.FeedBackEntornos.model.Jugador;
import com.sanvalero.FeedBackEntornos.model.Partido;
import com.sanvalero.FeedBackEntornos.model.TrabajadorFederacion;

public class TrabajadorFederacionTests {
	
	private static TrabajadorFederacion torneo;
	
	@BeforeAll
	public static void crearTorneo() {
		torneo = new TrabajadorFederacion();
	}
	
	@Test
	public void registrarJugador() {
		Jugador jugador1 = new Jugador("Ronaldo", null, null, null,0);
		Jugador jugador2 = new Jugador(null, null, null, null, 0);
		
		assertEquals(true, torneo.registrarJugador(jugador1));
		assertEquals(false, torneo.registrarJugador(jugador2));	
	}
	
	@Test
	public void registrarEquipo() {
		Equipo EquipoBlanco = new Equipo("Real Madrid", "Fly Emirates", "Blanco", "Negro", "Primera division");
		Equipo EquipoAzulGrana = new Equipo("FC Barcelona", "Rakuten", "Azul y grana", "Roja y amarilla", "Primera division");
		Equipo EquipoBlanco2 = new Equipo("Real Madrid", "", "", "", "");
		
		assertEquals(true, torneo.registrarEquipo(EquipoBlanco));
		assertEquals(true, torneo.registrarEquipo(EquipoAzulGrana));
		assertEquals(false, torneo.registrarEquipo(EquipoBlanco2));
	}
	
	@Test
	public void registrarPartido() {
		Partido partido1 = new Partido("Real Madrid", null, "Santiago Bernabeu", null, null);
		Partido partido2 = new Partido(null, "FC Barcelona", null, null, null);
		Partido partido3 = new Partido("Real Madrid", "FC Barcelona", "Santiago Bernabeu", null, null);
		
		assertEquals(false, torneo.registrarPartido(partido1));
		assertEquals(false, torneo.registrarPartido(partido2));
		assertEquals(true, torneo.registrarPartido(partido3));
	}
	
}
