package filterStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		List<Integer> numbers=Arrays.asList(4,3,5,6,8,9,1,4);
		
		List<Integer> store=new ArrayList<>();
		
		
	numbers.stream().map(m->m*2).forEach(res->System.out.println(res));
	
	
	
	
	


	}

}
