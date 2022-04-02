package bee.lista2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class beecrowd_1258_v2 {
	public static class confeccionaria {
		public ArrayList<cliente> organizarPedido(ArrayList<cliente> clientes) {
			Collections.sort(clientes, new ComparaCliente());
			return clientes;
		}
	}

	public static class ComparaCliente implements Comparator<cliente> {
		@Override
		public int compare(cliente c1, cliente c2) {
			if (c1.getCorCamisa().compareTo(c2.getCorCamisa()) < 0) {
				return -1;
			} else if (c1.getCorCamisa().compareTo(c2.getCorCamisa()) > 0) {
				return 1;
			} else {
				if (c1.getTamanhoCamisa().compareTo(c2.getTamanhoCamisa()) < 0) {
					return 1;
				} else if (c1.getTamanhoCamisa().compareTo(c2.getTamanhoCamisa()) > 0) {
					return -1;
				} else {
					if (c1.getNomeCliente().compareTo(c2.getNomeCliente()) < 0) {
						return -1;
					} else if (c1.getNomeCliente().compareTo(c2.getNomeCliente()) > 0) {
						return 1;
					} else {
						return 0;
					}
				}
			}
		}
	}

	public static class cliente {
		private String nomeCliente;
		private String corCamisa;
		private String tamanhoCamisa;

		public cliente(String nomeCliente, String corCamisa, String tamanhoCamisa) {
			super();
			this.nomeCliente = nomeCliente;
			this.corCamisa = corCamisa;
			this.tamanhoCamisa = tamanhoCamisa;
		}

		public String getNomeCliente() {
			return nomeCliente;
		}

		public void setNomeCliente(String nomeCliente) {
			this.nomeCliente = nomeCliente;
		}

		public String getCorCamisa() {
			return corCamisa;
		}

		public void setCorCamisa(String corCamisa) {
			this.corCamisa = corCamisa;
		}

		public String getTamanhoCamisa() {
			return tamanhoCamisa;
		}

		public void setTamanhoCamisa(String tamanhoCamisa) {
			this.tamanhoCamisa = tamanhoCamisa;
		}
	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		confeccionaria confeccionaria = new confeccionaria();
		ArrayList<cliente> listaClientes = new ArrayList<cliente>();
		int qtdCamisas = Integer.parseInt(entradaDados.nextLine());
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < qtdCamisas; j++) {
				String nome = entradaDados.nextLine();
				String corCamisa = entradaDados.next();
				String tamanhoCamisa = entradaDados.next();
				entradaDados.nextLine();

				cliente cliente = new cliente(nome, corCamisa, tamanhoCamisa);
				listaClientes.add(cliente);
			}
			ArrayList<cliente> TotalPedidoOrganizado = confeccionaria.organizarPedido(listaClientes);
			for (cliente s : TotalPedidoOrganizado) {
				System.out.println(s.getCorCamisa() + " " + s.getTamanhoCamisa() + " " + s.getNomeCliente());
			}
			int proximoPedido = Integer.parseInt(entradaDados.nextLine());
			if (proximoPedido != 0) {
				qtdCamisas = proximoPedido;
				i = 0;
				listaClientes = new ArrayList<cliente>();
			} else {
				break;
			}
			System.out.println();
		}
		entradaDados.close();
	}
}
