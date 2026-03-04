package E_Commerce;

import java.util.HashMap;
import java.util.Map;

public class shopManagment {
	HashMap<Products,Integer> map = new HashMap<>();
	
	public void addProduct(Products p,int quantity) {
		map.put(p, quantity);
	}
	
	public void updateProduct(Products p,int quantity) {
		if(map.containsKey(p)) {
			map.put(p, quantity);
		}
	}
	
	public void fetchAll() {
		for(Map.Entry<Products, Integer> entry : map.entrySet()) {
			Products p = entry.getKey();
			int q = entry.getValue();
			System.out.println("Produts name : "+p.name+" price : "+p.price+" quantity : "+q);
		}
	}
	
	public void calculateTotal() {
		int total = 0;
		
		for(Map.Entry<Products, Integer> entry : map.entrySet()) {
			Products p = entry.getKey();
			int q = entry.getValue();
			total += p.price * q;
		}
		
		System.out.println("total price : "+total);
	}
	
	public static void main(String[] args) {
		
		shopManagment sm = new shopManagment();
		sm.addProduct(new Products("laptop", 40000), 2);
		sm.addProduct(new Products("phone", 25000), 3);
		sm.updateProduct(new Products("laptop", 50000), 3);
		sm.fetchAll();
		sm.calculateTotal();
	}
}
