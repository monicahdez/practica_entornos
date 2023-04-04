package practica2;

import java.util.Scanner;
/**
 * Esta clase calcula la nota final a partir de tres notas introducidas. 
 * @author Mónica Hernández
 * @version 2.1
 */

public class notas {
	// declaramos la variables que nos hacen falta
	double uf11, uf2, uf3;
	double acu1, acu2, acu3, def;
	
	/**
	 * definimos las variables.
	 * uf1= nota primera unidad.
	 * uf2=nota segundad unidad.
	 * uf3=nota tercera unidad.
	 * acu1= nota ponderada uf1
	 * acu2= nota ponderada uf2
	 * acu3= nota ponderada uf3
	 */

	/* utilizamos escaner para poder introducir datos*/
	Scanner entrada = new Scanner(System.in);

	/* vamos a crear un metodo para ingresar*/
	/**
	 * Metodo para capturar las notas 
	 * @param IngresaNotas sirve para capturar los datos de las notas.
	 */
	public void IngresaNotas() {
		/* cuando ejecutamos este metodo lo primero que queremos es que nos pida notas*/
		System.out.println("ingrese las notas del estudiante");
		System.out.print("ingrese nota 1: ");
		uf11 = entrada.nextDouble();
		System.out.print("ingrese nota 2: ");
		uf2 = entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		uf3 = entrada.nextDouble();
	}

// metodo para comprobar bien introduccion de notas
	/**
	 * Aquí comprobamos que las notas introducidas sean correctas
	 * @param comprobacion 
	 * @return nota correcta o incorrecta. 
	 */
	public void comprobacion() {
		if (uf11 > 10) {
			System.out.println(" nota1 mal introducida");
		} else {
			System.out.println(" nota1 correcta");
		}

		if (uf2 > 10) {
			System.out.println(" nota2 mal introducida");
		} else {
			System.out.println(" nota2 correcta");
		}
		if (uf3 > 10) {
			System.out.println(" nota3 mal introducida");
		} else {
			System.out.println(" nota3 correcta");

		}
	}
/**
 * Aquí calculamos la nota final a partir de las notas introducidas
 * @param Calculonotas 
 * 
 */
	// metodo para calcular nota
	public void Calculonotas() {
		acu1 = uf11 * 0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		def = acu1 + acu2 + acu3;
		// hasta aqui la tenemos calculada peor no la mostramos
	}
	/* añadimos un comentario*/
	/**
	 * Aquí calculamos la nota final a partir de las notas introducidas
	 * @param Mostrar 
	 * 
	 */
/*NUEVO COMENTARIO*/
	public void Mostrar() {
		// print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf11);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		System.out.println(" acumuado 1 = " + acu1);
		System.out.println(" acumuado 2 = " + acu2);
		System.out.println(" acumuado 3 = " + acu3);
		System.out.println(" nota definitiva es = " + def);
	}
	/**
	 * Aquí comprobamos si la nota obtenida supone un aprobado o un suspendo, si no imprime un error. 
	 * @param aprobado
	 * 
	 */

	public void aprobado() {
		if (def < 5 && def >= 0) {
			System.out.println("suspendio");
		} else {
			if (def >= 5 && def <= 10) {
				System.out.println("aprobado");
			} else {
				System.out.println(" error en la notas");
			}
		}
	}
	/**
	 * Aquí llamamos a los metodos fuera de la clase
	 * @param args 
	 * 
	 */

	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuera de la clase
		notas fc = new notas();
		fc.IngresaNotas();
		fc.comprobacion();
		fc.Calculonotas();
		fc.Mostrar();
		fc.aprobado();
	}}
