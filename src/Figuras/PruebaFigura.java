package Figuras;
import java.util.Scanner;
public class PruebaFigura {

	    public static void main(String args[]) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el radio del círculo: ");
	        int radio = scanner.nextInt();
	        Circulo figura1 = new Circulo(radio);

	        System.out.print("Ingrese la base del rectángulo: ");
	        int base = scanner.nextInt();
	        System.out.print("Ingrese la altura del rectángulo: ");
	        int altura = scanner.nextInt();
	        Rectangulo figura2 = new Rectangulo(base, altura);

	        System.out.print("Ingrese el lado del cuadrado: ");
	        int lado = scanner.nextInt();
	        Cuadrado figura3 = new Cuadrado(lado);

	        System.out.print("Ingrese la base del triángulo rectángulo: ");
	        int baseTriangulo = scanner.nextInt();
	        System.out.print("Ingrese la altura del triángulo rectángulo: ");
	        int alturaTriangulo = scanner.nextInt();
	        TrianguloRectangulo figura4 = new TrianguloRectangulo(baseTriangulo, alturaTriangulo);

	        System.out.println("El área del círculo es = " + figura1.calcularArea());
	        System.out.println("El perímetro del círculo es = " + figura1.calcularPerimetro());
	        System.out.println();

	        System.out.println("El área del rectángulo es = " + figura2.calcularArea());
	        System.out.println("El perímetro del rectángulo es = " + figura2.calcularPerimetro());
	        System.out.println();

	        System.out.println("El área del cuadrado es = " + figura3.calcularArea());
	        System.out.println("El perímetro del cuadrado es = " + figura3.calcularPerimetro());
	        System.out.println();

	        System.out.println("El área del triángulo es = " + figura4.calcularArea());
	        System.out.println("El perímetro del triángulo es = " + figura4.calcularPerimetro());
	        figura4.determinarTipoTriangulo();

	        scanner.close();
	    }
	}
