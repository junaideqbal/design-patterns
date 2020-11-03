
public class Car {
	String color;
	String price;
	String model;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Car(String color, String price, String model) {
		super();
		this.color = color;
		this.price = price;
		this.model = model;
	}
	@Override
	public String toString() {
		return "I have a Car [color=" + color + ", price=" + price + ", model=" + model + "]";
	}
	
}
