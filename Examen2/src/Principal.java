import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
	Scanner tienda = new Scanner (System.in);
	
	System.out.println("ingrese la cantidad de meses");
	int meses = tienda.nextInt();
	
	double[]venta =new double[meses];
	String[]mesesN = new String[meses];
	
	for (int i = 0; i < meses; i++) {
		tienda.nextLine();
		System.out.println("ingrese las ventas del meses" + (i+1)+": ");
		venta[i] = tienda.nextDouble();
		System.out.println("ingrese el nombre del mes" + (i+1)+":");
		mesesN[i]= tienda.next();
	}
	
	double total = 0;
	for (String string : mesesN) {
		total += string
	}
	
	
	
	}

}
