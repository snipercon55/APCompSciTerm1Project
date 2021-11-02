package dice;

import java.util.Random;
import java.util.Scanner;

public class dice {
	Scanner reader = new Scanner(System.in);
	Random rand = new Random();
	int x,dr;
	int rep,count, rep2;
	int[] dice1 = new int[1000];
	int[] dice2 = new int[1000];
	
	//user enters in the amount of rolls they want to do	
	public void EnterRollNum() {
	System.out.println("Please enter the amount of rolls");
	x = reader.nextInt();			
	}
			
	//the program "rolls" the two dice	
	public void DiceRoller() {
	for(dr=0; dr<=x; dr++)
	{dice1[dr] = rand.nextInt(6)+1;
	dice2[dr]  = rand.nextInt(6)+1;}
	
	}
	
	//the program shows what rolls were generated
	public void rolls() {
	System.out.println("Here are the generated rolls:");
	for(dr=0; dr<x; dr++) 
	{System.out.println(dice1[dr]+" "+dice2[dr]);}
	}
	
	//program shows how many times a roll was repeated
	public void RepRolls() {
	for (rep=1; rep<7; rep++) {
		for(rep2=1; rep2<7; rep2++) {
		count = 0;
		for (dr=0; dr<x; dr++) {
			if (rep==dice1[dr] && rep2==dice2[dr])
				count++;}
				System.out.println("The dice roll "+rep+","+rep2+" appears "+count+" times");
		}
	    }
	    }

	
	}

