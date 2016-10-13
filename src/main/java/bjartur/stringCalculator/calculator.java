package bjartur.stringcalculator;


public class Calculator {

	public static int add(String text){
			if(text.equals(""))
					return 0;
			else if(text.contains(",")){
					String [] numbers = text.split(",");
					return (toint(numbers[0]) + toint(numbers[1]));
			}
			else
					return 1;
	}

	private static int toint(String text){
		return Integer.parseInt(text);
	}

}
