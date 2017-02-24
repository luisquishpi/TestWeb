package ec.test;


import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Persona {

	public Persona() {

	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 10, unique = true, nullable = false)
	private String cedula;

	@Column(length = 50, nullable = false)
	private String nombre;

	@Column(length = 50, nullable = false)
	private String apellido;

	@Column(nullable = false)
	private Integer sexo;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date fechaNacimiento;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getSexo() {
		return sexo;
	}

	public void setSexo(Integer sexo) {
		this.sexo = sexo;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		return "Persona [id=" + id + ", Cedula=" + cedula + ", Nombre="
				+ nombre + ", Apellido=" + apellido + ", Sexo=" + sexo
				+ ", FechaNacimiento=" + fechaNacimiento + "]";
	}

}
