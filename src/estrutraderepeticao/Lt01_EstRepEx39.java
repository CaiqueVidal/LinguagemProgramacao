package estrutraderepeticao;

public class Lt01_EstRepEx39 {

	public static void main(String[] args) {
		System.out.printf("%s%10s%n", "Casa", "N. gr�os");

		for (int i = 0; i < 64; i++)
			System.out.printf("%2d\t%,.0f%n", i + 1, Math.pow(2, i));


	}

}
