package mapStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> lowercase=Arrays.asList("car","bus","bike","plane","train","metro");

		List<String> uppercase=new ArrayList<>();

		// Before stream this is how it is used to do

		//		for(String str:lowercase)
		//		{
		//			uppercase.add(str.toUpperCase());
		//		}
		//		
		//		System.out.println(uppercase);

		uppercase=lowercase.stream().map(name->name.toUpperCase()).collect(Collectors.toList());
		
		System.out.println(uppercase);


	}

}
