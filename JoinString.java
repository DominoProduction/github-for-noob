public class JoinString{
	public static void main(String[] args){
		
		String firstString = "Many ";
		String secondString = "hands ";
		String thirdString = "make light work";
		
		String myString;		//variable to store results
		
		//join three strings and store the results
		myString = firstString + secondString + thirdString;
		System.out.println(myString);
		
		//convert an integer to String and join with two other strings
		int numHands = 99;
		myString = numHands + " " + secondString + thirdString;
		System.out.println(myString);
		
		//Combining a string and integers
		
		myString = "fifty-five is " + 5 + 5;
		System.out.println(myString);
		
		//combining integers and a string
		myString = 5 + 5 + " is ten";
		System.out.println(myString);
	}
}