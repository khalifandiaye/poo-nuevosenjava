package edu.upc;

import java.util.ArrayList;

public class Calculadora {

	public int sumar(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public double sumar(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}

	public double sumar(ArrayList<Double> numeros) {
		double sum = 0;
		//for
		for(double valor : numeros) {
			sum = sum + valor;
			// sum += valor
		}
		return sum;
	}

	
}
