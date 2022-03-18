import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		Boolean salida =true ;
		
		do {
			System.out.println("-------MENU------");
			System.out.println("<1>Total de megavatios de consumo");
			System.out.println("<2>Nuevo diccionario");
			System.out.println("<3>Dinero recaudado");
			System.out.println("<0>Salir del programa");
			System.out.println("\nIngrese opción: ");
			int opcion = teclado.nextInt();
			
			if (opcion== 1) {
				Scanner sc1=new Scanner(System.in);
				System.out.println("Ingrese el nombre de la planta: ");
				String planta = sc1.nextLine();
				System.out.println("Ingrese el nombre de la ciudad: ");
				String ciudad = sc1.nextLine();	
				consumo_energia totalconsumo = new consumo_energia();
				int totaL = totalconsumo.consumoEnergia(planta, ciudad);
				System.out.println("El total del consumo es:"+totaL);
				
			}
			else if (opcion == 2) {
				Scanner sc1=new Scanner(System.in);
				System.out.println("Ingrese el nombre de la cuidad:");
				String ciudad = sc1.nextLine();				
				Nuevo_Diccionario dic = new Nuevo_Diccionario();
				Map diccionario = dic.diccionario(ciudad);				
				System.out.println(diccionario.toString());
							
			}
			else if (opcion == 3) {
				Scanner sc1=new Scanner(System.in);
				System.out.print("Ingrese la region 'costa''sierra''oriente': ");
				String region = sc1.nextLine();
				Dinero_Recaudado din= new Dinero_Recaudado();
				double dinero= din.dineroRecaudado(region);
				System.out.println("El dinero total recaudado en "+region+" es: $"+dinero);
			
			}
			else if(opcion==0) {
				System.out.println("Hasta la proxima ^^");
				salida = false;
			}else {
				System.out.println("ERROR:Escoja una opcion posible");
			}
		}

		  while (salida);
	}

}
