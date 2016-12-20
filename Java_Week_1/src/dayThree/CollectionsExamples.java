package dayThree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class CollectionsExamples {
	
	public static void main(String[] args) {
		//Trainee TraineeNameComparator reference = new Trainee().new TraineeNameComparator();
		doList();
		doMap();
	}
	
	public static void doMap(){
		
		Map<String, Trainee> map = new HashMap<>();
		map.put("Wigwam", new Trainee(1, "Will"));
		map.put("Patch", new Trainee(2, "Patrick"));
		map.put("Cp", new Trainee(3, "Chris"));
		
		Trainee cp = map.get("Cp");
		System.out.println(cp);
		
		for(String key : map.keySet()){
			System.out.println(map.get(key).getName()+"'s nickname is: " + key);
		}
		for(Trainee value : map.values()){}
	}

	
	public static void doList(){
		List <Trainee> trainees = new ArrayList<>();
		trainees.add(new Trainee(3, "Gabe"));
		trainees.add(new Trainee(1, "Will"));
		trainees.add(new Trainee(2, "Greg"));
		System.out.println(trainees.get(0));
		trainees.remove(0);
		System.out.println(trainees.get(0));
		
		Collections.sort(trainees, new Trainee().new TraineeNameComparator());
		//Collections.shuffle(trainees);		
		for(Trainee temp : trainees){
			System.out.println(temp);	
			}
	}
}

class Trainee implements Comparable<Trainee>{
	private int id;
	private String name;
	
	class TraineeNameComparator implements Comparator<Trainee>{
		public int compare(Trainee one, Trainee other){
			return one.name.compareTo(other.name);
		}
	};
	
	public int getId(){
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Trainee(){
		super();
	}
	
	public Trainee(int id, String name){
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString(){
			return "Trainee [id=" + id + ", name=" + name + "]";
	}
	
	public int compareTo(Trainee arg){
		//return0 if the natural order is the same
		// Return positive number if it comes after
		// Returns negative number if it comes before
		return this.id - arg.id;
	}
}