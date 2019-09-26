package main;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Empty {
	public static void main(String[] args) {

		try(FileInputStream fi = new FileInputStream("try.txt")){
			ObjectInputStream oi = new ObjectInputStream(fi);
			
			Pokedex[] px = (Pokedex[])oi.readObject();
			ArrayList<Pokedex> pxs = (ArrayList<Pokedex>)oi.readObject();
			
			for(Pokedex poke : px) {
				System.out.println(poke);
			}
			
			for(Pokedex poke : pxs) {
				System.out.println(poke);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}