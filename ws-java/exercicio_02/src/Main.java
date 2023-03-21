import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Double raio, area, pi = 3.14159;
		
		raio = sc.nextDouble();
		
		area = pi * raio * raio;
		
		System.out.printf("Area =%.4f%n", area);
		
		sc.close();
		
	}

}
