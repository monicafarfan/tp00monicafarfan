package ar.edu.unju.edm;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ar.edu.unju.edm.Model.Estudiante;
import ar.edu.unju.edm.Model.Calculadora;

@SpringBootApplication
public class Tp00MonicaFarfanApplication {

	public static void main(String[] args) {
		SpringApplication.run(Tp00MonicaFarfanApplication.class, args);
		String nombre = " Monica";
		System.out.println("Farfan" + nombre + name2());

		Estudiante estudiante = new Estudiante();
		estudiante.setDni("50.000.000");
		estudiante.setNombre("Farfan");

		System.out.println("El estudiante " + estudiante.getNombre() + " dice hola!");

		// Crear un objeto de la clase calculadora

		Calculadora calculadora = new Calculadora(); // Metodo Constructor
		calculadora.setNumero1(4);
		calculadora.setNumero2(2);

		System.out.println("Valor 1: " + calculadora.getNumero1());
		System.out.println("Valor 2: " + calculadora.getNumero2());
		// Suma
		System.out.println("El resultado de la suma es: " + calculadora.resolvsuma());
		// Resta
		System.out.println("El resultado de la resta es: " + calculadora.resolvresta());
		// Division
		System.out.println("El resultado de la division es: " + calculadora.resolvdivision());
		// Multiplicacion
		System.out.println("El resultado de la multiplicacion es: " + calculadora.resolvmultiplicacion());
		// Potencia
		System.out.println("El resultado de la potencia es: " + calculadora.resolvpotencia());
		// Raiz
		System.out
				.println("El resultado de la raiz del valor 1 con indice del valor 2 es: " + calculadora.resolvraiz());
	}

	public static String name2() {
		String nombre2 = " Gisel ";
		return nombre2;
	}
	

}
