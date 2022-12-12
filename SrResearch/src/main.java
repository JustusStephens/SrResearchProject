import java.util.Scanner;

/*
Justus Stephens
Senior Research Project 2022

The main class serves as an interface and will simulate a desired battle
by calling the battle function for the match-up specified via the user.
All input and output is console based (later, output will be handled via txt or something easily manipulated for data analyzing)
*/

public class main 
{
	public static void main(String[] args) 
	{
		System.out.println("Please Enter a Number 1-3 To Simulate a Battle "
				+ "\n1: Bulbasuar vs. Charmander "
				+ "\n2: Squirtle vs Bulbasuar "
				+ "\n3: Charmander vs. Squirtle" );
		
	    boolean valid = false;
		while(valid == false)
		{
			 Scanner getNum = new Scanner (System.in);
			 System.out.println("\nYour Number ->");
			 String line = getNum.nextLine();
			 int number=Integer.valueOf(line);
			 
			 System.out.println(number);
			 
			 if(number == 1)
			 {
				 valid = true;
				 System.out.println("Send to b vs c");
				 prepareBattle.battleStats(number);
			 }
			 else if(number == 2)
			 {
				 valid = true;
				 System.out.println("Send to s vs b");
				 prepareBattle.battleStats(number);
			 }
			 else if(number == 3)
			 {
				 valid = true;
				 System.out.println("Send to c vs s");
				 prepareBattle.battleStats(number);
			 }
			 else
			 {
				 System.out.println("Invalid number try again");
			 }
		}
	}
}
