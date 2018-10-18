package Iteration.Streams;

public interface Lambda {
	
	String operation(String a, String b);
	
	Lambda concat = (a, b) -> a + b;

}
