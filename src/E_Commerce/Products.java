package E_Commerce;

public class Products {
	String name;
	int price;
	
	public Products(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}

	@Override
	public String toString() {
		return "name=" + name + ", price=" + price;
	}
	
	
	
}
