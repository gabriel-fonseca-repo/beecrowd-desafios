package bee.lista3;

import java.util.Scanner;

public class beecrowd_1114 {
	public static class senha {
		private String senha;

		public senha(String senha) {
			this.senha = senha;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}
	}

	public static class sistema {
		private String senhaCorreta = "2002";

		public void login(String senha) {
			if (senha.equals(this.senhaCorreta)) {
				System.out.println("Acesso Permitido");
			} else {
				IllegalArgumentException erro = new IllegalArgumentException();
				throw erro;
			}
		}

		public String getSenhaCorreta() {
			return senhaCorreta;
		}

		public void setSenhaCorreta(String senhaCorreta) {
			this.senhaCorreta = senhaCorreta;
		}
	}

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		sistema sys = new sistema();
		int tentativas = 1;
		do {
			senha senha = new senha(entrada.nextLine());
			try {
				sys.login(senha.getSenha());
			} catch (IllegalArgumentException erro) {
				System.out.println("Senha Invalida");
				tentativas++;
			}
			tentativas--;
		} while (tentativas != 0);
		entrada.close();
	}
}
