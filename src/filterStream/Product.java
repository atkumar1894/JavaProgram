package filterStream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Product {

	int id;
	String name;
	double price;

	public Product(int id,String name,double price)
	{
		this.id=id;
		this.name=name;
		this.price=price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Product> pro=new ArrayList<>();

		//List<Product> costly=new ArrayList<>();

		pro.add(new Product(1,"Samsung",45000));
		pro.add(new Product(2,"Dell",75000));
		pro.add(new Product(3,"Hp",65000));
		pro.add(new Product(1,"Apple",145000));
		pro.add(new Product(1,"Asus",25000));
		pro.add(new Product(1,"Avita",18000));

		pro.stream().filter(s->s.price>30000).forEach(paisa->System.out.println(paisa.price));
		
	}

}
