package utils;

import java.util.Random;

public class Randomizer {
	private static Random r = new Random();
	
	public static double getDouble(double min, double max){
		double aux = r.nextDouble() * max;
		return aux > min ? aux : aux + min;
	}

	public static int getInt(int min, int max) {
		return min + r.nextInt(max - min);
	}
}
