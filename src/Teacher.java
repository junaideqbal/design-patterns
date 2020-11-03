
public class Teacher implements Person {
	
	private String name;
	private String cnic;
	private String address;
	private Car car;
	
	public Teacher(String name, String cnic, String address) {
		super();
		this.name = name;
		this.cnic = cnic;
		this.address = address;
		car = new Car("Red", "200000", "2018");
	}
	
	@Override
	public void name(String name) {
		this.name = name;
	}

	@Override
	public void cnic(String cnic) {
		this.cnic = cnic;
	}

	@Override
	public void address(String address) {
		this.address = address;
	}
	
	public void lunchTime() {
		Food food = new Food("Salad", 20);
		System.out.println(car.toString());
		System.out.println("I'm going for a lunch. The "+food.toString());
	}

	@Override
	public String toString() {
		return "Teacher Detail [name=" + name + ", cnic=" + cnic + ", address=" + address + "]";
	}
	
	
}
