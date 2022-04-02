package bee.lista1;

import java.util.Scanner;

public class beecrowd_1589 {

	static class raio {
		private int raio1 = 0;
		private int raio2 = 0;

		public void setRaio1(int raio1) {
			this.raio1 = raio1;
		}

		public void setRaio2(int raio2) {
			this.raio2 = raio2;
		}

		public int raioTotal() {
			return this.raio1 + this.raio2;
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		raio metodos = new raio();

		int qtdTestes = entradaDados.nextInt();
		for (int i = 0; i < qtdTestes; i++) {
			int raio1 = entradaDados.nextInt();
			metodos.setRaio1(raio1);
			int raio2 = entradaDados.nextInt();
			metodos.setRaio2(raio2);
			System.out.println(metodos.raioTotal());
		}
		entradaDados.close();
	}
}