package mapStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AddingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> adding=Arrays.asList(2,3,4,5,6,7,7,8);
		
		List<Integer> afterPorcess=new ArrayList<>();
		
		
		afterPorcess=adding.stream().map(ad->ad*10).collect(Collectors.toList());
		
		System.out.println(afterPorcess);

		
	}

}
