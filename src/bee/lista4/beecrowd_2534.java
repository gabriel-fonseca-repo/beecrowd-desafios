package bee.lista4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class beecrowd_2534 {

	public static class exame {
		private int pacintes;
		private int consultas;
		private ArrayList<paciente> registroArray;

		public exame(int pacintes, int consultas) {
			this.pacintes = pacintes;
			this.consultas = consultas;
		}

		public int getPacintes() {
			return pacintes;
		}

		public void setPacintes(int pacintes) {
			this.pacintes = pacintes;
		}

		public int getConsultas() {
			return consultas;
		}

		public void setConsultas(int consultas) {
			this.consultas = consultas;
		}

		public ArrayList<paciente> getRegistroArray() {
			return registroArray;
		}

		public void setRegistroArray(ArrayList<paciente> registroArray) {
			registroArray.sort(new ComparaPaciente());
			this.registroArray = registroArray;
		}
	}

	public static class paciente {
		int nota;

		public paciente(int nota) {
			this.nota = nota;
		}

		public int getNota() {
			return nota;
		}

		public void setNota(int nota) {
			this.nota = nota;
		}
	}

	public static class ComparaPaciente implements Comparator<paciente> {
		@Override
		public int compare(paciente c1, paciente c2) {
			if (c1.getNota() < (c2.getNota())) {
				return 1;
			} else if (c1.getNota() > (c2.getNota())) {
				return -1;
			} else {
				return 0;
			}
		}
	}

	public static void main(String[] args) {
		Scanner entrada = null;
		entrada = new Scanner(System.in);
		while (entrada.hasNextLine()) {
			ArrayList<paciente> registroArray = new ArrayList<>();
			String[] pacEconsul = entrada.nextLine().split(" ");
			exame exame = new exame(Integer.parseInt(pacEconsul[0]), Integer.parseInt(pacEconsul[1]));
			for (int i = 0; i < exame.getPacintes(); i++) {
				registroArray.add(new paciente(Integer.parseInt(entrada.nextLine())));
			}
			exame.setRegistroArray(registroArray);
			for (int i = 0; i < exame.getConsultas(); i++) {
				System.out.println(exame.getRegistroArray().get(Integer.parseInt(entrada.nextLine()) - 1).getNota());
			}
		}
		entrada.close();
	}
}
