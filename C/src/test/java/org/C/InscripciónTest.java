package org.C;

import static org.junit.Assert.assertTrue;

import java.time.LocalDateTime;


import org.junit.Test;

public class InscripciónTest {
	

	//a. Una materia sin correlativas
	

	@Test
	
	
	public void validarMateriaSinCorrelativas() {
		Materia ProgramaciónI = new Materia("ProgramaciónI");
		Materia ProgramaciónII = new Materia("ProgramaciónII");
		Materia BaseDeDatosI = new Materia("Base de DatosI");
		
		ProgramaciónII.AgregarCorrelativa(ProgramaciónI);
		
		//Creo al alumno
		Alumno alumno = new Alumno("Vodovosoff Angie", "46-00003");
		//Creo la inscripción sin las correlativas
		Inscripcion inscripcion = Inscripcion(alumno,BaseDeDatosI);
		assertTrue(inscripcion.aprobada());
	
	}

	


	}
	
	
	//b. Una materia con correlativas y que el alumno las tenga
	//c. Otra materia sin correlativas, y que el alumno no las tenga

