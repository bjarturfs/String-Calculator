package bjartur.stringcalculator;


public class Calculator {

	public static int add(String text){
			if(text.equals("")){
					return 0;
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

}
