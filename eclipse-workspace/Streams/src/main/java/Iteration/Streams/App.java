package Iteration.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Comparator;
import java.util.IntSummaryStatistics;

public class App 
{
    public static void main( String[] args )
    {
    
		List<Integer> numbers = Arrays.asList(3,2,2,3,7,3,5,9,8,12);
		
		
//		System.out.println(Calc.multiplication.operation(2,5));

		System.out.println(Lambda.concat.operation("Hello ","world."));
		
//		Highest Number 
//		int Highest = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
//			System.out.println(Highest);
		
		
//		Lowest Number
//		int Lowest = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
//			System.out.println(Lowest);
		
		
		
//		Filtered List
//		List<Integer> filtered = numbers.stream().filter(string -> !numbers.isEmpty()).collect(Collectors.toList());
//			System.out.println("Filtered List: " + filtered);

		
		
		
//		Printing out whole list
//		numbers.stream().forEach(System.out::println);		
		
		
		
//		IntSummaryStatistics stats = numbers.stream().mapToInt((x) -> x).summaryStatistics();
//			System.out.println(stats.getMax());
//			System.out.println(stats.getMin());
		
		
//		Squared and add new to list
//		List<Integer> squared = numbers.stream().map(x -> x * x).collect(Collectors.toList());
//		squared.stream().forEach(System.out::println);
		
//		Sqaured and unique list
//		numbers.stream().map(x -> x * x).collect(Collectors.toList()).stream().distinct().forEach(System.out::println);
//		squaredUnique.stream().distinct().forEach(System.out::println);
		
//		
//		int[] numArray = new int[100];
//
//		
//		for (int i = 0; i < 100; i++) {
//			
//			
//			numArray[i] =  i + 1;
//			
//		System.out.println(numArray[i]);
//
//			
//		}
		
		
		

//		List<Integer> numArray2 = new ArrayList<Integer>();
//		
//		for (int i = 100; i < 1000; i++) {
//			
//			numArray2.get(i) = i + 1;
//		}
//		
//		
//    }
//    
//    
//    
//
//
		
    }
    
		
		
    
}
