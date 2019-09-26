package main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class bulbasaur{
	public static void main(String[] args) {

		Pokedex[] px = {new Pokedex("Repel", 300), new Pokedex("Pokeball", 200), new Pokedex("Potion", 100)};
		ArrayList<Pokedex> pxs = new ArrayList<Pokedex>(Arrays.asList(px));
		
		try(FileOutputStream fo = new FileOutputStream("try.txt")){
			ObjectOutputStream oo = new ObjectOutputStream(fo);
			
			oo.writeObject(px);
			oo.writeObject(pxs);
			
			oo.close();
			
			//commit changes
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}