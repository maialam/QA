package Iteration.Streams;

public interface Calc {

	
	int operation (int a, int b);
	
	Calc subtraction = (a, b) -> a - b;

	Calc addition = (a, b) -> a + b;

	Calc multiplication = (a, b) -> a * b;


	
}	



