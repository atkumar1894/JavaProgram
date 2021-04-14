package filterStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleUsingStringValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> list=Arrays.asList("RohitSharma","viratyt","Sehwag","Tendulkar","Yuvraj","Prashant","SachinTe");
		List<String> longnames=new ArrayList();
		
		//longnames=list.stream().filter(str->str.length()>=6 && str.length()<=8).collect(Collectors.toList());
		
		//System.out.println(longnames);
		
		// if we required to print data without stroing into another collection
		
	 list.stream().filter(str->str.length()>=6 && str.length()<=8).forEach(System.out::println);

	}

}
