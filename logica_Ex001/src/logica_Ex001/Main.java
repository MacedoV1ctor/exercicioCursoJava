package logica_Ex001;

import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
	

	/*
	aça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma 
	mensagem explicativa, conforme exemplos. 
	*/
	public int SomarValores() {
		int num1, num2;
		
		
		
		System.out.println("Digite o primeiro valor:");
			num1 = sc.nextInt();
		System.out.println("Digite o segundo valor:");			
			num2 = sc.nextInt();
			
		return num1 + num2;
	}
	
	/*
	Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro 
	casas decimais conforme exemplos. 
	 
	Fórmula da área: area = π . raio^2 
	 
	Considere o valor de π = 3.14159
	*/
	
	public double CalcArea() {
		double pi =  3.14159; 
		double raio;
		
		System.out.println("Digite o valor do raio do círculo");
		raio = sc.nextDouble();
		
		return pi* Math.pow(raio, 2);
		
		
	}
	
	/* 
	Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por 
	hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas 
	decimais. 
	*/
	
	public double[] calcEmploye() {
		double salary, totalSalary, h;
		int number;
		
		double[] arr = new double[2];
		
		System.out.println("Digite o número do funcionário");
			number = sc.nextInt();
		System.out.println("Digite a quantidade de horas trabalhadas:");
			h = sc.nextDouble();
		System.out.println("Digite seu salário:");
			salary = sc.nextDouble();
			
		totalSalary = h * salary;	
		
		arr[0] = number;
		arr[1] = totalSalary;
		System.out.println(arr); 
				
		
			return arr;
	}
	
	/*
	Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto 
	de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
	*/
	
	public int calcDifProd() {
		int a,b,c,d;
		
		System.out.println("Digite o primeiro valor:");
			a = sc.nextInt();
		System.out.println("Digite o segundo valor:");	
			b = sc.nextInt();
		System.out.println("Digite o terceiro valor:");
			c = sc.nextInt();
		System.out.println("Digite o quarto valor:");
			d = sc.nextInt();
			
		return  (a*b) - (c*d);	
	}
	
	/*
	Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o 
	código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago. 
	*/
	
	
	public double[] readMaterial() {
		double cod, value,total = 0, number;
		int index = 1;
		double[] arr = new double[4];
		
		do {
			System.out.println("Qual é o código da peça?");
				cod = sc.nextInt();
			System.out.println("Qual é p número de peças?");
				number = sc.nextDouble();
			System.out.println("o Valor unitário de cada peça");
				value = sc.nextDouble();
			
			total = total +  (number * value);	
			index++;
			
		}while(index <= 2);
		
		arr[0] = total;
		
		return arr;
	}
	
	/* 
	Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e 
	mostre:  
	a) a área do triângulo retângulo que tem A por base e C por altura.  
	b) a área do círculo de raio C. (pi = 3.14159)  
	c) a área do trapézio que tem A e B por bases e C por altura.  
	d) a área do quadrado que tem lado B.  
	e) a área do retângulo que tem lados A e B.
	*/
	
	public double[] readForm() {
		double A,B,C, area;
		double[] arr = new double[5];
		double pi =  3.14159;
		
		System.out.println("Digite o valor de A: ");
			A = sc.nextDouble();
		System.out.println("Digite o valor de B:");
			B = sc.nextDouble();
		System.out.println("Digite o valor de C:");
			C = sc.nextDouble();
			
			arr[0] = (A * C) / 2;
			arr[1] = pi* Math.pow(C, 2);
			arr[2] = ((A + B) * C) / 2;
			arr[3] =  B*B;
			arr[4] = A*B;
			
		return arr;
	}
	
	public static void main(String[] args) {
		
		Main main = new Main();
		
		//System.out.println("Soma = " + main.SomarValores());
		
		//System.out.printf("A =  %.4f ",main.CalcArea());
		
		//System.out.println("DIFERENÇA = " + main.calcDifProd());
		
		//var _arr = main.calcEmploye();
		//System.out.println("Number = " +  (int) _arr[0] +  "\n Salary = U$ " + _arr[1]);
	
		//System.out.printf("VALOR A PAGAR R$ %.2f", main.readMaterial()[0]);
		
		/*
		var _auxArr =  main.readForm();
		System.out.printf("TRIANGULO: %.3f %n", _auxArr[0]);
		System.out.printf("CIRCULO %.3f %n", _auxArr[1]);
		System.out.printf("TRAPEZIO %.3f %n", _auxArr[2]);
		System.out.printf("QUADRADO %.3f %n", _auxArr[3]);
		System.out.printf("RETANGULO %.3f %n", _auxArr[4]);
		*/
	}

}
