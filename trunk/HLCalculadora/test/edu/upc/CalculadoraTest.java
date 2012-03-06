package edu.upc;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class CalculadoraTest {

	@Test
	
	public void deberiaSumarDosNumerosEnteros() {
		//preparar el escenario
		int a = 5;
		int b = 1;
		
		//ejecutar
		Calculadora calc = new Calculadora();
		int resultado = calc.sumar(a, b);
		
		//verificas
		assertEquals(6, resultado);
		
		
	}

		
@Test
	
	public void deberiaSumarDosNumerosEnterosNegativos() {
		//preparar el escenario
		int a = 5;
		int b = -1;
		
		//ejecutar
		Calculadora calc = new Calculadora();
		int resultado = calc.sumar(a, b);
		
		//verificas
		assertEquals(4, resultado);
		
		
	}


@Test

public void deberiaSumarDosNumerosPuntoFlotante() {
	//preparar el escenario
	double a = 2500.00;
	double b = 500.50;
	
	//ejecutar
	Calculadora calc = new Calculadora();
	double resultado = calc.sumar(a, b);
	
	//verificas
	assertEquals(3000.50, resultado,2);
	
	
	}

@Test
public void deberiaSumarListadeNumeros() {
	ArrayList<Double> numeros = new ArrayList<Double>();
	
	numeros.add(5.0);
	numeros.add(3.0);
	numeros.add(-2.0);
	numeros.add(9.0);
	numeros.add(0.5);
	
	//ejecutar
	Calculadora calc = new Calculadora();
	double resultado = calc.sumar(numeros);
	
	assertEquals(15.50, resultado,2);
	
}

}
