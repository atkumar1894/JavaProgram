package filterStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NullContainExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Removing null elements from List and storing in another list
		
		List<String> nullContain=Arrays.asList("A",null,"B",null,"D","S","U",null,"I");
		List<String> noNull=new ArrayList<>();
		
		noNull=nullContain.stream().filter(str->str!=null).collect(Collectors.toList());
		
		System.out.println(noNull);
		
		// Original List
		System.out.println(nullContain);
		

	}

}
