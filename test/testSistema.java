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
	public void queSeRegistrarUnUsuario() {
		String nombreDelSistemaEsperado = "Ripcom";
		Integer cantidadMaximaDeUsuarios = 8;
		String nombreUsuario = "pepe argento";
		Integer edadUsuario = 20;
		Sistema nuevo = new Sistema (nombreDelSistemaEsperado, cantidadMaximaDeUsuarios);
		Usuario usuario = new Usuario(nombreUsuario, edadUsuario);
		
		Boolean resultado = nuevo.registrarUsuario(usuario);
		
		System.out.println(nuevo.getUsuarios().size());
		assertTrue(resultado);
	}
	@Test 
	public void queSePuedaSaberLaCantidadDeLogeados() {
		String nombreDelSistemaEsperado = "Ripcom";
		Integer cantidadMaximaDeUsuarios = 8;
		String nombreUsuario = "pepe argento";
		Integer edadUsuario = 20;
		Sistema nuevo = new Sistema (nombreDelSistemaEsperado, cantidadMaximaDeUsuarios);
		Usuario usuario = new Usuario(nombreUsuario, edadUsuario);
		
		Boolean resultado = nuevo.registrarUsuario(usuario);
		
		nuevo.cantidadDeUsuariosLogeados();
	}
	
	
}
