package org.C;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Alumno {
private String nombre;
private String legajo;
private List<Materia> materiasAprobadas;


//Métodos constructores
public Alumno() {
	this.materiasAprobadas = new ArrayList<Materia>();
}
public Alumno(String nombre, String legajo) {
	this.setNombre(nombre);
	this.setLegajo(legajo);
	this.materiasAprobadas = new ArrayList<Materia>();
}

public void AgregarAprobada(Materia materia) {
	this.materiasAprobadas.add(materia);
}
public void QuitarAprobada(Materia materia) {
	this.materiasAprobadas.remove(materia);
}

//Getters y Setters
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public String getLegajo() {
	return legajo;
}
public void setLegajo(String legajo) {
	this.legajo = legajo;
}
public List<Materia> getMateriasAprobadas() {
	return materiasAprobadas;
}
public void setMateriasAprobadas(List<Materia> materiasAprobadas) {
	this.materiasAprobadas = materiasAprobadas;
}
}
