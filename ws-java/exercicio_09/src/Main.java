import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int opc = sc.nextInt();
		
		while (opc != 4) {
			if (opc == 1) {
				alcool += 1;
			}
			else if (opc == 2) {
				gasolina += 1;
			}
			else if (opc == 3) {
				diesel += 1;
			}
			
			opc = sc.nextInt();
			
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		sc.close();
		
	}

}
