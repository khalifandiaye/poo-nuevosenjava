package epe;

import java.util.ArrayList;

public class Calculadora {

	//sobreca       rga - overloading
	//mismo nombre del metodo
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
		// TODO Auto-generated method stub
		//for (tipodato var : arreglo)		
		for (double valor : numeros)
		{
			sum = sum + valor;
		}
		return sum;
	}

}
