package test;
import static org.junit.Assert.*;

import org.junit.Test;

import src.Sistema;
import src.Usuario;

public class testSistema {

	@Test
	public void queSePuedaCrearUnSistema() {
		String nombreDelSistemaEsperado = "Ricardo";
		Integer cantidadMaximaDeUsuarios = 8;
		
		Sistema nuevo = new Sistema (nombreDelSistemaEsperado, cantidadMaximaDeUsuarios);
		
		assertNotNull(nuevo);
		
		
	}
	@Test
	public void queSePuedaAgregarUnUsuario() {
		String nombreDelSistemaEsperado = "Ripcom";
		Integer cantidadMaximaDeUsuarios = 8;
		String nombreUsuario = "pepe argento";
		Sistema nuevo = new Sistema (nombreDelSistemaEsperado, cantidadMaximaDeUsuarios);
		Usuario usuario = new Usuario(nombreUsuario);
		
		Boolean resultado = nuevo.agregarUsuario(usuario);
		
		System.out.println(nuevo.getUsuarios().size());
		assertTrue(resultado);
	}
	
	
}
