package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Instanciando um objeto da classe Student
		Student student = new Student();

		// Obtendo dados do Aluno
		System.out.print("Nome Aluno: ");
		student.nome = sc.nextLine();
		System.out.print("Nota 1� Trimestre: ");
		student.nota1 = sc.nextDouble();
		System.out.print("Nota 2� Trimestre: ");
		student.nota2 = sc.nextDouble();
		System.out.print("Nota 3� Trimestre: ");
		student.nota3 = sc.nextDouble();

		// Fazendo c�lculo da nota final e trazendo a valida��o de aprova��o.
		double notaFinal = student.notaFinal();
		System.out.println("\n" + student.validaAprovacao(notaFinal));

		sc.close();

	}

}
