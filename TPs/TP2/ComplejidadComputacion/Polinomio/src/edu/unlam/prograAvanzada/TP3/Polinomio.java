package edu.unlam.prograAvanzada.TP3;

public class Polinomio {

	private int grado;
	private double[] coeficiente;

	public Polinomio(int grado, double[] coeficiente) {
		this.grado = grado;
		this.coeficiente = coeficiente;
	}

	// calculo del polinomio para un valor en especifico
	public double evaluarMsucesivas(double x) {
		double resultado = 0;

		for (int i = this.grado; i >= 0; i--) {
			resultado += this.coeficiente[this.grado - i] * potenciaMSucesivas(x, i);
		}

		return resultado;
	}

	public double evaluarRecursiva(double x) {
		double resultado = 0;

		for (int i = this.grado; i >= 0; i--) {
			resultado += this.coeficiente[this.grado - i] * potenciaRecursiva(x, i);
		}

		return resultado;
	}

	// Calculos de las potecias de distintas formas

	public double potenciaMSucesivas(double base, int exp) {
		double resultado = 1;
		for (int i = 0; i < exp; i++) {
			resultado = resultado * base;
		}
		return resultado;
	}

	public double potenciaRecursiva(double base, int exp) {
		if (exp == 0) {
			return 1;
		}
		return base * potenciaRecursiva(base, exp - 1);
	}
	
	public double potenciaRecursivaPar(double base, int exp) {
		if (exp == 0) {
			return 1;
		}
		if(exp%2 == 0) {
			return base * potenciaRecursiva(base*base, exp/2);
		}
		return base * potenciaRecursiva(base, exp - 1);
	}
	
	
}
