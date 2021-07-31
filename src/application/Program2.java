package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Instanciando um objeto da classe Employee
		Employee employee1 = new Employee();

		// Coletando as informações do funcionário
		System.out.print("Name: ");
		employee1.name = sc.nextLine();
		System.out.print("Gross Salary: ");
		employee1.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee1.tax = sc.nextDouble();

		// Imprimir as informações do funcionário com toString customizado:
		System.out.println(employee1.toString()); // ou System.out.println(employee1);

		// Aumento de Salário
		System.out.print("Which percentage to increase salary? ");
		employee1.increaseSalary(sc.nextDouble());

		System.out.println("\nUPDATED DATA: \n" + employee1);

		sc.close();

	}

}
