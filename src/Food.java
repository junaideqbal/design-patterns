
public class Food {
	
	String name;
	Integer calories;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getCalories() {
		return calories;
	}
	public void setCalories(Integer calories) {
		this.calories = calories;
	}
	public Food(String name, Integer calories) {
		super();
		this.name = name;
		this.calories = calories;
	}
	
	@Override
	public String toString() {
		return "Foodname is " + name + " and its calories are " + calories + "]";
	}

}
