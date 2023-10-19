package examen4;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("ingrese la cantidad de triangulos a calcular");
		int n = input.nextInt();
		
		for (int i = 1; i == n; i++) {
			System.out.println("Triangulo #"+ i );
			
			System.out.println("ingrese la base del triangulo");
			double base = input.nextDouble();
			if (base < 0) {
				System.out.println("la base no peude ser negativa");
				i--;
				continue;
			}
			
			System.out.println("ingrese la base del triangulo");
			double altura = input.nextDouble();
			if (altura < 0) {
				System.out.println("la altura no peude ser negativa");
				i--;
				continue;
			}
			
			double area = (base * altura) / 2;
			System.out.println("el area del triangulo es:" + area);
		}
	}

}
