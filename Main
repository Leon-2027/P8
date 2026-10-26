package p8;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		Scanner read= new Scanner(System.in);
		ArrayList <Figura> com = new ArrayList<Figura>();
		double b, h, a, P, r, l;
		int op;
		
		System.out.println("¿De qué figura quiere obtener su área?");
		System.out.println("1) Triángulo");
		System.out.println("2) Cuadrádo");
		System.out.println("3) Rectángulo");
		System.out.println("4) Círculo");
		System.out.println("5) Pentágono");
		do {
			op=read.nextInt();
			switch(op) {
				case 1:
					System.out.println("Ingrese la base del triángulo:");
					b=read.nextDouble();
					System.out.println("Ingrese la altura del triángulo:");
					h=read.nextDouble();
					com.add(new Triangulo(h, b));
					System.out.println("Quiere obtener otra área?, -1 para dejar de calcular áreas");
					break;
				case 2:
					System.out.println("Ingrese el lado del cuadrado:");
					l=read.nextDouble();
					com.add(new Cuadrado(l));
					System.out.println("Quiere obtener otra área?, -1 para dejar de calcular áreas");
					break;
				case 3:
					System.out.println("Ingrese la base del rectángulo:");
					b=read.nextDouble();
					System.out.println("Ingrese la altura del rectángulo:");
					h=read.nextDouble();
					com.add(new Rectangulo(h, b));
					System.out.println("Quiere obtener otra área?, -1 para dejar de calcular áreas");
					break;
				case 4:
					System.out.println("Ingrese el radio del círculo:");
					r=read.nextDouble();
					com.add(new Circulo(r));
					System.out.println("Quiere obtener otra área?, -1 para dejar de calcular áreas");
					break;
				case 5:
					System.out.println("Ingrese la apotema del pentágono:");
					a=read.nextDouble();
					System.out.println("Ingrese el perímetro del pentágono:");
					P=read.nextDouble();
					com.add(new Pentagono(a, P));
					System.out.println("Quiere obtener otra área?, -1 para dejar de calcular áreas");
					break;
				case -1:
					System.out.println("Saliendo, obteniendo el(las) área(s)");
					break;
				default:
					System.out.println("Opción inválida, ingrese otra");
					break;
			}
		}while(op!=-1);
		for(int i=0; i<com.size(); i++) {
			Figura figura = com.get(i);
			System.out.println("Figura " + (i+1) + ": " + figura.CA());
		}
		read.close();
	}
}
