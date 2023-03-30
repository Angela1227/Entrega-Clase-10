package org.C;

import java.util.ArrayList;
import java.util.List;

public class Materia {
private String nombre;
private List<Materia> Correlativas;


//Métodos
public boolean puedeCursar(Alumno alumno) {
	return true;
}

public Materia(String nombre) {
	this.setNombre(nombre);
	this.Correlativas = new ArrayList<Materia>();
}

public void AgregarCorrelativa(Materia materia) {
	this.Correlativas.add(materia);
}
public void QuitarCorrelativa(Materia materia) {
	this.Correlativas.remove(materia);
}

//Si puede cursar
public boolean PuedeCursar(Alumno alumno) {
	if(this.getCorrelativas().size() == 0) {
		return true;
	}else {
		for(Materia materiaCorrelativa: this.getCorrelativas()) {
			if(!alumno.getMateriasAprobadas().contains(Correlativas)) {//acá cambié código
				return false;
			}
		}
		return true;
	}
}




//Setters y Getters
public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public List<Materia> getCorrelativas() {
	return Correlativas;
}

public void setCorrelativas(List<Materia> correlativas) {
	Correlativas = correlativas;
}
}
