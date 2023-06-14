package ValoresNumericos;

import java.util.ArrayList;
import java.util.Scanner;

public class ValNum {

	public static void main(String[] args) {
		Scanner tc = new Scanner(System.in);
		ArrayList<Integer> num = new ArrayList<Integer>();
		
		int n = 0;
		int sum = 0;
		int cont = 0;
		double med = 0.0;
		try {
		while (n != -99) {
			System.out.println("Introduce un numero entero(-99 si desea terminar)");
			n = tc.nextInt();
			if (n != -99) {
				num.add(n);
				sum += n;
				cont++;
			}
		  }
		if (cont > 0) {
			med = (double) sum / cont;
		}
		System.out.println("-----------------------------");
		System.out.println("Se leyeron " + cont + " valores!");
		System.out.println("*****************************");
		System.out.println("La suma de los valores es " + sum + "!");
		System.out.println("*****************************");
		System.out.println("La media de los valores es " + med + "!");
		System.out.println("*****************************");
		
		int mayores = 0;
		int mayor = Integer.MIN_VALUE;
		for (int i = 0; i < num.size(); i++) {
			if (num.get(i) > med) {
				mayores++;
				if (num.get(i) > mayor) {
					mayor = num.get(i);
				}
			}
		}
		System.out.println("Hay " + mayores + " valores mayores que la media.");
		System.out.println("Numero mayor que la media es " + mayor + "");
		System.out.println("****VALORES INGRESADOS****");
		System.out.println(num);
		}catch (Exception e) {
			System.out.println("INGRESE UN NUMERO ENTERO!");
		}
		}
	 }


