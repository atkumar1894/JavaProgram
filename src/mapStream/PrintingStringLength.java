package mapStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PrintingStringLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Printing string length 
		
		List<String> obj=Arrays.asList("hello","isThere","AnyOne","helloo","bbbbbbb","cccccccc");
		
		List<Integer> storingLength=new ArrayList<>();
		
		
		storingLength=obj.stream().map(len->len.length()).collect(Collectors.toList());
		
		System.out.println(storingLength);

	}

}
