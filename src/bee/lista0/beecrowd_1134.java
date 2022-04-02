package bee.lista0;

import java.util.Scanner;

public class beecrowd_1134 {
	public static void main(String[] args) {
		Scanner entradaDados = new Scanner(System.in);
		var abastecimento = 0;
		var alcool = 0;
		var gasolina = 0;
		var diesel = 0;

		do {
			abastecimento = entradaDados.nextInt();
			if (abastecimento == 1) {
				alcool++;
			} else if (abastecimento == 2) {
				gasolina++;
			} else if (abastecimento == 3) {
				diesel++;
			} else if (abastecimento == 4) {
				break;
			}
		} while (true);

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		entradaDados.close();
	}
}
