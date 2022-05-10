package src;
import java.util.ArrayList;

public class Sistema {
	
	private String nombreDelSistema;
	private Integer cantidadMaxima;
	private ArrayList<Usuario>usuarios;
	public Sistema(String nombreDelSistema, Integer cantidadMaxima) {
		this.nombreDelSistema = nombreDelSistema;
		this.cantidadMaxima = cantidadMaxima;
		usuarios= new ArrayList<Usuario>();
	}

	public Boolean agregarUsuario(Usuario usuario) {
		Boolean exito = null;
		if(usuarios.contains(usuario)){
			exito=false;
		}else {
			usuarios.add(usuario);
			exito =true;
		}
		return exito;
		
	}

	public String getNombreDelSistema() {
		return nombreDelSistema;
	}

	public void setNombreDelSistema(String nombreDelSistema) {
		this.nombreDelSistema = nombreDelSistema;
	}

	public Integer getCantidadMaxima() {
		return cantidadMaxima;
	}

	public void setCantidadMaxima(Integer cantidadMaxima) {
		this.cantidadMaxima = cantidadMaxima;
	}

	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

}
