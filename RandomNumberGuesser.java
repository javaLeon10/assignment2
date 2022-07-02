

import java.util.Scanner;

public class RandomNumberGuesser {
	public static void main(String[] args){
		
System.out.println("The program RandomNumberGuesser implements a guessing game based on a random number generator. The user attempts to guess the number between 1 and 100. The random number generator and control of user input are implemented in the class RNG.java. The program allows for infinite number of trials and runs, if the user desires.\r\n");

boolean play;
int numGuesses;	
int lowGuess;
int highGuess = 100;
int nextGuess;
int curGuess;
boolean stillplay = true;

while (stillplay) {
numGuesses = 0;
lowGuess = 0;
highGuess = 100;
play = true;
	
RNG ran = new RNG();

ran.resetCount();

int ourNumber = ran.rand();
String response;

//System.out.println("Our random number is "+ourNumber);

Scanner kbd = new Scanner(System.in);
do {
	
	do {
System.out.print("Enter your first guess ");
nextGuess = kbd.nextInt();
kbd.nextLine();

 } while (ran.inputValidation(nextGuess, lowGuess, highGuess) == false);
	 
numGuesses++;


if (nextGuess == ourNumber) {
	System.out.println("Number of guesses is "+numGuesses);
System.out.println("Congratulations, you guessed correctly\n");
System.out.println("Try again (yes or no) ");
response = kbd.nextLine();
// if (response.compareTo("no") == 0) System.out.println("Good guess");
if (response.compareTo("no") == 0) play = false;
if (response.compareTo("yes") == 0) play = true;
} else {
	break;
}

	}while (play == true);
// if no first lucky guess happened


do {
	
	if (play == false) break;
	
System.out.println("Number of guesses is "+numGuesses);

if (ourNumber < nextGuess) {
	System.out.println("Your guess is too high");
	highGuess = nextGuess;
}

if (ourNumber > nextGuess) {
	System.out.println("Your guess is too low");
	lowGuess = nextGuess;
}

System.out.println ("Enter your next guess between "+lowGuess+" and "+highGuess);

do {
nextGuess = kbd.nextInt();
kbd.nextLine();
} while (ran.inputValidation(nextGuess, lowGuess, highGuess)== false);

numGuesses++;
if (nextGuess == ourNumber) {
	System.out.println("Congratulations, you guessed correctly\n");
	System.out.println("Try again (yes or no) ");
	response = kbd.nextLine();
	play = false;
	// if (response.compareTo("no") == 0) System.out.println("Good guess");
	if (response.compareTo("no") == 0) stillplay = false;
	if (response.compareTo("yes") == 0) stillplay = true;
	} 

} while  (play);

}
System.out.println("Leon Gabrielian, Class CMSC203");	
System.out.print("* Class: CMSC203 \r\n"
		+ " * Instructor: Professor Elvazi\r\n"
		+ " * Description: The program RandomNumberGuesser implements a guessing game based on a random number generator. The user attempts to guess the number between 1 and 100. The random number generator and control of user input are implemented in the class RNG.java. The program allows for infinite number of trials and runs, if the user desires.\r\n"

		+ " * Due: 7/1/2022\r\n"
		+ " * Platform/compiler: Windows,java version \"18.0.1.1\" 2022-04-22\r\n"
		+ "Java(TM) SE Runtime Environment (build 18.0.1.1+2-6)\r\n"
		+ "Java HotSpot(TM) 64-Bit Server VM (build 18.0.1.1+2-6, mixed mode, sharing)\r\n"
		+ " * I pledge that I have completed the programming assignment independently.\r\n"
		+ "   I have not copied the code from a student or any source.\r\n"
		+ "   I have not given my code to any student.\r\n"
		+ "   Print your Name here: Leon Gabrielian "); 

}
}
