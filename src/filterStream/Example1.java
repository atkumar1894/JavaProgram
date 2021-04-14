package filterStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		List<String> str=Arrays.asList("Pirya","payal","Raghu","Radhe","cercie","sansa");
//		List<String> evenPositions=new ArrayList<>();
		
		List<Integer> str=Arrays.asList(2,4,6,3,6,7,8,4,7,8,7,8,0);
		List<Integer> evenPositions=new ArrayList<>();
		
		evenPositions=str.stream().filter(n-> n%2==0).collect(Collectors.toList());
		
		System.out.println(evenPositions);
		
		
	}

}
