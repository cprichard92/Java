package dayFour;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) {
//		//Save
//		Hero hero = new Hero ("Handsome Jack",0,98562,4525,96,"Normal", "Hyperion Sword");
//		new Serialization().serialize(hero);
//		System.err.println("Complete");
		
		//Load
		Hero hero = new Serialization().deserialize("Handsome Jack");
		System.out.println(hero);
	}
	

	public Hero deserialize(String heroName){
		try(ObjectInputStream input = 
				new ObjectInputStream(
						new FileInputStream(
								new File( heroName +".ser")))   ){
			return (Hero) input.readObject();
		}catch(FileNotFoundException e){
			System.out.println("No such hero!");
			return null;
		}catch(Exception e){
			e.printStackTrace();
			return null;
		}
	}
	
	public void serialize (Hero obj){
		try(ObjectOutputStream output = 
				 new ObjectOutputStream(
						 new FileOutputStream(
								 new File ( obj.getName()+ ".ser" ))) ){
		output.writeObject(obj);
	}catch (Exception e){
		e.printStackTrace();
	}
	}
}
