package bee.lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class beecrowd_2167_v2 {

	public static class engenheiro {

		private int resultadoTeste;

		public void calcTesteMotor(int nTestes, Motores motores) {
			int indice = 0;

			for (int i = 1; i < nTestes; i++) {
				if (motores.getMotores().get(i) < motores.getMotores().get(i - 1)) {
					indice = i;
					break;
				}
			}

			if (indice != 0) {
				this.resultadoTeste = indice + 1;
			} else {
				this.resultadoTeste = indice;
			}

		}

		public int getResultadoTeste() {
			return resultadoTeste;
		}

		public void setResultadoTeste(int resultadoTeste) {
			this.resultadoTeste = resultadoTeste;
		}

	}

	public static class Motores {
		ArrayList<Integer> motores = new ArrayList<Integer>();

		public Motores(String[] motores) {
			for (String motore : motores) {
				this.motores.add(Integer.parseInt(motore));
			}
		}

		public ArrayList<Integer> getMotores() {
			return motores;
		}

		public void setMotores(ArrayList<Integer> motores) {
			this.motores = motores;
		}
	}

	public static void main(String[] args) {

		Scanner entradaDados = new Scanner(System.in);

		int nTestes = entradaDados.nextInt();
		entradaDados.nextLine();
		String stringMotores = entradaDados.nextLine();
		String[] arrayMotores = stringMotores.split(" ");

		Motores motores = new Motores(arrayMotores);
		engenheiro ze = new engenheiro();

		ze.calcTesteMotor(nTestes, motores);

		System.out.println(ze.getResultadoTeste());

		entradaDados.close();
	}
}
