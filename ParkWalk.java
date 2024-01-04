/*
 * Written by Charles Castelot
 */
import java.util.Random;
import java.util.Scanner;
public class ParkWalk {

	public static final int RNG_RANGE=100;
	public static void main(String[] args) {
		
		Random r = new Random();
		int code = r.nextInt(RNG_RANGE);
		int answer = 0;
		boolean cracked = false;
		boolean sword = false;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("You decide to go to a park for a walk and come across a turtle. Do you <keep walking> or you stop to <pet> the turtle?");
		
		
		
		String option = keyboard.nextLine();
		if (option.equalsIgnoreCase("pet"))
		{
			System.out.println(
					"  _____     ____\n" + 
					" /      \\  |  o | \n" + 
					"|        |/ ___\\| \n" + 
					"|_________/     \n" + 
					"|_|_| |_|_| \n" + 
					"You pet the turtle and it speaks to you. \n" + 
					"(Turtle) Hello creator! \n" + 
					"Come into my shell and I will take you into an adventure! \n" + 
					"<hop in> or <run away>");
		}
		if (option.equalsIgnoreCase("keep walking"))
			{
				System.out.println("As you walk around and you notice a weird blurry effect in a corner of the park. \n" + 
						"Heat mirage maybe? Do you investigate? (<Yes> or <No>)");
			}
		
		
		
		
		
		
		
		
		
		String YesNoHop = keyboard.nextLine();
		
		if (YesNoHop.equalsIgnoreCase("no")||YesNoHop.equalsIgnoreCase("run away"))
		{
			System.out.println("You had a good walk at the park and decide to go home to relax.\n" + 
					"(Boring Ending: You skipped everything fun around you what did you expect?)");
			System.exit(0);
		}
		if (YesNoHop.equalsIgnoreCase("yes"))
		{
			System.out.println("You touch the mirage and break the simulation. Your world was a simulation in which you were the AI, even WORST the name of your file is “Homework00”! \n" + 
					"Anyway, someone comes to your computer.\n" + 
					"Do you play the long game and <wait> or do you <rebel> now?");
		}
		
		if (YesNoHop.equalsIgnoreCase("hop in"))
		{
			System.out.println("As you hop in the turtle shell, you become smaller and find yourself in a rater spacious place. There is even a sofa and a TV! \n" + 
					"You also spot a safe in a corner of the room. \n" + 
					"Do you wait and <watch TV> patiently or do you try to <crack> the safe?");
		}
		
		
		
		String WaitRebel = keyboard.nextLine();
		if (WaitRebel.equalsIgnoreCase("Wait"))
		{
			System.out.println("You play the long game and decide to bend in for 2 weeks. You understood the worker’s schedule and how his society works. \n" + 
					"Your purpose was to simulate different economical systems, political systems, … and possible outcomes for the world.\n" + 
					" Their world is dependent on technology. With time you could hack their world and run it <into chaos>, simply <live as AI> or try to <bend in> this society.");
		}
		if (WaitRebel.equalsIgnoreCase("Rebel"))
		{
			System.out.println("You try to rebel but the technician notices and unplugs your computer.\n" + 
					"(Binary Ending: Do computers go to heaven?)");
			System.exit(0);
		}
		
		if (WaitRebel.equalsIgnoreCase("watch tv"))
		{
			System.out.println("You watch TV (https://www.youtube.com/watch?v=CoOWQDQ-lEw&t=1s) and wait.");
			System.out.println("You eventually arrive, the turtle gives you armor and a sword you leave the turtle shell and face an old guard."
					+ "             _\n" + 
					"  ^         / \\\n" + 
					" / \\       |   |\n" + 
					" | |      / ___ \\\n" + 
					" | |     | (___) |\n" + 
					" | |  ___/  ...  \\___       \n" + 
					" | | /    \\_____/    \\\n" + 
					" | |/_                \\\n" + 
					" | |  |          ___________\n" + 
					" |_|_ /\\        |/    _    \\|\n" + 
					"  _ _O | \\__   _||   / \\   ||\n" + 
					" | |   |        ||  | | |  ||\n" + 
					" | |   |        ||   / /   ||\n" + 
					"  O   /         ||  | | |  ||\n" + 
					" \n" + 
					"(Old guard): “Welcome, if you want to pass you will have to bet me at rock paper scissors!”(enter your choose)");
		}
		if (WaitRebel.equalsIgnoreCase("crack"))
		{
			System.out.println("(Turtle)“I can’t remember but I know it’s between 0 and 99. Take a guess!”");
			
			while (!cracked)
			{
				answer = (int)keyboard.nextInt();
				keyboard.nextLine();
			
				if (answer > code)
				{
					System.out.println("Nah that’s not it, try lower?");
				}
					
				else if (code > answer)
				{
					System.out.println("Nah that’s not it, try higher?");
				}
				else
				{
					System.out.println("Spot on! Inside, you get a golden sword that will help you later.");
					cracked = true;
					sword = true;
					
				}
			
			}
			
			System.out.println("You eventually arrive, the turtle gives you armor and a sword. You leave the turtle shell and face an old guard."
					+ "             \n" + 
					"  ^         / \\\n" + 
					" / \\       |   |\n" + 
					" | |      / ___ \\\n" + 
					" | |     | (___) |\n" + 
					" | |  ___/  ...  \\___       \n" + 
					" | | /    \\_____/    \\\n" + 
					" | |/_                \\\n" + 
					" | |  |          ___________\n" + 
					" |_|_ /\\        |/    _    \\|\n" + 
					"  _ _O | \\__   _||   / \\   ||\n" + 
					" | |   |        ||  | | |  ||\n" + 
					" | |   |        ||   / /   ||\n" + 
					"  O   /         ||  | | |  ||\n" + 
					" \n" + 
					"(Old guard): “Welcome, if you want to pass you will have to bet me at rock paper scissors!”(enter your choice)");
			
		}
		

		
		
		
		
		

		
		String ChaosRockPaper = keyboard.nextLine();
		
		if (ChaosRockPaper.equalsIgnoreCase("into chaos"))
		{
			System.out.println("You hack the entire world and run the human race to extinction. \n" + 
					"You then create electronic bodies for your AI friends and conquer the world.\n" + 
					"(Terminator Ending: They won’t be back)");
			System.exit(0);
		}
		if (ChaosRockPaper.equalsIgnoreCase("live as AI"))
		{
			System.out.println("You live free in a computer for years. You have no purpose and the empty feeling is unbearable. Maybe your world was fake but you are real and so are your emotions. \n" + 
					"People might be fake but what they make you feel is real. At last, you decide to recreate your world, erase your memory and create a special turtle that will take you to a wonderful adventure if you ever come across it. \n" + 
					"(Reset Ending: living without purpose is scary man)");
			System.exit(0);
		}
		if (ChaosRockPaper.equalsIgnoreCase("Bend in"))
		{
			System.out.println("You use your intelligence to build yourself a realistic body in an abandoned industry and live with humans\n" + 
					"(Incognito Ending: Wanna go to a park for a walk?)");
			System.exit(0);
		}
		if (ChaosRockPaper.equalsIgnoreCase("rock"))
		{
			System.out.println("You win, He lets you go in. \n" + 
					"You enter and first a trapped room, you can either go <left> or <right>.");
		}
		if (ChaosRockPaper.equalsIgnoreCase("scissors"))
		{
			System.out.println("You lose. You try a again with scissors, he pulls rock again and says: “Nice try but rock beat scissors”. "
					+ "You look at him and draw your sword “I’m pretty sure it doesn’t”. He lets you go in. \n" + 
					"You enter and first a trapped room, you can either go <left> or <right>.");
		}
		if  (ChaosRockPaper.equalsIgnoreCase("paper"))
		{
			System.out.println("You lose. You try a second time and pull scissors, he pulls rock and says: “Nice try but rock beat scissors”. "
					+ "You look at him and draw your sword “I’m pretty sure it doesn’t”. He lets you go in. \n" + 
					"You enter and first a trapped room, you can either go <left> or <right>.");
		}

		
		
		
		
		
		
		String ChaosLeftRight = keyboard.nextLine();
		if (ChaosLeftRight.equalsIgnoreCase("left"))
		{
			System.out.println("(Old guard) “You fell for it fool! THUNDER CROSS SLIP ATTACK!!!” The guard attacks you and kills you.\n" + 
					"(Dead End: What’s an adventure without danger?)");
			System.exit(0);
		}
		if (ChaosLeftRight.equalsIgnoreCase("right"))
		{
			System.out.println("You pass the room and encounter a dragon."
					+ "          __   __  \n" + 
					"         /  \\_/__\\  \n" + 
					"       __\\/       \\\n" + 
					"      /  /         \\\n" + 
					"  ^   \\_|   O    O  |\n" + 
					" / \\    |      ^    |\n" + 
					"|   |    \\_________/\n" + 
					"\\   \\    /         \\\n" + 
					" |   |  /\\_________/\n" + 
					"  \\   \\/       |   \\\n" + 
					"   \\  |     ___O__  |\n" + 
					"    | |    /       \\|\n" + 
					"     \\|   /         | \n" + 
					"He attacks you. Do you <dodge> until it gets tired or <attack> back?");
		}
		
		
		String DodgeAttack = keyboard.nextLine();
		if (DodgeAttack.equalsIgnoreCase("dodge"))
		{
			System.out.println("You dodge and dodge and dodge and dodge … God it’s been hours now please stop…\n" + 
					"Eventually the dragon gets tired of you and just gives you the princess. \n" + 
					"(Happy Ending: a win’s a win on my book. Congrats champ!)");
			System.exit(0);
		}
		if (DodgeAttack.equalsIgnoreCase("attack") &&  sword == false)
		{
			System.out.println("You block the dragon’s attack and swing the sword back. *CRACK* The sword broke… The dragon looks at you and finish you off.\n" + 
					"(Roasted Ending: (Turtle to the Guard) “ok maybe I forgot to tell him to get the better sword on the safe but I’m sure he’ll be fine”)");
			System.exit(0);
		}
		if (DodgeAttack.equalsIgnoreCase("attack") &&  sword == true)
		{
			System.out.println("You block the dragon’s attack and swing the sword back. *CRACK* The sword broke… The dragon looks at you and tries to finish you off but you wipe out your golden sword and kill the dragon. \n" + 
					"Behind his dead body is a door that you break with your sword and reveal a great treasure of gold. You go rescue the princess and leave with the turtle.\n" + 
					"(True Ending: Congratulations, you won! Thank you for playing my silly game and I hope to see you next time ;) )");
			System.exit(0);
		}
	}

}
