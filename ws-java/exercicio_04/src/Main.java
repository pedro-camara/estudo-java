import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int numFunc, horasTrab;
		Double valorHora, salario;
		
		numFunc = sc.nextInt();
		horasTrab = sc.nextInt();
		valorHora = sc.nextDouble();
		
		salario = horasTrab * valorHora;
		
		System.out.println("NUMBER = " + numFunc);
		System.out.printf("SALARY = U$ %.2fn%", salario);
		
		sc.close();
	}

}
