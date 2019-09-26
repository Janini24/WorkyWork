package main;
import java.io.Serializable;

public class Pokedex implements Serializable{
	
	
	String itemName;
	int price;
	
	
	public Pokedex(String itemName, int price) {
		this.itemName = itemName;
		this.price = price;
	}
	
	public String toString() {
		return itemName + " $" + price;
	}
}