import static java.lang.System.*;
import java.util.*;

public class Main {
  public static void main(String [] args) {
    Scanner input = new Scanner(System.in);
    
    out.println("How many times would you like to play this game?");
    
    int times = input.nextInt();
    
    while(times-- > 0) {
     
    out.println("\nPlease make a guess between 1 - 999");
    
    double computerGuess = Math.random() * 1000;
    computerGuess = Math.round(computerGuess);
    
    out.println("\nWant to quit? Enter 0(zero) to quit");
    
    out.println("\nWhat is your guess?");
    double humanGuess = input.nextDouble();

    if(humanGuess == 0)
      break;  
    double howFarTheUserWasOff = Math.abs(humanGuess - computerGuess);
    
    if(humanGuess == computerGuess)
      out.println("You win");
    else 
      out.println("\nYou were " + howFarTheUserWasOff + " away from the correct answer " + "\nCorrect answer : " + computerGuess);
    out.println("\nlives left : " + times);
    } 
  }
}


