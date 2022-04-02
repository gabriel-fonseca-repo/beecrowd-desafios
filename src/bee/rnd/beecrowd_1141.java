package bee.rnd;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class beecrowd_1141 {

	public static class ComparaString implements Comparator<String> {
		@Override
		public int compare(String s1, String s2) {
			if (s1.length() < s2.length()) {
				return -1;
			} else if (s1.length() > s2.length()) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		ArrayList<String> strings = new ArrayList<String>();
		ArrayList<String> ordemOriginalStrings = new ArrayList<>();
		int quantidadeAcertosAtual = 0;
		int quantidadeStrings = Integer.parseInt(entradaDados.nextLine());

		while (quantidadeStrings != 0) {
			for (int i = 0; i < quantidadeStrings; i++) {
				String string = entradaDados.nextLine();
				strings.add(string);
			}
			quantidadeStrings = Integer.parseInt(entradaDados.nextLine());
			ordemOriginalStrings.addAll(strings);
			strings.sort(new ComparaString());
			for (String s1 : strings) {
				for (String s2 : strings) {
					String[] stringsTestes = s2.split(s1);
					System.out.print("string partida: ");
					System.out.println(Arrays.toString(stringsTestes));
					if (stringsTestes.length > 1) {
						quantidadeAcertosAtual++;
					}
				}
			}
			System.out.println("qtd acertos: " + quantidadeAcertosAtual);
			if (quantidadeStrings != 0) {
				strings = new ArrayList<>();
				ordemOriginalStrings = new ArrayList<>();
				quantidadeAcertosAtual = 0;
			}
		}
		entradaDados.close();
	}
}