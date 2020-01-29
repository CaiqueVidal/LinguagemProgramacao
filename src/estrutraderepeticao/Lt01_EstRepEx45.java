package estrutraderepeticao;

public class Lt01_EstRepEx45 {

	public static void main(String[] args) {
		double resultadoSerie = 0;
		
		for (int i = 1; i <= 15; i++) {
			
			resultadoSerie += i/(Math.pow(i, 2));
		}

		System.out.print("Resultado série = " + resultadoSerie);
		
	}

}
