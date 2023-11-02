package desafio_4;

import java.util.InputMismatchException;

import java.util.Scanner;

public class desafio_4 {

	static String[] nombre = new String[3];
	static String[] apellido = new String[3];
	static int[] numero_de_camisetas = new int[3];
	static String suplente;
	static String ap_suplente;
	static int[] num_suplente =new int [1] ;
	
	public static void agregarDatosJugador() {
		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			System.out.println("Ingresa el nombre del jugador: " + (i + 1));
			nombre[i] = entrada.next().toLowerCase();

			System.out.println("Ingresa el apellido del jugador: " + (i + 1));
			apellido[i] = entrada.next().toLowerCase();

			System.out.println("Ingresa el número de camiseta del jugador: " + (i + 1));
			numero_de_camisetas[i] = entrada.nextInt();
		}

	}

	public static void agregarJugadorSuplente() {
		Scanner entrada = new Scanner(System.in);

		boolean respuestaAgregarJugadorIncorrecto = true;

		while (respuestaAgregarJugadorIncorrecto) {

			System.out.println("¿Desea agregar los datos de un jugador suplente? (si/no): ");
			String respuesta = entrada.next().toLowerCase();

			if (respuesta.equals("si")) {

				for (int i = 0; i < 1; i++) {

					System.out.println("Ingresa el nombre del jugador suplente: ");
					suplente = entrada.next().toLowerCase();

					System.out.println("Ingresa el apellido del jugador suplente: ");
					ap_suplente = entrada.next().toLowerCase();

					System.out.println("Ingresa el número de camiseta del jugador suplente: ");
					num_suplente[i] = entrada.nextInt();
					
		
				}
				respuestaAgregarJugadorIncorrecto = false;
			} else if (respuesta.equals("no")) {
				respuestaAgregarJugadorIncorrecto = false;

			}
			
			
			}
		
			}
		
	

	public static void analizarDatosTresJugadores() {
		Scanner entrada = new Scanner(System.in);

		boolean respuestaCorrecta = false;

		while (!respuestaCorrecta) {

			System.out.println("estos son los datos que ingresaste: ");
			for (int i = 0; i < 3; i++) {
				System.out.println("nombre del jugador " + (i + 1) + " : " + nombre[i]);
				System.out.println("apellido del jugador " + (i + 1) + " : " + apellido[i]);
				System.out.println("numero de camisetas " + (i + 1) + " : " + numero_de_camisetas[i]);

			}

			 System.out.println("es correcto los datos que ingresaste?");
			String respuesta = entrada.next().toLowerCase();

		        if (respuesta.equals("si")) {
		            respuestaCorrecta = true;
		        } else if (respuesta.equals("no")) {
		            agregarDatosJugador();  } 
			else {
	            System.out.println("Respuesta incorrecta. Debes responder 'si' o 'no'.");
		}
	}

	}
	

	
	public static void analizarDatosCuatroJugadores() {
		Scanner entrada = new Scanner(System.in);

		boolean respuestaCorrecta = false;

		while (!respuestaCorrecta) {

			System.out.println("estos son los datos que ingresaste del jugador suplente: ");
			for (int i = 0; i < 1; i++) { 
				System.out.println("nombre del jugador suplente  " + suplente);
				System.out.println("apellido del jugador suplente" + ap_suplente);
				System.out.println("numero de camiseta del sumplente : " + num_suplente);

			}

			System.out.println("es correcto los datos que ingresaste?");
			String respuesta = entrada.next().toLowerCase();

		
		        if (respuesta.equals("si")) {
		            respuestaCorrecta = true;
		    
		        } else if (respuesta.equals("no")) {
		        	int buscarNumero ;
		       
		        	System.out.println("Que numero de jugador desea modificar?");
		        	buscarNumero = entrada.nextInt();
		        	
		        	for (int i = 0; i < 3; i++) {
		        		if (buscarNumero == numero_de_camisetas [i]) {
		        			System.out.println("Ingresa el nombre del jugador: " + (i + 1));
		        			nombre[i] = entrada.next().toLowerCase();

		        			System.out.println("Ingresa el apellido del jugador: " + (i + 1));
		        			apellido[i] = entrada.next().toLowerCase();

		        			System.out.println("Ingresa el número de camiseta del jugador: " + (i + 1));
		        			numero_de_camisetas[i] = entrada.nextInt();
		        		}
		        	}
		        	}
		        	
		        	
	
			else {
	            System.out.println("Respuesta incorrecta. Debes responder 'si' o 'no'.");
	            
		}
	}

	}

	public static void main(String[] args) {

		agregarDatosJugador();
		agregarJugadorSuplente();
		analizarDatosTresJugadores();
		 analizarDatosCuatroJugadores();
	}

}
