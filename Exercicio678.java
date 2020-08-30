package Exercicios;

import java.util.*;

public class Exercicio678 {

	public static void main(String[] args) {

		String selecaoExercicio;
		Scanner entradaDeDados = new Scanner(System.in);

		System.out.println("Selecione qual exercicio deseja visualizar");
		System.out.println("Exe6 - Digite a Senha para acesso.");
		System.out.println("Exe7 - Informe a quantidade de maçãs que deseja comprar");
		System.out.println("Exe8 - ");

		selecaoExercicio = entradaDeDados.nextLine();

		switch (selecaoExercicio) {
		case "Exe6":
			Exercicio6();
			break;

		case "Exe7":
			Exercicio7();
			break;

		case "Exe8":
			Exercicio8();
			break;
			
		default:
			System.out.println("Valor informado não corresponde ao menu.");
			break;
		}
		entradaDeDados.close();

	}

	public static void Exercicio6() {

// informar senha, se diferente de 1234 acusar erro.

		int senha;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Digite a senha para acessar o programa (apenas números)");
		System.out.println("");
		senha = entradaValor.nextInt();

		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO");
		} else {
			System.out.println("ACESSO NEGADO");
		}
		entradaValor.close();
	}

	public static void Exercicio7() {

		// Compre maçãs, dependendo a quantidade rola um desconto!

		int quantidadeMacas;
		double valorMacas = 0.0;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Maçãs em promoção!!!");
		System.out.println("Na compra de até 11 maçãs, você paga R$0,30 cada!!");
		System.out.println("A partir de 12 maçãs, você paga R$ 0,25 cada!!");
		System.out.println("APROVEITE!!");
		System.out.println("");
		System.out.println("Quantas maçãs deseja comprar?");
		System.out.println("");

		quantidadeMacas = entradaValor.nextInt();

		if (quantidadeMacas < 12) {
			valorMacas = 0.30;
			System.out.println("Muito bem!!, " + quantidadeMacas + " maçãs irão custar apenas R$ "
					+ (quantidadeMacas * valorMacas));
		} else if (quantidadeMacas >= 12) {
			valorMacas = 0.25;
			System.out.println("Muito bem!!, " + quantidadeMacas + " masçãs irão custar apenas R$ "
					+ (quantidadeMacas * valorMacas));
		} else {
			System.out.println("Caracteres Inválidos. Favor reiniciar.");
		}
		entradaValor.close();
	}

	public static void Exercicio8() {

		int valorUm, valorDois, valorTres;
		Scanner entradaValor = new Scanner(System.in);

		System.out.println("Informe 3 valores que serão impressos em ordem crescente.");
		System.out.println("");
		System.out.println("Primeiro Valor");
		valorUm = entradaValor.nextInt();

		System.out.println("");
		System.out.println("Segundo Valor");
		valorDois = entradaValor.nextInt();

		System.out.println("");
		System.out.println("Terceiro Valor");
		valorTres = entradaValor.nextInt();

		if ((valorUm < valorDois) && (valorUm < valorTres) && (valorDois < valorTres)) {
			System.out.println("Os números em ordem crescente ficam dessa forma:");
			System.out.println(valorUm + ", " + valorDois + ", " + valorTres);

		} else if ((valorUm < valorDois) && (valorUm < valorTres) && (valorDois > valorTres)) {
			System.out.println("Os números em ordem crescente ficam dessa forma:");
			System.out.println(valorUm + ", " + valorTres + ", " + valorDois);
			
		} else if ((valorDois < valorUm) && (valorDois < valorTres) && (valorUm < valorTres)) {
			System.out.println("Os números em ordem crescente ficam dessa forma:");
			System.out.println(valorDois + ", " + valorUm + ", " + valorTres);
			
		} else if ((valorDois < valorUm) && (valorDois < valorTres) && (valorUm > valorTres)) {
			System.out.println("Os números em ordem crescente ficam dessa forma:");
			System.out.println(valorDois + ", " + valorTres + ", " + valorUm);
			
		} else if ((valorTres < valorUm) && (valorTres < valorDois) && (valorUm > valorDois)) {
			System.out.println("Os números em ordem crescente ficam dessa forma:");
			System.out.println(valorTres + ", " + valorDois + ", " + valorUm);
			
		}	else if ((valorTres < valorUm) && (valorTres < valorDois) && (valorUm < valorDois)) {
			System.out.println("Os números em ordem crescente ficam dessa forma:");
			System.out.println(valorTres + ", " + valorUm + ", " + valorDois);
			
		}
		entradaValor.close();
	}

}
