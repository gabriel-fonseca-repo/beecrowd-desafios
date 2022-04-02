package bee.lista1;

import java.util.Scanner;

public class beecrowd_2708 {

	static class idaEvinda {
		private int pessoas = 0, jipes = 0;

		private void calculoPessoas(String comando, int pessoas) {
			if (comando.equals("SALIDA")) {
				this.pessoas += pessoas;
				this.jipes++;
			} else if (comando.equals("VUELTA")) {
				this.pessoas -= pessoas;
				this.jipes--;
			}
		}

		private void printAll() {
			System.out.println(this.pessoas);
			System.out.println(this.jipes);
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		idaEvinda metodos = new idaEvinda();

		String comando;
		int pessoas;
		do {
			comando = entradaDados.next();
			if (comando.equals("ABEND")) {
				break;
			}
			pessoas = entradaDados.nextInt();
			metodos.calculoPessoas(comando, pessoas);
		} while (true);
		metodos.printAll();
		entradaDados.close();
	}
}
