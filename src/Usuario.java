package src;
import java.util.Objects;

public class Usuario {
	private String nombreUsuario;
	private Integer edad;
	private Boolean estaLogeado;

	public Usuario (String nombreUsuario, Integer edad) {
		this.nombreUsuario = nombreUsuario;
		this.edad = edad;
		estaLogeado = false;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreUsuario);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return Objects.equals(nombreUsuario, other.nombreUsuario);
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Boolean getEstaLogeado() {
		return estaLogeado;
	}

	public void setEstaLogeado(Boolean estaLogeado) {
		this.estaLogeado = estaLogeado;
	}
	

	
	
}
