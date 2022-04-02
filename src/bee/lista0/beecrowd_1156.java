package bee.lista0;

public class beecrowd_1156 {
	public static void main(String[] args) {

		float n = 3, divisor = 2, s = 0, i = 0;

		while (n <= 39) {
			i = n / divisor;
			s += i;
			divisor *= 2;
			n += 2;
		}

		System.out.printf("%.2f", (s + 1));
		System.out.print("\n");

	}
}
