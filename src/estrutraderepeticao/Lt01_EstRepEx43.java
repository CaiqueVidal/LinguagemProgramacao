package estrutraderepeticao;

public class Lt01_EstRepEx43 {

	public static void main(String[] args) {
		double ana = 1.10, maria = 1.50;
		int ano = 0;
		
		while(maria > ana) {
			ana += 0.3;
			maria += 0.2;
			ano ++;
		}
		
		System.out.printf("Ana vai demorar %d anos para ser maior que a Maria", ano);
		
	}

}
