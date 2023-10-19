import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	
        System.out.print("Ingrese Cantidad de estudiantes ");
        Integer N = scanner.nextInt();
		
		for (int i = 0; i < N; i++) {
            System.out.print("Ingrese el documento ");
            String documento1 = scanner.nextLine();

            System.out.print("Ingrese el nombre: ");
            String nombre = scanner.nextLine();

            System.out.print("Ingrese el telefono: ");
            Integer telefono = scanner.nextInt();
        

            System.out.print("Ingrese el codigo de la ciudad: ");
            Integer codigoCiudad = scanner.nextInt();
            
            scanner.nextLine();

            System.out.println("Resultados para " + nombre + ":");
            System.out.println("Documento: " + documento1);
            System.out.println("telefono:" + telefono);
            
            if (documento1.equalsIgnoreCase("salir")) {
                break;
            }

           

           if (codigoCiudad == 1) {
			System.out.println("hola " + nombre + " su viaje sera en medellin, fecha: 6 de octubre – 8 am");
		}else if (codigoCiudad == 2){
			System.out.println("hola " + nombre + " su viaje sera en Bogotá, fecha: 10 de noviembre 6 pm");
		}else if (codigoCiudad == 3) {
			System.out.println("hola " + nombre + " su viaje sera en Cartagena, fecha: 5 de abril 2 pm");
		}else if (codigoCiudad == 4) {
			System.out.println("hola " + nombre + " su viaje sera en Barranquilla, fecha:4 de mayo 4 am");
		}else {
			System.out.println("codigo de ciudad no encontrada");
		}
      
		}

         System.out.println("Lista completa de usuarios y resultados:");
        
         
        
        //for (int i = 0; i < documentos.size(); i++) {
          //  System.out.println("Nombre: " + nombres.get(i));
            //System.out.println("Documento: " + documentos.get(i));
            //System.out.println("Salario Anual: $" + salariosAnuales.get(i));

            //double salarioAnual = salariosAnuales.get(i);
            //double porcentajeVivienda = (salarioAnual > 50000) ? 0.30 : 0.25;
            //double porcentajeTransporte = (salarioAnual > 50000) ? 0.15 : 0.10;
            //double porcentajeAhorros = (salarioAnual > 50000) ? 0.20 : 0.15;

        // System.out.println("Porcentaje de gastos de vivienda: " + (porcentajeVivienda * 100) + "%");
        // System.out.println("Porcentaje de gastos de transporte: " + (porcentajeTransporte * 100) + "%");
        //  System.out.println("Porcentaje de ahorros: " + (porcentajeAhorros * 100) + "%");
        // System.out.println();
        //}

	}

}
