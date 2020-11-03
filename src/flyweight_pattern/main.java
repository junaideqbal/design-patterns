package flyweight_pattern;

public class main {

	public static void main(String[] args) {
		FlyWeightShoes fly = new FlyWeightShoes();
		fly.getShoes("Adidas", 3, "Red");
		fly.getShoes("Adidaas", 3, "Red");
		fly.getShoes("Adidas", 3, "Red");
		fly.getShoes("Adidas", 3, "Red1");
		fly.getShoes("Adidas", 3, "Red");
	}

}
