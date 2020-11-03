package flyweight_pattern;

public class Shoes {
	private String name;
	private Integer laces;
	private String color;
	
	public Shoes(String name, Integer laces, String color) {
		super();
		this.name = name;
		this.laces = laces;
		this.color = color;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getLaces() {
		return laces;
	}
	public void setLaces(Integer laces) {
		this.laces = laces;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
