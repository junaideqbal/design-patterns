package flyweight_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FlyWeightShoes {
	
	ArrayList<Shoes> shoes = new ArrayList<Shoes>();
	
	public FlyWeightShoes() {
	}
	
	public Shoes getShoes(String name, Integer laces, String color) {
		for (Shoes shoe : shoes) {
			if (shoe.getName().compareTo(name) == 0 && shoe.getColor().compareTo(color) == 0 && shoe.getLaces() == laces) {
				
				System.out.println("This is the same shoe which is already in the collection size is : " +shoes.size());
				return shoe;
			}
		}
		Shoes shoe = new Shoes(name, laces, color);
		shoes.add(shoe);
		System.out.println("New Shoe is added new Shoes collection size is :" +shoes.size());
		return shoe;
	}
	
	
}
