package ar.edu.unju.edm.Model;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {
	private int numero1;
	private int numero2;

	public Calculadora() {

	}

	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}

	public int resolvsuma() {
		return numero1 + numero2;

	}

	public int resolvresta() {
		return numero1 - numero2;

	}

	public int resolvdivision() {
		return numero1 / numero2;

	}

	public int resolvmultiplicacion() {
		return numero1 * numero2;

	}

	public double resolvpotencia() {
		return Math.pow(numero1, numero2);
	}

	public float resolvraiz() { 

		double base, exp;
		base = numero1;
		exp = numero2;

		return (float) Math.pow(base, 1 / exp);
	}

}
