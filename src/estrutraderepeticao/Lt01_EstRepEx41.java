package estrutraderepeticao;

public class Lt01_EstRepEx41 {

	public static void main(String[] args) {
		for(int dado1 = 1; dado1 <= 6; dado1++) {
			for(int dado2 =1; dado2 <= 6; dado2++) {
				if (dado1 + dado2 == 7) {
					System.out.printf("Dado1 %d + dado2 %d = 7 %n", dado1, dado2);
				}
			}
		}
		
	}

}
