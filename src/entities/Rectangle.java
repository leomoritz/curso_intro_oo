package entities;

public class Rectangle {

	public double width;
	public double height;

	public double area() {
		// area = base * altura;
		return width * height;
	}

	public double perimeter() {
		// perimetro = soma de todos os lados do retângulo
		return 2 * (width + height);
	}

	public double diagonal() {
		// diagonal² = base² + altura²
		double diagonal;
		diagonal = Math.pow(width, 2) + Math.pow(height, 2);
		diagonal = Math.sqrt(diagonal);
		return diagonal;
		// return Math.sqrt(width * width + height * height);
	}

}
