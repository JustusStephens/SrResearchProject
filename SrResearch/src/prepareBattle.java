import java.util.Scanner;

/*
 * battle simulator receives what battle to simulate
 * then it provides the base statistics to be sent to the battle
 * each pokemon will have its data defined in array
 * this data contains: all 4 moves, followed by their accuracies, the attack, defense, speed and health statistics
 * 
 * Array[0-3] : the moves
 * Array[4-7] : the accuracies (move 1s accuracy is Array[4], move 2's in Array[5], and so on)
 * Array[8-11] : the base stat values
 * 
 * battle 1: bulb v char
 * battle 2: squirt v bulb
 * battle 3: char v squirt
 */

public class prepareBattle extends main
{

	static double[] Bulb = {30,45,80,135,.80,.65,.12,.05,9,9,9,19};    //{move1 power, move2 power, 3, 4, move 1 accuracy, move 2 acc, 3 , 4, attack, defense, speed, hp
	static double[] Char = {30,40,70,120,.80,.65,.20,.05,10,9,11,18};
	static double[] Squirt = {30,40,75,130,.80,.65,.15,.05,9,11,9,19};
	
	public static void battleStats(int matchup) 
	{
		if(matchup == 1) //bulb char, defining the stats
		{
			doBattle.battle(Bulb, Char);
		}
		else if(matchup == 2) //squirt bulb
		{
			doBattle.battle(Squirt, Bulb);
		}
		else if(matchup == 3) //char squirt
		{
			doBattle.battle(Char, Squirt);
		}
		else
		{
			System.out.println("Invalid matchup " + matchup);
		}
	}

}
