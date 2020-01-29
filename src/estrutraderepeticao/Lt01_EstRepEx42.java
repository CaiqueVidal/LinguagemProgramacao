package estrutraderepeticao;

public class Lt01_EstRepEx42 {

	public static void main(String[] args) {
		int divisor = 1, dividendo= 0; 
		double quociente = 0;

		while(divisor <= 50) {
			dividendo += divisor;
			quociente += (double) divisor / dividendo;
			divisor ++;
		}
		
		System.out.println("Resultado: " + quociente);
	
	}

}
