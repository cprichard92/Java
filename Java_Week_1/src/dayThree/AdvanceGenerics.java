package dayThree;

import java.util.ArrayList;
import java.util.List;

public class AdvanceGenerics {
	
	public static void main(String[] args) {
		jar<pickle>  jar = new jar<>();
		jar.add(new pickle());
		
		
		
//		jar<orange> box = new jar<>();
//		box.add(new orange());
//		
//		jar<veggie> jar2 = new jar<>();
//		jar2.add(new veggie());
		
		//jar<ratpoison> eww = new jar<>();
		//eww.add(new ratpoison()); // doesn't extend to food so will not work
	}
}

class jar<T extends pickle>{
	List<T> values = new ArrayList<>();
	public T eat(){
		return values.get((int) (Math.random()*100));
	}
	public void add(T object){
		values.add(object);
	}
}

class food{}

class veggie extends food{}
class pickle extends veggie{}
class dillpick extends pickle{}

class fruit extends food{}
class orange extends fruit{}

class ratpoison{}