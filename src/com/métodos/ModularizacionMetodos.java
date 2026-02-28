package com.métodos;

import java.util.Scanner;  // Herramienta para utilizar Scanner, para ingresar datos en consola.
import java.util.InputMismatchException; //Herramienta para utilizar una excepción cuando se pide un número, pero el usuario ingresa texto.
import java.util.Random;  //Herramienta para utilizar Random que ingresa un número random para una variable.
public class ModularizacionMetodos {
	
	static Scanner sc = new Scanner(System.in); //Variable de tipo Scanner
	static Random random = new Random();  //Variable de tipo Random

	final static String CONTRASENA = "12345";  //Constante global que guarda la contraseña, para la validación de contraseña.
	
	public static void main(String[] args) {
		int menuPrincipal=0;
		System.out.println("\n----- Modularización -----");
		menuPrincipal(menuPrincipal);
	}
	//  Menú Principal
	public static void menuPrincipal(int menus){  //Método con el ménu principal en donde el usuario elige que operaciones hacer.
 		do {
 			System.out.println("\n---- Menú Principal ----");
 			System.out.println("1. Calculadora básica");
 			System.out.println("2. Validación de Contraseña");
 			System.out.println("3. Números Primos");
 			System.out.println("4. Suma de números pares");
 			System.out.println("5. Conversión de temperatura");
 			System.out.println("6. Contador de vocales");
 			System.out.println("7. Cálculo de factorial");
 			System.out.println("8. Juego de adivinanza");
 			System.out.println("9. Paso por referencia");
 			System.out.println("10. Tabla de multiplicar");
 			System.out.println("11. Salir");
 			
 			menus = validacionMenu(0);  //A la variable se le da el valor del número retornado del método y no acepta texto.
 			switch (menus) {
 			case 1: 
 				System.out.println("\nCalculadora básica");
 				calculadoraBasica();
 				pausar(); //Ingresa al método para pausar la consola.
 			break;
 			case 2: 
 				System.out.println("\nValidación de Contraseña");
 				validacionContrasena(CONTRASENA);  //Recibe la contraseña
 				pausar();
 			break;
 			case 3: 
 				System.out.println("\nNúmeros Primos");
 				numerosPrimos();
 				pausar();
 			break;
 			case 4: 
 				System.out.println("\nSuma de números pares");
 				sumaPares();
 				pausar();
 			break;
 			case 5: 
 				System.out.println("\nConversión de temperatura");
 				conversionTemperatura();
 				pausar();
 			break;
 			case 6: 
 				System.out.println("\nContador de vocales");
 				contadorVocales();
 				pausar();
 			break;
 			case 7: 
 				System.out.println("\nCálculo de factorial");
 				calculoFactorial();
 				pausar();
 			break;
 			case 8: 
 				System.out.println("\nJuego de adivinanza");
 				juegoAdivinanza();
 				pausar();
 			break;
 			case 9: 
 				System.out.println("\nPaso por referencia");
 				pasoPorReferencia();
 				pausar();
 			break;
 			case 10: 
 				System.out.println("\nTabla de multiplicar");
 				tablaMultiplicar();
 				pausar();
 			break;
 			case 11:
 				System.out.println("\nSalir");  //Sale del programa y lo finaliza.
 				System.out.println("\nUsted ha salido del programa!");
 			break;
 			default:
 				System.out.println("\nUsted ingreso una opción inválida, intente de nuevo"); //Mensaje cuando el usuario no ingresa un número válido.
 				pausar();
 			}
 		} while(menus!=11); //Se termina el bucle cuando se elige Salir.
	} 
	public static int validacionMenu(int menus){  //Método para validar que cuando se elige una oción sea un número y no un texto.
		boolean validar = false;   //Variable falsa
		do {
			try {
		        menus = pedirNumInt("\nIngrese la opción");
		        sc.nextLine(); //Si se ingresa un texto falla esto y salta al catch.
		        validar = true; //Si se ingresa un número la variable se vuelve true.
			} catch (InputMismatchException e) {
		        System.out.println("Error: Usted no ingreso un número."); //Imprime cuando se ingresa un texto.
		        sc.nextLine();   //Limpia el texto y hace que el bucle no se vuelva infinito.
			}	
		} while(!validar);  //Si la variable es true sale del bucle.
		return menus; //Retorna el número válido.
	}
	public static int pedirNumInt(String pedir) { //Método para pedir e ingresar una número entero
		System.out.println(pedir);
		return sc.nextInt();  //Retorna el número entero
	}
	public static double pedirNumDouble(String pedir) { //Método para pedir e ingresar un número decimal
		System.out.println(pedir);
		return sc.nextDouble();
	}
	public static String pedirString(String pedir) {  //Método para pedir e ingresar un texto
		System.out.println(pedir);
		return sc.nextLine();
	}
	// 1. Calculadora Básica
	public static void calculadoraBasica() { //Método con las opciones para elegir operación aritmética.
		int opcionCalculadora;
		double a, b, resultado;
		
		do {
			System.out.println("\n--- Elige la operación ---");
			System.out.println("1. Suma");
			System.out.println("2. Resta");
			System.out.println("3. Multiplicación");
			System.out.println("4. División");
			System.out.println("5. Salir");
		
			opcionCalculadora = validacionMenu(0); //Variable con la opción del usuario ya validada para que solo se acepten numeros.
			
				
				switch (opcionCalculadora) {
				case 1:
					System.out.println("\nSuma");
					a = validacionCalculadora(0);  //Variable con el valor ingresado ya validado.
					b = validacionCalculadora(0);
					resultado = sumaCalculadora(a, b); //Variable con la operación de las dos variables ingresadas por el usuario.
					System.out.println("El resultado es: "+ resultado); //Imprime el resultado de la operación.
					pausar();
				break;
				case 2:
					System.out.println("\nResta");
					a = validacionCalculadora(0);
					b = validacionCalculadora(0);
					resultado = restaCalculadora(a, b);
					System.out.println("El resultado es: "+ resultado);
					pausar();
				break;
				case 3:
					System.out.println("\nMultiplicación");
					a = validacionCalculadora(0);
					b = validacionCalculadora(0);
					resultado = multiplicacionCalculadora(a, b);
					System.out.println("El resultado es: "+ resultado);
					pausar();
				break;
				case 4: 
					System.out.println("\nDivisión");
					try {
						a = validacionCalculadora(0);
						b = validacionCalculadora(0);
						resultado = divisionCalculadora(a, b); //Si el usuario ingresa un 0 se rompe la variable y salta al catch.
						System.out.println("El resultado es: "+ resultado);
					}
					catch(ArithmeticException e){ //Catch con la excepción para operaciones indefinidas como la división entre 0.
						System.out.println(e.getMessage()); //Imprime el mensaje de error.
					}
					pausar();
				break;
				case 5: 
					System.out.println("\nSalir");
				break;
				default:
					System.out.println("\nUsted ingreso una opción inválida, intente de nuevo");
					pausar();
				}
			
		}while(opcionCalculadora!=5);
	}
	public static double sumaCalculadora(double a,double b) { //Método que suma las variables.
		return a+b; //Retorna la suma.
	} 
	public static double restaCalculadora(double a,double b) { //Método que resta las variables.
		return a-b; //Retorna la resta.
	} 
	public static double multiplicacionCalculadora(double a,double b) { //Método que multiplica las variables.
		return a*b; //Retorna la multiplicación.
	} 
	public static double divisionCalculadora(double a,double b) { //Método que divide las variables.
		if(b==0) { //Entra al if si el denominador es 0.
			throw new ArithmeticException("Error: No se puede dividir entre cero."); //Lanzo una excepción con mensaje de error.
		}
		return a/b; //Retorna la división
	} 
	public static double validacionCalculadora(double valor){ //Método para validar los numeros ingresados en la calculadora y que no sean texto
		boolean validar = false;
		do {
			try {
		        valor = pedirNumDouble("\nIngese un valor");
		        sc.nextLine();
		        validar = true;
			} catch (InputMismatchException e) {
		        System.out.println("Error: Usted no ingreso un número.");
		        sc.nextLine();    
			}	
		} while(!validar);
		return valor;
	}
	// 2. Validación de Contraseña
	public static void validacionContrasena(String contrasenaIng) { //Método para con la Validación de Contraseña.
		do{
			contrasenaIng = pedirString("Ingrese la contraseña"); //Variable con la contraseña ingresada por el usuario.
			if(CONTRASENA.equals(contrasenaIng)) { //Compara la contraseña del usuario con la contraseña del programa guardada en una constante.
			System.out.println("Acceso Concedido!"); //Imprime cuando las dos contraseñas son iguales
			} else {
			System.out.println("Contraseña incorrecta, intenta de nuevo!"); //Imprime cuando la contraseña es diferente.
			}
		} while(!CONTRASENA.equals(contrasenaIng));//Si la contraseña ingresada es diferente continua el bucle.
	}
	// 3. Números Primos 
	public static void numerosPrimos() { //Método para saber si un número es primo.
		int numPrimo;
		boolean esPrimo = true;
		numPrimo = validacionEntero(0); //Variable con el número ingresado
		if(numPrimo<2) { //El número no debe ser menor de 2 para ser primo.
			esPrimo = false; //Si es menor de 2 no es primo.
		} else {
			for(int i = 2; i < numPrimo; i++) {
				if(numPrimo % i == 0) { //Divide el número ingresado con todos los número menores a él y si el residuo es 0 el número no es primmo.
					esPrimo = false; //Cuando el residuo es 0 no es primo.
				}
			}
		}
		if (esPrimo) {
			System.out.println( "\n" + numPrimo + " es un número primo."); //Si la variable el true el número es primo.
		} else {
			System.out.println( "\n" + numPrimo + " no es un número primo."); //Si la variable es false el número no es primo.
		}	
	}
	// 4. Suma de Números Pares
	public static void sumaPares() {  //Método para sumar los números pares.
		int num=-1, sumaPar=0;
		while(num!=0) { //Termina el bucle si se ingresa el 0.
			num = validacionEntero(0); //Variable con el número ingresado por el usuario.
			if(num%2 == 0) { //Si el residuo de la divisón del número entre 2 es 0 entra al if.
				sumaPar+= num; //Si el número es para se va sumando y se guarda en otra variable.
			}
		}
		System.out.println("La suma de los numeros pares es: " + sumaPar); //Imprime la suma de los numeros pares.
	}
	// 5. Conversión de Temperatura
	public static void conversionTemperatura() { //Método para la conversión de la temperatura.
		int opcionTemp;
		double celsius, farenheit, temperatura;
		do {
			System.out.println("\n--- Elige la Conversión ---");
			System.out.println("1. Celsius a Farenheit");
			System.out.println("2. Farenheit a Celsius");
			System.out.println("3. Salir");
			opcionTemp = validacionMenu(0); 
			
			switch(opcionTemp) {
			case 1:
				System.out.println("\nCelsius a Farenheit");
				celsius = validacionTemperatura(0); //Guarda la temperatura ingresada por el usuario en la variable.
				temperatura = celsiusAFarenheit(celsius); //Realiza la operación convirtiendo los °C a °F.
				System.out.println("La temperatura en °F es: " + temperatura); //Imprime la temperatura.
				pausar();
			break;
			case 2:
				System.out.println("\nFarenheit a Celsius");
				farenheit = validacionTemperatura(0);
				temperatura = farenheitACelsius(farenheit);//Realiza la operación convirtiendo los °F a °C.
				System.out.println("La temperatura en °C es: " + temperatura);
				pausar();
			break;
			case 3:
				System.out.println("\nSalir");
			break;
			default:
				System.out.println("\nUsted ingreso una opción inválida, intente de nuevo");
				pausar();
			}
			
		}while(opcionTemp!=3);
	}
	public static double celsiusAFarenheit(double celsius) {  //Método que convierte los °C a °F.
		return (celsius*9/5)+32;
	}
	public static double farenheitACelsius(double farenheit) {  //Método que convierte los °F a °C.
		return (farenheit-32)*5/9;
	}
	public static double validacionTemperatura(double valor){  //Válida que el usuario ingrese un número y no un texto.
		boolean validar = false;
		do {
			try {
		        valor = pedirNumDouble("\nIngese una temperatura");
		        sc.nextLine(); //Se rompe si el usuario ingresa un texto y entra al catch.
		        validar = true;
			} catch (InputMismatchException e) {
		        System.out.println("Error: Usted no ingreso una temperatura."); //Imprime el error si se ingresa un texto.
		        sc.nextLine();    
			}	
		} while(!validar); //Termina el bucle si se ingresa un número.
		return valor; //Retorna el valor.
	}
	// 6. Contador de Vocales
	public static void contadorVocales() { //Método para contar vocales de un texto.
		String palabra = pedirString("Ingrese una palabra");
		contarVocales(palabra);
	}
	public static void contarVocales(String texto) { //Método en donde cuenta las vocales.
		char vocal;
		int contadorVocales=0;
		String palabra = texto.toLowerCase(); //Convierte el texto a minúsculas.
		for(int i=0; i<palabra.length();i++) { //Si la condición llega a la longitud del texto se termina el bucle.
			vocal = palabra.charAt(i); //A la variable se le da el valor de los caracteres.
			if(vocal=='a' || vocal=='e' || vocal=='i' || vocal=='o' || vocal=='u' ) { //Si el texto contiene vocales entra al if y se suma el contador.
				contadorVocales++;
			}
		}
		System.out.println("La palabra tiene "+ contadorVocales+" vocales."); //Imprime el número de vocales que tiene el texto.
	}
	// 7. Cálculo de Factorial
	public static void calculoFactorial() { //Método para el cálculo de factorial.
		try {
		int numero = validacionEntero(0); //El usuario ingresa el número y si ingresa un negativo, pide ingresar otro.
		System.out.println("El factorial es: " + factorial(numero)); //Imprime el factorial del número ingresado.
		} catch(IllegalArgumentException e){
			System.out.println(e.getMessage());//Imprime el mensaje si se ingresa un número negativo.
		}
	}
	public static int factorial(int numero) { //Realiza la operación del factorial.
		if(numero<0){ //Si el número es menor a 0 hace una excepción.
			throw new IllegalArgumentException("Error: No se puede sacar factorial de un número negativo."); //Imprime cuando el número es inválido como los negativos.
		}else if(numero==0 || numero==1) {
			return 1; //Si los numeros ingresados son 1 y 0 retorna 1.
		} else {
		return numero*factorial(numero-1); //Realiza la operación con recursividad multiplicando el número ingresado por el número-1.
		}
		
	}
	// 8. Juego de Adivinanza
	public static void juegoAdivinanza() {  //Método para adivinar un número random.
		int numero, adivinar, intentos=0;
		numero = random.nextInt(100)+1; //A la variable se le da un valor random de entre 1 a 100.
		do {
			adivinar = validacionEntero(0); //El usuario ingresa un número.
			intentos++; //Se suman los intentos.
			if(adivinar>numero) {
				System.out.println("El número es menor!\n"); //Imprime cuando el número ingresado es mayor al random.
			} else if(adivinar<numero) {
				System.out.println("El número es mayor!\n"); //Imprime cuando el número ingresado es menor al random.
			}else {
				System.out.println("Ganaste! intentos realizados: " + intentos); //Imprime cuando acertaste el número.
			}
		}while(numero!=adivinar); //Si el número ingresado es igual al número random se termina el bucle.
	}
	// 9. Paso por Referencia
	public static void pasoPorReferencia() {  //Método para pasar un número por referencia.
		int[] num = new int[2]; //Declara un arreglo.
		num[0] = validacionEntero(0); //Ingresa un número al indice 0.
		num[1] = validacionEntero(0); //Ingresa un número al indice 1.
		System.out.println("Antes del cambio: a = " + num[0] +" y b = "+num[1]);  //Imprime los numeros antes del cambio.
		intercambiar(num);
		System.out.println("Después del cambio: a = "+num[0]+" y b = "+num[1]);  //Imprime los numeros después del cambio.
	}
	public static void intercambiar(int[] valor) {  //Método donde se intercambian los valores.
		int valorTem = valor[0]; //Utiliza un variable temporal para guardar el valor del indice 0.
		valor[0] = valor[1];  //Indice 0 recibe el valor del indice 1.
		valor[1] = valorTem;  //Indice 1 recibe el valor de la variable temporal.
	}
	// 10. Tabla de multiplicar
	public static void tablaMultiplicar() {  //Método para la tabla de multiplicar.
		int numero = validacionEntero(0);  //Ingresa un número por el usuario.
		tabla(numero);
	}
	public static void tabla(int numero) {  //Método para realizar la tabla de multiplicar.
		System.out.println("\nTabla del: "+numero);
		for(int i=1;i<=10;i++) {  //Realiza el bucle 10 veces
			int resultado = i*numero; //Multiplica el número ingresado por el número de bucles.
			System.out.println(numero+" * "+i+" = " + resultado); //Imprime la tabla de multiplicar.
		}
	}
	public static int validacionEntero(int menus){  //Método para válidar un número entero.
		boolean validar = false;
		do {
			try {
		        menus = pedirNumInt("Ingrese un valor");
		        sc.nextLine();  //Se rompe si se ingresa texto y entra al catch.
		        validar = true;
			} catch (InputMismatchException e) { 
		        System.out.println("Error: Usted no ingreso un número.\n");  //Imprime cuando se ingresa un texto.
		        sc.nextLine();    
			}	
		} while(!validar); //Termina el bucle si la variable da true.
		return menus;
	}	
	public static void pausar() { //Método para pausar la consola.
		System.out.println("\nPresione Enter para continuar..."); //Pide enter para continuar el programa.
		sc.nextLine(); //Al ingresar enter sigue el programa.
	}
}
 	