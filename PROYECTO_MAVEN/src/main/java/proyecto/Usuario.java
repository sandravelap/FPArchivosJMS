package proyecto;

import java.util.ArrayList;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;

@XmlRootElement(name="usuarios")
@XmlType(propOrder={"rol", "nombre", "contrasenia", "puntuacion", "familiaProfesional", "contacto", "alumnos", "profesores"})

public class Usuario {

	private String rol, nombre, contrasenia, familiaProfesional, contacto;
	private Double puntuacion;
	//private ArrayList<Proyecto> historial;
	//private ArrayList<Proyecto> proyectosFavoritos;
	
	private ArrayList<Alumno> alumnos;
	private ArrayList<Profesor> profesores;
	
	public Usuario() {}
	
	public Usuario(String rol, String nombre, String contrasenia, String familiaProfesional, String contacto, Double puntuacion, ArrayList<Alumno> alumnos, ArrayList<Profesor> profesores) {
		this.rol = rol;
		this.nombre = nombre;
		this.contrasenia = contrasenia;
		this.familiaProfesional = familiaProfesional;
		this.contacto = contacto;
		this.puntuacion = puntuacion;
		//this.historial = historial;
		//this.proyectosFavoritos = proyectosFavoritos;
		this.alumnos = alumnos;
		this.profesores = profesores;
	}

	@XmlElement(name="rol")
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}

	@XmlElement(name="nombre")
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@XmlElement(name="contrasenia")
	public String getContrasenia() {
		return contrasenia;
	}
	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}

	@XmlElement(name="familiaProfesional")
	public String getFamiliaProfesional() {
		return familiaProfesional;
	}
	public void setFamiliaProfesional(String familiaProfesional) {
		this.familiaProfesional = familiaProfesional;
	}

	@XmlElement(name="contacto")
	public String getContacto() {
		return contacto;
	}
	public void setContacto(String contacto) {
		this.contacto = contacto;
	}

	@XmlElement(name="puntuacion")
	public Double getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(Double puntuacion) {
		this.puntuacion = puntuacion;
	}

	/*@XmlElementWrapper(name="proyectos")
	@XmlElement(name="historial")
	public ArrayList<Proyecto> getHistorial() {
		return historial;
	}
	public void setHistorial(ArrayList<Proyecto> historial) {
		this.historial = historial;
	}

	@XmlElementWrapper(name="proyectos")
	@XmlElement(name="favoritos")
	public ArrayList<Proyecto> getProyectosFavoritos() {
		return proyectosFavoritos;
	}
	public void setProyectosFavoritos(ArrayList<Proyecto> proyectosFavoritos) {
		this.proyectosFavoritos = proyectosFavoritos;
	}*/

	@XmlElementWrapper(name="alumnos")
	@XmlElement(name="alumno")
	public ArrayList<Alumno> getAlumnos() {
		return alumnos;
	}
	public void setAlumnos(ArrayList<Alumno> alumnos) {
		this.alumnos = alumnos;
	}

	@XmlElementWrapper(name="profesores")
	@XmlElement(name="profesor")
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}
    
}
