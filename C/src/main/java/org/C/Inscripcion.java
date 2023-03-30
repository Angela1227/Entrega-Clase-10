package org.C;

import java.time.LocalDateTime;

public class Inscripcion {
	private Alumno alumno;
	private Materia materia;
	private LocalDateTime Fecha;

	public Inscripcion(Alumno alumno, Materia materia) {
		this.setAlumno(alumno);
		this.setMateria(materia);
		this.setFecha(Fecha);
	}
	public boolean aprobada() {
		return this.materia.puedeCursar(this.alumno);
	}	
	//Setters y Getters


	public Alumno getAlumno() {
		return alumno;
	}

	public void setAlumno(Alumno alumno) {
		this.alumno = alumno;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public LocalDateTime getFecha() {
		return Fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.Fecha = fecha;
	}
}
