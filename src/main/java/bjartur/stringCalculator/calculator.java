package bjartur.stringcalculator;

import java.util.*;

public class Calculator {

	public static int add(String text){
			if(text.equals("")){
					return 0;
			}

			else if(text.contains("-")){
					String neg = findNegative(text);
					throw new IllegalArgumentException("Negatives not allowed: " + neg);

			}

			else if(text.contains(",") || text.contains("\n")){
					return sum(splitNumbers(text));
			}
			else
					return 1;
	}

	private static int toint(String text){
		return Integer.parseInt(text);
	}
  private static String[] splitNumbers(String numbers){
		numbers = numbers.replaceAll("[\\\n]", ",");
		return numbers.split(",");
	}

	private static  int sum(String[] numbers){
		int total = 0;
		for(String number : numbers){
			total += toint(number);
		}
		return total;
	}

	private static String findNegative(String text){
				String minus = "";
				String[] findMinus = splitNumbers(text);
				for(String n : findMinus){
					if(n.charAt(0) == '-'){
						minus += n;
						minus += ",";
					}
				}
				minus = minus.substring(0,minus.length() -1);
				return minus;
	}

}
