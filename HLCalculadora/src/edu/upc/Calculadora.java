package edu.upc;

import java.util.ArrayList;

public class Calculadora {

	public int sumar(int a , int b) {
		return  (a + b);
		
		
	}

	public double sumar(double a, double b) {
		
		return  (a + b);
	}

	public double sumar(ArrayList<Double> numeros) {
		double sum=0;
		//for (tipo de dato:arreglo)
		for(double valor : numeros){
			sum+=valor;
			//sum=sum+valor			
			
		}
					
		return sum;
	}
	
}
