package bee.lista1;

import java.util.Scanner;

public class beecrowd_2221 {

	public static class jogoPokemon {
		private int instancias = 0, bonusDabriel = 0, bonusGuarte = 0, atqDabriel = 0, atqGuarte = 0, defDabriel = 0,
				defGuarte = 0, lvlDabriel = 0, lvlGuarte = 0, valorGolpeDabriel = 0, valorGolpeGuarte = 0;

		private String vencedor = "";

		private void setInstancias(int instancias) {
			this.instancias = instancias;
		}

		private void setBonusDabriel(int bonus) {
			this.bonusDabriel = bonus;
		}

		private void setBonusGuarte(int bonusGuarte) {
			this.bonusGuarte = bonusGuarte;
		}

		private void setAtqDabriel(int atqDabriel) {
			this.atqDabriel = atqDabriel;
		}

		private void setAtqGuarte(int atqGuarte) {
			this.atqGuarte = atqGuarte;
		}

		private void setDefDabriel(int defDabriel) {
			this.defDabriel = defDabriel;
		}

		private void setDefGuarte(int defGuarte) {
			this.defGuarte = defGuarte;
		}

		private void setLvlDabriel(int lvlDabriel) {
			this.lvlDabriel = lvlDabriel;
		}

		private void setLvlGuarte(int lvlGuarte) {
			this.lvlGuarte = lvlGuarte;
		}

		private void setVencedor(String vencedor) {
			this.vencedor = vencedor;
		}

		private String getVencedor() {
			return vencedor;
		}

		private void calculoVencedor() {
			if ((this.lvlDabriel % 2) != 0) {
				this.bonusDabriel = 0;
			}
			if ((this.lvlGuarte % 2) != 0) {
				this.bonusGuarte = 0;
			}
			this.valorGolpeDabriel = ((this.atqDabriel + this.defDabriel) / 2) + this.bonusDabriel;
			this.valorGolpeGuarte = ((this.atqGuarte + this.defGuarte) / 2) + this.bonusGuarte;
			if (this.valorGolpeGuarte == this.valorGolpeDabriel) {
				setVencedor("Empate");
			} else if (this.valorGolpeDabriel > this.valorGolpeGuarte) {
				setVencedor("Dabriel");
			} else {
				setVencedor("Guarte");
			}
		}
	}

	public static void main(String[] args) {
		jogoPokemon metodos = new jogoPokemon();
		Scanner entradaDados = new Scanner(System.in);

		int nInstancias = entradaDados.nextInt();
		metodos.setInstancias(nInstancias);

		for (int i = 0; i < metodos.instancias; i++) {
			int nBonus = entradaDados.nextInt();
			metodos.setBonusDabriel(nBonus);
			metodos.setBonusGuarte(nBonus);
			int nAtqDabriel = entradaDados.nextInt();
			int nDefDabriel = entradaDados.nextInt();
			int nLvlDabriel = entradaDados.nextInt();
			metodos.setAtqDabriel(nAtqDabriel);
			metodos.setDefDabriel(nDefDabriel);
			metodos.setLvlDabriel(nLvlDabriel);
			int nAtqGuarte = entradaDados.nextInt();
			int nDefGuarte = entradaDados.nextInt();
			int nLvlGuarte = entradaDados.nextInt();
			metodos.setAtqGuarte(nAtqGuarte);
			metodos.setDefGuarte(nDefGuarte);
			metodos.setLvlGuarte(nLvlGuarte);

			metodos.calculoVencedor();
			System.out.println(metodos.getVencedor());
		}
		entradaDados.close();
	}
}
