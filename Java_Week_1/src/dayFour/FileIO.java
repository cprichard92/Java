package dayFour;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class LineReading{
	
	public void writeHero(Hero hero, String filename) throws FileNotFoundException{
		PrintWriter writer = 
				new PrintWriter(
						new FileOutputStream(
								new File(filename), true));
		StringBuilder heroString = new StringBuilder();
		heroString.append(hero.getName()).append(",")
						.append(hero.getHp()).append(",")
						.append(hero.getMp()).append(",")
						.append(hero.getXp()).append(",")
						.append(hero.getLevel()).append(",")
						.append(hero.getClassification()).append(",")
						.append(hero.getWeapon()).append("\n");
		writer.println(heroString.toString());
		writer.close();
	}
	
	public List<Hero> readHeros(String filename) throws FileNotFoundException{
		//File file = new File (filename); // doesn't create a file
		BufferedReader reader = 						
				new BufferedReader(						// Line-oriented reader
						new FileReader(					// character reader
								new File (filename)));// file itself
		String line;  //Stores the line output
		List<Hero>  heros = new ArrayList<Hero>();
		try {
			while ((line = reader.readLine()) != null){ // evaluate while line != null
				if (line.charAt(0)== '#'){
					continue;
				}
				// add to the list
				heros.add(paraseHero(line));
			}	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return heros;
	}
	
	private Hero paraseHero(String line){
		// if line is not null starts with # , skip it
		if(line.charAt(0) == '#');{
			
		}
		// Tokenize the strong with the , delimiter 
		Scanner scanner = new Scanner(line);
		scanner.useDelimiter(",");
		//#name,hp,mp,xp,level,classification,weapon
		// take the properties and pass it to the hero constructor
		Hero hero = new // perfect world where no puts a string for an int
						Hero (scanner.next().trim(),
								scanner.nextInt(),
								scanner.nextInt(),
								scanner.nextInt(),
								scanner.nextInt(),
								scanner.next().trim(),
								scanner.next().trim()
							);
		scanner.close();
		return hero;
	}
}

public class FileIO {

	public static void main(String[] args) {
		//Writing
		 Hero hero = 
				 new Hero("Axton", 0, 8596, 75, 85, "Soldier", "Shotgun");
				 LineReading example = new LineReading();
		try{
			example.writeHero(hero, "heros");
		}catch (FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("Complete");
		
		
//		//Reading
//		LineReading example = new LineReading();
//		List<Hero>heroList = null;
//		try{
//			heroList = example.readHeros("heros");
//		}catch(FileNotFoundException e){
//			System.out.println("[Log] Your fie doesn't exsist");
//		}
//		if(heroList != null)
//			for(Hero temp : heroList)
//				System.out.println(temp);
	}
}
