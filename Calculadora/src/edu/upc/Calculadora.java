package edu.upc;

import java.util.ArrayList;

public class Calculadora {
	
	//sobrecarga/overloading

	public int sumar(int a, int b) {		
		return (a+b);
	}

	public double sumar(double a, double b) {
		return (a+b);
	}

	public double sumar(ArrayList<Double> numeros) {
		double sum=0;
		//for (tipodato var: arreglo)
		for(double valor : numeros){
			sum = sum + valor;
			//sum += valor;
		}
		return sum;
	}

}
