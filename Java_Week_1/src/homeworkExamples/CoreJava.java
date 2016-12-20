package homeworkExamples;

public class CoreJava {
	
	public static void main(String[] args) {
	
		int a = 78;
		double b = 930;
		short c = 2;
		mathmatician answer = new mathmatician();
		
		answer.toAdd(a,b);
		answer.toSubtract(a, b);
		answer.toDivide(a, b);
		answer.toMultiple(a, b);
		}
	}

class mathmatician{
	
	long c;
		
	public void toAdd(int a, double b){
		c=(long) (a+b);
		System.out.println(c);}
	public void toSubtract(int a, double b){
		c=(long) (a-b);
		System.out.println(c);}
	public void toDivide(int a, double b){
		c=(long) (b/a);
		System.out.println(c);}
	public void toMultiple(int a, double b){
		c=(long) (a*b);
		System.out.println(c);;
		}
	}


