package bee.lista1;

import java.util.Scanner;

public class beecrowd_1038 {

	private static class cardapio {
		public double getPedido(int codigo) {
			double cachorroQuente = 4.00;
			double saladaX = 4.50;
			double xBacon = 5.00;
			double torradaSimples = 2.00;
			double refrigerante = 1.50;
			return switch (codigo) {
			case 1 -> cachorroQuente;
			case 2 -> saladaX;
			case 3 -> xBacon;
			case 4 -> torradaSimples;
			case 5 -> refrigerante;
			default -> 0;
			};
		}
	}

	private static class pedido {
		private int codigo = 0;
		private int quantidade = 0;

		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}

		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public int getCodigo() {
			return this.codigo;
		}

		public int getQuantidade() {
			return this.quantidade;
		}

	}

	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		pedido pedidos = new pedido();
		cardapio cardapio = new cardapio();

		int pedido = entradaDados.nextInt();
		int quantidade = entradaDados.nextInt();

		pedidos.setCodigo(pedido);
		pedidos.setQuantidade(quantidade);

		double totalPedido = cardapio.getPedido(pedidos.getCodigo()) * pedidos.getQuantidade();

		System.out.printf("Total: R$ %.2f\n", totalPedido);

		entradaDados.close();
	}
}
