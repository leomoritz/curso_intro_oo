package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Calculando �rea, Per�metro e Diagonal de um Retangulo
		Rectangle r = new Rectangle();

		System.out.println("Enter rectangle width and height");
		r.width = sc.nextDouble();
		r.height = sc.nextDouble();

		System.out.printf("AREA: %.2f\n", r.area());
		System.out.printf("PERIMETER: %.2f\n", r.perimeter());
		System.out.printf("DIAGONAL: %.2f\n", r.diagonal());

		sc.close();

	}

}
