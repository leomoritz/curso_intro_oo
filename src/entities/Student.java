package entities;

public class Student {
	
	public String nome;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double notaFinal() {
		return nota1 + nota2 + nota3;
	}
	
	public String validaAprovacao(double notaFinal) {
		if(notaFinal > 60.00) {
			return String.format("FINAL GRADE = %.2f\n", notaFinal)
					+ "PASS";
		}else {
			double missing = 60.00 - notaFinal;
			return String.format("FINAL GRADE = %.2f\n", notaFinal)
					+ "FAILED\n" 
					+ String.format("MISSING %.2f POINTS", missing);
		}
	}
	
	
}
