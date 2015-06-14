package main;

import java.util.Random;

public class Main {
	
	static long randomLong(long val, long maxVal){
		if(val < 0)
			val *= -1;		
		if(val > maxVal)
			return maxVal;
		return val;
	}

	public static void main(String[] args) {
		CheckParser parser = new CheckParser();
		Random r = new Random();
		double sum;
		
		for(int i = 0; i < 5; i++){
			sum = r.nextInt(9999999) + r.nextDouble();
			System.out.println(sum + " = " + parser.parseAmount(sum));
		}
		
	}

}
