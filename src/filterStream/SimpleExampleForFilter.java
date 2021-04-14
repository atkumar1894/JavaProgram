package filterStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class SimpleExampleForFilter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		List<Integer> numbers=Arrays.asList(5,10,15,20,25,30,35,40);
		List<Integer> evenNumbers=new ArrayList<Integer>();


		//Without Stream getting even numbers from the collection list

		//		for(int in:numbers)
		//		{
		//			if(in%2 ==0 )
		//			{
		//				evenNumbers.add(in);
		//			}
		//			
		//		}
		//		System.out.println(evenNumbers);


		//Using streams getting even numbers

		evenNumbers=numbers.stream().filter(n->n%2==0).collect(Collectors.toList());

		System.out.println(evenNumbers);

	}

}
