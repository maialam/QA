public class Calculator {

	public static void main(String[] args) {
		
		Calc();

	}
	
	
	public static void Calc() {
		
		int numA = 4;
		int numB = 8;
		
		int option = 2;
		switch (option) {
		
		case 1: 
			int sum = numA + numB;
			System.out.println(sum);
			
			break;
		
		case 2: 
			int sum2 = numA - numB;
			System.out.println(sum2);
			
			break;
			
		case 3: 
			int sum3 = numA * numB;
			System.out.println(sum3);
			
			break;
			
		case 4: 
			int sum4 = numA / numB;
			System.out.println(sum4);
			
			break;
		
		}
		
		
	}	
	
	
}