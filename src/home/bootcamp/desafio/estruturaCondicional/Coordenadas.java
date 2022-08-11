package home.bootcamp.desafio.estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Coordenadas {
	
	Double x = 0.0, y = 0.0;
	
	public Coordenadas() {
		quandrante();
	}
	
	public void quandrante() {
		
		System.out.println("\t\t••• Coordenadas Plano Cartesiano •••\n");
		
		System.out.println(""
				+ "		 		^ Y +\n"
				+ "\t\t\t        |\n"
				+ " 		 	Q2	|	Q1\n"
				+ "\t\t    -    	|\n"
				+ "\t\t\t<-------○-----------> X	\n"
				+ "		 		|	\t+ "
				+ "\n\t		 Q3	|	Q4\n"
				+ "\t\t\t     -  v"
				+ "\n");
		
		Locale.setDefault(Locale.US);
		try(Scanner scan = new Scanner(System.in)){
			
			System.out.println("Insira o valor de X: ");
			x = scan.nextDouble();
			System.out.println("Insira o valor de Y: ");
			y = scan.nextDouble();
			
			
			if(x > 0 && y > 0) {
				System.out.println("\n• Resultado: \n");
				System.out.println("X = "+x);
				System.out.println("Y = "+y);
				System.out.println("\tQuadrante Q1");
			}
			else if(x < 0 && y < 0) {
				System.out.println("\n• Resultado: \n");
				System.out.println("X = "+x);
				System.out.println("Y = "+y);
				System.out.println("\tQuadrante Q3");
			}
			else if(x > 0 && y < 0) {
				System.out.println("\n• Resultado: \n");
				System.out.println("X = "+x);
				System.out.println("Y = "+y);
				System.out.println("\tQuadrante Q4");
			}
			else if(x < 0 && y > 0) {
				System.out.println("\n• Resultado: \n");
				System.out.println("X = "+x);
				System.out.println("Y = "+y);
				System.out.println("\tQuadrante Q2");
			}
			else if(x == 0 && y != 0) {
				System.out.println("\n• Resultado: \n");
				System.out.println("X = "+x);
				System.out.println("Y = "+y);
				System.out.println("\tEixo Y");
			}
			else if(x != 0 && y == 0) {
				System.out.println("\n• Resultado: \n");
				System.out.println("X = "+x);
				System.out.println("Y = "+y);
				System.out.println("\tEixo X");
			}
			else {
				System.out.println("\n• Resultado: \n");
				System.out.println("X = "+x);
				System.out.println("Y = "+y);
				System.out.println("\tORIGEM");
			}
			
		}catch(Exception e) {
			System.out.println("Erro...\n"+e);
		}
		
	}//quadrante

}//classe
