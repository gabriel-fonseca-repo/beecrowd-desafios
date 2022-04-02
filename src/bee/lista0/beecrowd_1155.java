package bee.lista0;

public class beecrowd_1155 {
	public static void main(String[] args) {
		float divisor = 1, s = 0, i = 0;

		while (divisor <= 100) {
			i = 1 / divisor;
			s += i;
			divisor++;
		}
		System.out.printf("%.2f ", s);
		System.out.print("\n");
	}
}
