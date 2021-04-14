package mapStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CombinationOfFilterAndMap {
	
	
	int empId;
	String empName;
	double empSalary;
	
	
	CombinationOfFilterAndMap(int id,String name,double empsal)
	{
		empId=id;
		empName=name;
		empSalary=empsal;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<CombinationOfFilterAndMap> obj=new ArrayList<>();
		List<Double> store=new ArrayList<>();
		
		obj.add(new CombinationOfFilterAndMap(342,"Alex",34000));
		obj.add(new CombinationOfFilterAndMap(111,"Bran",56000));
		obj.add(new CombinationOfFilterAndMap(534,"Brad",39000));
		obj.add(new CombinationOfFilterAndMap(121,"Johnson",24000));
		obj.add(new CombinationOfFilterAndMap(984,"Anderson",14000));
		
		store=obj.stream().filter(p->p.empSalary>26000).map(e->e.empSalary).collect(Collectors.toList());
		System.out.println(store);
		
		System.out.println(store);
		

	}

}
