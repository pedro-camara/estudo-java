import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Double A, B, C, triangulo, circulo, trapezio, quadrado, retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		triangulo = A * C / 2.0;
		circulo = 3.14159 * C * C;
		trapezio = (A + B) / 2.0 * C;
		quadrado = B * B;
		retangulo = A * B;
		
		System.out.printf("Triangulo = %3.fn%", triangulo);
		System.out.printf("Circulo = %3.fn%", circulo);
		System.out.printf("Trapezio = %3.fn%", trapezio);
		System.out.printf("Quadrado = %3.fn%",quadrado);
		System.out.printf("Retangulo = %3.fn%", retangulo);
		
		sc.close();
		
		
	}

}
