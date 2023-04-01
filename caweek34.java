package week34ca;

import java.util.Arrays;

public class caweek34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
		
		System.out.println("Create an array of int and subtract the first element from the last.");
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		/*
		 * (a) Programmatically subtract the value of the first element in the array from
		 * the value in the last element of the array (i.e. do not use ages[7] in your
		 * code).
		 */
		
		int difOne = ages[ages.length-1] - ages[0];
		
		// Print the result to the console.
		
		System.out.println(difOne);
		
		// (b) Add a new age to your array and repeat the step above to ensure it is dynamic (works for
		// arrays of different lengths).
		
		System.out.println("Add one more age to the end of the array and repeat the step above.");
		
		ages = Arrays.copyOf(ages, ages.length +1);
		ages[ages.length-1] = 33;
		
		int difTwo = ages[ages.length-1] - ages[0];
				
		System.out.println(difTwo);
		
		// (c) Use a loop to iterate through the array and calculate the average age. Print the result to the console.
		
		System.out.println("Loop through the array and calculate average age.");
		
		int sumAges = 0;
		
		for (int age : ages) {
			sumAges += age;
		}
		
		double avgAge = sumAges/ages.length;
		
		System.out.println("The average age is: " + avgAge);
		
		System.out.println("---------------------------------------");
		
		// 2. Create an array of String called names that contains the following values: 
		// “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
		
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		
		// (a) Use a loop to iterate through the array and calculate the average number of letters per name.
		// Print the result to the console.

		int sumLetters = 0;
		
		for (String name : names) {
			sumLetters += name.length();
		}
		
		double avgLetters = sumLetters/names.length;
		
		System.out.println("The average number of letters per name is: " + avgLetters);
		
		// (b) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and 
		// print the result to the console.

		
		StringBuilder concatNames = new StringBuilder();
		
		concatNames.append(names[0]);
		
		for (String name : names) {
			concatNames.append(", ");
			concatNames.append(name);			
		}
		
		System.out.println("Concatenated names from the string array in a string:");
		System.out.println(concatNames.toString());
		System.out.println("---------------------------------------");
		
		
		// 3. How do you access the last element of any array?
		
		/*
		 * To do so, you need to use the last index in the array. Normally you may not
		 * know the length of an array, so you use the arrays property called length,
		 * and subtract 1 from it (since the length of an array is not the same as the
		 * highest index, due to the fact that the index starts at 0.)
		 */
		
		//The following are two examples using the length property on two arrays of different length and type.
		
		System.out.println("Printing the last elements of two different arrays:");
		
		System.out.println(ages[ages.length-1]);
		
		System.out.println(names[names.length-1]);
		
		System.out.println("---------------------------------------");
		
		// 4. How do you access the first element of any array?
		
		// The first element is easier because it always be zero. The first index of any array is always zero. 
		
		System.out.println("Printing the first elements of two different arrays:");
		
		System.out.println(ages[0]);

		System.out.println(names[0]);
		
		// Again, it works with both arrays regardless of their type and length.
		
		System.out.println("---------------------------------------");
		
		// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the 
		// length of each name to the nameLengths array.
		
		int [] nameLengths = new int[names.length];
		int i = 0;
		for (String name : names) {
			nameLengths[i] = name.length();
			i ++;
			
		}
		
		System.out.println("The the lengths in the nameLengths array are: ");
		
		for (int num : nameLengths) {
			System.out.println(num);
		}
		
		System.out.println("---------------------------------------");
		
		/*
		 * 6. Write a loop to iterate over the nameLengths array and calculate the sum of
		 * all the elements in the array. Print the result to the console.
		 */
		
		int sumLengths = 0;
		
		for (int len : nameLengths) {
			sumLengths += len;
		}
		
		System.out.println("The sum of all the lengths is: " + sumLengths);
		
		System.out.println("---------------------------------------");
		
		/*
		 * 7. Write a method that takes a String, word, and an int, n, as arguments and
		 * returns the word concatenated to itself n number of times. (i.e. if I pass in
		 * “Hello” and 3, I expect the method to return “HelloHelloHello”).
		 */
		
		System.out.println("Testing my method that concatenates strings:");
		System.out.println(wordConcat("Java", 5));
		
		System.out.println("---------------------------------------");
		
		/*
		 * 8. Write a method that takes two Strings, firstName and lastName, and returns
		 * a full name (the full name should be the first and the last name as a String
		 * separated by a space).
		 */
		
		System.out.println("Trying my method that takes a first name and a last name and returns the full name.");
		System.out.println(fullName("Alan", "Turing"));
		
		System.out.println("---------------------------------------");
		
		/*
		 * 9. Write a method that takes an array of int and returns true if the sum of
		 * all the ints in the array is greater than 100.
		 */
		
		System.out.println("Testing if method can tell if the sum of the ints in an array are greater than 100.");
		System.out.println("The sum of the numbers in the agest array is greater than 100. " + isGreater(ages));
		int[] primeNums = {2, 3, 5, 7, 11, 13, 17, 19};
		System.out.println("The sum of the first eight prime numbers is greater than 100. " + isGreater(primeNums));
		
		System.out.println("---------------------------------------");
		
		/*
		 * 10. Write a method that takes an array of double and returns the average of
		 * all the elements in the array.
		 */
		
		double[] decimalNums= {0.23, 21.47, 93.05, 71.82, 52.55, 8.84, 4.40, 30.89};
		
		System.out.println("Testing method that returns average of an array of doubles.");
		System.out.println(String.format("%.2f", avgElems(decimalNums)));
		
		System.out.println("---------------------------------------");
		
		/*
		 * 11. Write a method that takes two arrays of double and returns true if the
		 * average of the elements in the first array is greater than the average of the
		 * elements in the second array.
		 */
		
		double[] doubleNums = {63.35, 73.44, 27.45, 95.77, 4.74, 54.41, 19.70, 27.45};
		
		double [] numArr = {91.61, 5.14, 111.67, 18.73, 35.38, 74.29, 50.82, 14.62};
		
		System.out.println("Testing method that checks for highest average.");
		System.out.println("The average of the decimalNums array is greater than the average of doubleNums array." 
		+ avgGreater(decimalNums, doubleNums));
		System.out.println("The average of the doubleNums array is greater than the average of numArr array." 
				+ avgGreater(numArr, doubleNums));
		
		System.out.println("---------------------------------------");
		
		/*
		 * 12. Write a method called willBuyDrink that takes a boolean isHotOutside, and
		 * a double moneyInPocket, and returns true if it is hot outside and if
		 * moneyInPocket is greater than 10.50.
		 */
		
		System.out.println("Testing if I should buy a drink.");
		System.out.println("It's hot outside and I have $12.15 in my pocket. " + willBuyDrink(true, 12.15));
		System.out.println("It's hot outside and I have $5.10 in my pocket. " + willBuyDrink(true, 5.10));
		System.out.println("It's cold outside and I have $20.50 in my pocket. " + willBuyDrink(false, 20.50));
		
		System.out.println("---------------------------------------");
		
		/*
		 * 13. Create a method of your own that solves a problem. In comments, write
		 * what the method does and why you created it.
		 */
		
		System.out.println("Testing the method I created to calculate interest rates. ");
		System.out.println("For a loan of $785.31, with an interest rate of 11.98% the total interest paid in 5 years will be:");
		System.out.println("$" + totalInterest(785.31, 11.98, 5));
		System.out.println("The same loan paid in 3 years would have a total interest of:");
		System.out.println("$" + totalInterest(785.31, 11.98, 3));
		System.out.println("The same loan paind in 1 year would have a total interest of:");
		System.out.println("$" + totalInterest(785., 11.98, 1));
		
		System.out.println("Different loan terms test: ");
		System.out.println("For a loan of $80.90, with an interest rate of 3.93% the total interest paid in 5 years will be:");
		System.out.println("$" + totalInterest(80.90, 3.93, 5));
		System.out.println("The same loan paid in 3 years would have a total interest of:");
		System.out.println("$" + totalInterest(80.90, 3.93, 3));
		System.out.println("The same loan paind in 1 year would have a total interest of:");
		System.out.println("$" + totalInterest(80.90, 3.93, 1));
		
		
	}
	
	// # 13 Method
	
	/*
	 * This method calculates how much interest one will accrue from a loan,
	 * depending on how long one takes to pay it off. The method takes in a double
	 * loan, which is the total amount of the loan, a double rate which is the
	 * interest rate of the loan. And an int which is the years taken to pay back
	 * the loan. It returns a formatted string with a precision of two decimal places of the total interest. 
	 * I created it so one can calculate the rates and be able to find the
	 * best time frame in which to pay back a loan.
	 */
	
	public static String totalInterest (double loan, double rate, int years) {
		
		double totalInterest = loan * (rate/100) * years;
		
		return (String.format("%.2f", totalInterest));
		
	}
	
	// # 12 Method
	
	public static boolean willBuyDrink (boolean isHotOutside, double moneyInPocket) {
		boolean buyDrink = false;
		
		if (isHotOutside && moneyInPocket > 10.50) {
			buyDrink = true;			
		}
		
		return buyDrink;
	}
	
	// #11 Method
	
	public static boolean avgGreater(double [] arrOne, double [] arrTwo) {
		double avgOne = 0;
		double avgTwo = 0;
		
		for (double num : arrOne) {
			avgOne += num;
		}
		
		avgOne /= arrOne.length;
		
		for (double num : arrTwo) {
			avgTwo += num;
		}
		
		avgTwo /= arrTwo.length;
		
		return avgOne > avgTwo;
	}
	
	// #10 Method
	
	public static double avgElems (double [] nums) {
		double avgNums = 0; 
		
		for (double num : nums) {
			avgNums += num;
		}
		return avgNums/nums.length;
	}
	
	// #9 Method
	
	public static boolean isGreater (int[] nums) {
		int sumNums = 0;
		
		for (int num : nums) {
			sumNums += num;
		}
		
		return sumNums>100;
	}
	
	
	// #8 Method
	
	public static String fullName (String firstName, String lastName) {
		StringBuilder concatName = new StringBuilder();
		
		concatName.append(firstName);
		concatName.append(" ");
		concatName.append(lastName);
		
		String fullName = concatName.toString();
		
		return fullName;
		
	}

	
	// #7 Method. Concatenates a string n number of times.
	
	public static String wordConcat (String word, int n) {
		StringBuilder repeatW = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			repeatW.append(word);
		}
		String newString = repeatW.toString();
		
		return newString;
	}
	
	
	
	
	
}
