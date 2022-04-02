package bee.rnd;

import java.util.Scanner;

public class beecrowd_1012 {

	static Scanner entradaDados = new Scanner(System.in);

	static class formasGeo {
		double aDouble = entradaDados.nextDouble();
		double bDouble = entradaDados.nextDouble();
		double cDouble = entradaDados.nextDouble();
		double pi = 3.14159;

		public void triangulo() {
			double areaTriangulo = (this.aDouble * this.cDouble) / 2;
			System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
		}

		public void circulo() {
			double areaCirculo = this.pi * (this.cDouble * this.cDouble);
			System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		}

		public void trapezio() {
			double areaTrapezio = ((this.aDouble + this.bDouble) / 2) * this.cDouble;
			System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		}

		public void quadrado() {
			double areaQuadrado = this.bDouble * this.bDouble;
			System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		}

		public void retangulo() {
			double areaRetangulo = this.aDouble * this.bDouble;
			System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
		}
	}

	public static void main(String[] args) {
		formasGeo metodos = new formasGeo();

		metodos.triangulo();
		metodos.circulo();
		metodos.trapezio();
		metodos.quadrado();
		metodos.retangulo();
	}
}
