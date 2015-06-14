package main;


public class CheckParser {
	String[] numbers = {""," one"," two"," three"," four"," five"," six"," seven"," eight"," nine"," ten"," eleven"," twelve"," thirteen"," fourteen"," fifteen"," sixteen"," seventeen"," eighteen"," nineteen"};
	String[] tens = {""," ten"," twenty"," thirty"," forty"," fifty"," sixty"," seventy"," eighty"," ninety"};
	String[] names = {"",""," thousand"," million"," billion", "trillion"};
	
	public String parseAmount(double amount) {
		String aux = "";
		String cents = parseCents(amount);
		if((int)amount == 0 && !cents.equals(""))
			return cents + " dollars";
		if((int)amount > 0 && !cents.equals(""))
			aux = " and ";
		return parseDollars((long)amount) + aux + cents + " dollars";
	}
	
	public String parseCents(double amount){
		String cents = String.valueOf(amount).split("\\.")[1].substring(0, 2);
		
		if(!cents.equals("0"))
			return cents + "/100";
		return "";
	}
	
	public String parseDollars(long amount){
		long x = amount;
		String numberString = "";
		int length = String.valueOf(amount).length();
		int mod = length % 3;
		int parts = length / 3 + (mod == 0 ? 0 : 1);
		int[] subParts = new int[parts];
		for(int i = parts - 1; i >= 0; i--){
			subParts[i] = (int) (amount % 1000);
			amount /= 1000;
		}
		for(int i = 0, n = parts; i < parts; i++){
			numberString += parseUnderThousand(subParts[i]) + names[n];
			n--;
		}
				
		return numberString.trim();
	}
	
	public String parseUnderThousand(int amount){
		String aux = "";
		if(amount == 0)
			return "zero";
		if(amount % 100 < 20){
			aux = numbers[amount % 100];
			amount /= 100;
		} else {
			aux = numbers[amount % 10];
			amount /= 10;
			
			aux = tens[amount % 10] + aux;
			amount /= 10;			
		}
		if(amount == 0)
			return aux;
		return numbers[amount] + " hundred" + aux;
	}
}
