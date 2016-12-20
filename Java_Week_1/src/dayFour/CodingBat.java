package dayFour;

public class CodingBat {
	/**The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
	 * We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.
	 * @param nums
	 * @return
	 */
	
	/**Given an array of ints, return true if 6 appears as either the first or last element in the array.
	 * The array will be length 1 or more.
	 * @return
	 */
	public boolean sleepIn(boolean weekday, boolean vacation) {
		
		if(weekday == false || vacation == true){
			return true;
		}else{
		  return false;
		}
	}

	public boolean firstLast6(int[] nums) {
		if(nums[0] == 6 || nums[nums.length - 1] == 6){
			return true;
		}else{
			return false;
		}
	}

	/*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
	 * We are in trouble if they are both smiling or if neither of them is smiling.
	 *  Return true if we are in trouble.
	 */
	public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
		if(aSmile == true && bSmile == true){
			return true;
		}
		if( aSmile == false && bSmile == false){
			return true;
		}else return false;
	}
	
	/**
	 * Given two int values, return their sum. Unless the two values are the same, then return double their sum.
	 * @param a
	 * @param b
	 * @return
	 */
	public int sumDouble(int a, int b) {
		if(a==b){
			int c = (a+b) * 2;
			return c;
		}
		else return a+b;
	}
	
	/**Given an int n, return the absolute difference between n and 21, except return double the absolute difference if n is over 21.
		diff21(19)  2
		diff21(10)  11
		diff21(21)  0
	*/
	public int diff21(int n) {
		int total;
		if(n<=21){
			total = 21 - n;
			return total;
		}else{
			total = (n-21) * 2;
			return total;
		}  
	}

	/**We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
	 * We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.
		parrotTrouble(true, 6)  true
		parrotTrouble(true, 7)  false
		parrotTrouble(false, 6) false
	*/
	public boolean parrotTrouble(boolean talking, int hour) {
		  if(talking == true && (hour<7 || hour>20)){
			  return true;
		  }else return false;
	}	
	
	/*
	 * Given 2 ints, a and b, return true if one if them is 10 or if their sum is 10.
		makes10(9, 10)  true
		makes10(9, 9)  false
		makes10(1, 9)  true
	 */
	public boolean makes10(int a, int b) {
		if( (a==10 || b == 10) ) {
			return true;}
		else if( a+b==10)
			return true;
			else return false;
		}
			
	}