package ar.edu.unju.edm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ar.edu.unju.edm.Model.Calculadora;

@Controller
public class CalculadoraController {

	@GetMapping("/menu")
	public String MenuCalculadora() {

		return "index";
	}

	@GetMapping("/calculoSuma")
	public String getResultsPage(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		int result = 0;

		Calculadora newCalculadora = new Calculadora();
		newCalculadora.setNumero1(num1);
		newCalculadora.setNumero2(num2);
		result = newCalculadora.resolvsuma();
		model.addAttribute("resultSuma", result);

		return "resultados";
	}

	@GetMapping("/calculoResta")
	public String getResultsPage2(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		int result = 0;
		Calculadora newCalculadora = new Calculadora();
		newCalculadora.setNumero1(num1);
		newCalculadora.setNumero2(num2);
		result = newCalculadora.resolvresta();
		model.addAttribute("resultResta", result);

		return "resultados";
	}

	@GetMapping("/calculoMultiplicacion")
	public String getResultsPage3(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		int result = 0;
		Calculadora newCalculadora = new Calculadora();
		newCalculadora.setNumero1(num1);
		newCalculadora.setNumero2(num2);
		result = newCalculadora.resolvmultiplicacion();
		model.addAttribute("resultMultiplicacion", result);

		return "resultados";
	}

	@GetMapping("/calculoDivision")
	public String getResultsPage4(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		int result = 0;
		Calculadora newCalculadora = new Calculadora();
		newCalculadora.setNumero1(num1);
		newCalculadora.setNumero2(num2);
		result = newCalculadora.resolvdivision();
		model.addAttribute("resultDivision", result);

		return "resultados";
	}

	@GetMapping("/calculoPotencia")
	public String getResultsPage5(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		double result = 0;
		Calculadora newCalculadora = new Calculadora();
		newCalculadora.setNumero1(num1);
		newCalculadora.setNumero2(num2);
		result = newCalculadora.resolvpotencia();
		model.addAttribute("resultPotencia", result);

		return "resultados";
	}

	@GetMapping("/calculoRaiz")
	public String getResultsPage6(@RequestParam(name = "num1") int num1, @RequestParam(name = "num2") int num2,
			Model model) {
		float result = 0;
		Calculadora newCalculadora = new Calculadora();
		newCalculadora.setNumero1(num1);
		newCalculadora.setNumero2(num2);
		result = newCalculadora.resolvraiz();
		model.addAttribute("resultRaiz", result);

		return "resultados";
	}
}
