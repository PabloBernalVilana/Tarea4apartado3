package Tarea4Apartado3;
/*@Author Pablo Bernal Vilana
 * Declarar variables X e Y de tipo int
 * Declarar variables N y M de tipo double
 * Asignar valor a las variables
 * Mostrar por pantalla valor y resultado de operaciones
 */
public class MainApp {

	public static void main(String[] args) {
		// Declaracion de variables int y asignacion de un valor
		int X = 10;
		int Y = 20;
		// Declaracion de variables double y asignacion de un valor
		double N = 10.1;
		double M = 20.1;
		// Muestra por pantalla el valor de cada variable
		System.out.println("Valor de X = " + X);
		System.out.println("Valor de Y = " + Y);
		System.out.println("Valor de N = " + N);
		System.out.println("Valor de M = " + M);
		// Muesta por pantalla una serie de operaciones
		// Suma X + Y
		System.out.println(X + " + " + Y + " = " + (X + Y));
		// resta X - Y
		System.out.println(X + " - " + Y + " = " + (X - Y));
		// division X / Y
		System.out.println(X + " / " + Y + " = " + (X / Y));
		// producto X * Y
		System.out.println(X + " * " + Y + " = " + (X * Y));
		// modulo X % Y
		System.out.println(X + " % " + Y + " = " + (X % Y));
		// Suma N + M
		System.out.println(N + " + " + M + " = " + (N + M));
		// resta N - M
		System.out.println(N + " - " + M + " = " + (N - M));
		// division N / M
		System.out.println(N + " / " + M + " = " + (N / M));
		// producto N * M
		System.out.println(N + " * " + M + " = " + (N * M));
		// modulo N % M
		System.out.println(N + " % " + M + " = " + (N % M));
		// Suma X + N
		System.out.println(X + " + " + N + " = " + (X + N));
		// division Y / M
		System.out.println(Y + " / " + M + " = " + (Y / M));
		// producto N * M
		System.out.println(N + " * " + M + " = " + (N * M));
		// modulo Y % M
		System.out.println(Y + " % " + M + " = " + (Y % M));
		// el doble de cada variable
		System.out.println(X + " + " + X + " = " + (X+X));
		System.out.println(Y + " + " + Y + " = " + (Y+Y));
		System.out.println(N + " + " + N + " = " + (N+N));
		System.out.println(M + " + " + M + " = " + (M+M));
		// la suma de todas las variables
		System.out.println(X + " + " + Y + " + " + N + " + " + M + " = " + (X + Y + N + M));
		// el producto de todas las variables
		System.out.println(X + " * " + Y + " * " + N + " * " + M + " = " + (X * Y * N * M));
		
		
		

	}

}
