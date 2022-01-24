import java.util.*;
public class spnsource {
	public static void intro (String[] hunters, String[] species, int[] hp, int[] attacklvl, int[]defenselvl) {
		if(hunters.length == 1)
		{
			hunters[0] = "Dean Winchester";
			species[0] = "Human";
			hp[0] = 100;
			attacklvl[0] = 35;
			defenselvl[0] = 35;
		}
		else if(hunters.length == 2)
		{
			hunters[0] = "Dean Winchester";
			species[0] = "Human";
			hp[0] = 100;
			attacklvl[0] = 45;
			defenselvl[0] = 35;
			
			hunters[1] = "Sam Winchester";
			species [1] = "Human";
			hp[1] = 100;
			attacklvl[1] = 35;
			defenselvl[1] = 45;
		}
		
		else if(hunters.length == 3)
		{
			hunters[0] = "1. Dean Winchester";
			species[0] = "Human";
			hp[0] = 100;
			attacklvl[0] = 45;
			defenselvl[0] = 35;
			
			hunters[1] = "Sam Winchester";
			species [1] = "Human";
			hp[1] = 100;
			attacklvl[1] = 35;
			defenselvl[1] = 45;
			
			hunters[2] = "Bobby Singer";
			species[2] = "Human";
			hp[2] = 100;
			attacklvl[2] = 35;
			defenselvl[2] = 60;
		}
		else if (hunters.length == 4)
		{
			hunters[0] = "Dean Winchester";
			species[0] = "Human";
			hp[0] = 100;
			attacklvl[0] = 45;
			defenselvl[0] = 35;
			
			hunters[1] = "Sam Winchester";
			species [1] = "Human";
			hp[1] = 100;
			attacklvl[1] = 35;
			defenselvl[1] = 45;
			
			hunters[2] = "Bobby Singer";
			species[2] = "Human";
			hp[2] = 100;
			attacklvl[2] = 35;
			defenselvl[2] = 60;
			
			hunters[3] = "Castiel";
			species[3] = "Angel";
			hp[3] = 250;
			attacklvl[3] = 25;
			defenselvl[3] = 60;
		}
		else if (hunters.length == 5)
		{
			hunters[0] = "Dean Winchester";
			species[0] = "Human";
			hp[0] = 100;
			attacklvl[0] = 45;
			defenselvl[0] = 35;
			
			hunters[1] = "Sam Winchester";
			species [1] = "Human";
			hp[1] = 100;
			attacklvl[1] = 35;
			defenselvl[1] = 45;
			
			hunters[2] = "Bobby Singer";
			species[2] = "Human";
			hp[2] = 100;
			attacklvl[2] = 35;
			defenselvl[2] = 60;
			
			hunters[3] = "Castiel";
			species[3] = "Angel";
			hp[3] = 250;
			attacklvl[3] = 25;
			defenselvl[3] = 60;
			
			hunters[4] = "Crowley";
			species[4] = "Demon";
			hp[4] = 250;
			attacklvl[4] = 60;
			defenselvl[4] = 25;
		} 
		else
		{
			hunters[0] = "Dean Winchester";
			species[0] = "Human";
			hp[0] = 100;
			attacklvl[0] = 45;
			defenselvl[0] = 35;
			
			hunters[1] = "Sam Winchester";
			species [1] = "Human";
			hp[1] = 100;
			attacklvl[1] = 35;
			defenselvl[1] = 45;
			
			hunters[2] = "Bobby Singer";
			species[2] = "Human";
			hp[2] = 100;
			attacklvl[2] = 35;
			defenselvl[2] = 60;
			
			hunters[3] = "Castiel";
			species[3] = "Angel";
			hp[3] = 250;
			attacklvl[3] = 25;
			defenselvl[3] = 60;
			
			hunters[4] = "Crowley";
			species[4] = "Demon";
			hp[4] = 250;
			attacklvl[4] = 60;
			defenselvl[4] = 25;
			
			hunters[5] = "Rowena";
			species[5] = "Witch";
			hp[5] = 150;
			attacklvl[5] = 60;
			defenselvl[5] = 30;
		}
		Random ranGen = new Random();
		if (hunters.length >= 6)
		{
			for(int i = 6; i<hunters.length; i++)
			{
				int x = ranGen.nextInt(10);
				if(x<0)
					x = x*(-1);
				if(x == 0)
					x += 1;
				hunters[i] = "Hunter " + (char)('A' + (i - 6));
				if(x == 2 || x == 4 || x == 8)
					species[i] = "Human";
				if (x == 3 || x == 6 || x == 9)
					species[i] = "Angel";
				if (x == 5 || x == 10)
					species[i] = "Demon";
				if (x == 1||x == 7)
					species[i] = "Witch";
				hp[i] = ranGen.nextInt(300) + 100;
				if(hp[i] < 10)
					hp[i] = 10;
				attacklvl[i] = ranGen.nextInt(150) + 30;
				defenselvl[i] = ranGen.nextInt(100) + 30;
				
			}
		}
		for(int i = 0; i < hunters.length; i++)
		{
			System.out.println((i+1) + ". " + hunters[i] + "\nSpecies: " + species[i] + "\nHealth: " + hp[i] + "\nAttack Lvl: " + attacklvl[i] + "\nDefense Lvl: " + defenselvl[i] + "\n");
		}
		System.out.print("Pick your hunter by entering in their \nID number next to their name: ");
		
		return;
	}
	public static void champion (int x, String[] hunters, String[] species, int[] hp, int[] attacklvl, int[]defenselvl, String[] players, String[] splayers, int[] hplayers, int[] aplayers, int[] dplayers)
	{
		Scanner scan = new Scanner (System.in);
		
		System.out.println("\nYou have chosen " + hunters[x-1] + "\n");
		if(x > 6)
		{
			System.out.print("Would you like to change the \nname of " + hunters[x-1] + "? \n(type y for yes and n for no): ");
			String a = scan.next();
			if(a.equalsIgnoreCase("y"))
			{
				System.out.print("Please enter the new first name: ");
				hunters[x-1] = scan.next();
				System.out.println("You have chosen " + hunters[x-1] + "\n");
			}	
		}
		players[0] = hunters[x-1];
		splayers[0] = species[x-1];
		hplayers[0] = hp[x-1];
		aplayers[0] = attacklvl[x-1];
		dplayers[0] = defenselvl[x-1];
		System.out.print("Now choose your opponent by entering\ntheir ID number next to their name: ");
		return;
	}
	public static void opponent (int x, String[] hunters, String[] species, int[] hp, int[] attacklvl, int[]defenselvl, String[] players, String[] splayers, int[] hplayers, int[] aplayers, int[] dplayers)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nYou have chosen " + hunters[x-1] + "\n");
		if(x > 6)
		{
			System.out.print("Would you like to change the \nname of " + hunters[x-1] + "? \n(type y for yes and n for no): ");
			String a = scan.next();
			if(a.equalsIgnoreCase("y"))
			{
				System.out.print("Please enter the new first name: ");
				hunters[x-1] = scan.next();
				System.out.println("You have chosen " + hunters[x-1] + "\n");
			}
		}
		players[1] = hunters[x-1];
		splayers[1] = species[x-1];
		hplayers[1] = hp[x-1];
		aplayers[1] = attacklvl[x-1];
		dplayers[1] = defenselvl[x-1];
		return;
	}
	public static void controls (String[] players)
	{
		System.out.println("\n" + players[0] + " vs. " + players[1]);
		System.out.println("\nLet's Go!");
		System.out.println("You have 4 moves. \nAttack\nDefend\nEquip\nFlee");
		System.out.println("Type \"Attack\" or \"a\" to attack");
		System.out.println("Type \"Defend\" or \"d\" to defend");
		System.out.println("Type \"Equip\" or \"e\" to equip");
		System.out.println("Type \"Flee\" or \"f\" to flee");
	}
	public static void attack (String[] players, int[] aplayers, int[] dplayers, String[] splayers, int[] hplayers, int cmove)
	{
		if(splayers[0].equalsIgnoreCase("Angel"))
			System.out.println(players[0] + " uses wing attack");
		else if(splayers[0].equalsIgnoreCase("Human"))
			System.out.println(players[0] + " shoots their gun");
		else if(splayers[0].equalsIgnoreCase("Demon"))
			System.out.println(players[0] + " uses demonic possession");
		else
			System.out.println(players[0] + " uses magic");
		if(aplayers[0] < dplayers[1])
		{
			hplayers[1] -= 5;
			System.out.println(players[1] + " loses 5 health.\n");
			if (cmove == 0)
			{
				System.out.println(players[0] + "'s attacklvl goes down by 10\n");
				aplayers[0] -= 10;
				if (aplayers[0] < 0)
					aplayers[0] = 0;
			}
		}
		else if(aplayers[0] > dplayers[1])
		{
			hplayers[1] -= 10;
			System.out.println(players[1] + " loses 10 health.Nice shot!\n");
			if (cmove == 0)
			{
				System.out.println(players[0] + "'s attacklvl goes down by 20\n");
				aplayers[0] -= 20;
				if (aplayers[0] < 0)
					aplayers[0] = 0;
			}
		}
		else
		{
			hplayers[1] -= 8;
			System.out.println(players[1] + " loses 8 health.\n");
			if (cmove == 0)
			{
				System.out.println(players[0] + "'s attacklvl goes down by 15\n");
				aplayers[0] -= 15;
				if (aplayers[0] < 0)
					aplayers[0] = 0;
			}
		}
		return;
	}
	public static void defend(String[] players, int[] dplayers)
	{
		System.out.println(players[0] + " used defend.\nDefenselvl went up by 30!\n");
		dplayers[0] += 30;
		return;
	}
	public static void equip (String[] players, String[] splayers, int[] aplayers)
	{
		if(splayers[0].equalsIgnoreCase("Human"))
		{
			System.out.println(players[0] + " reloads gun.\nAttacklvl goes up by 30!\n");
			aplayers[0] += 30;
		}
		else if(splayers[0].equalsIgnoreCase("Angel"))
		{
			System.out.println(players[0] + " prays to god.\nAttacklvl goes up by 30!\n");
			aplayers[0] +=30;
		}
		else if(splayers[0].equalsIgnoreCase("Demon"))
		{
			System.out.println(players[0] + " possess a new vessel.\nAttacklvl goes up by 30!\n");
			aplayers[0] +=30;
		}
		else
		{
			System.out.println(players[0] + " makes some hex bags.\nAttacklvl goes up by 30!\n");
			aplayers[0] += 30;
		}
		return;
	}
	public static int counter (String[] players, int[] aplayers, int[] dplayers, String[] splayers, int[] hplayers, String move)
	{
		Random ran = new Random ();
		int cmove = ran.nextInt(3);
		if(cmove < 0)
			cmove = cmove*(-1);
		if(cmove == 0)
		{
			if(players[1].equalsIgnoreCase("Human")) 
			{
				System.out.println(players[1] + " draws a salt ring. \nDefenselvl went up by 30!\n");
				dplayers[1] +=30;
			}
			if(players[1].equalsIgnoreCase("Angel") || players[1].equalsIgnoreCase("Demon"))
			{
				System.out.println(players[1] + " heals their vessel. \nDefenselvl went up by 30!\n");
				dplayers[1] +=30;
			}
			if(players[1].equalsIgnoreCase("Witch"))
			{
				System.out.println(players[1] + " heals their wounds. \nDefenselvl went up by 30!\n");
				dplayers[1] +=30;
			}
		}
		if(cmove == 1)
		{
			if(splayers[1].equalsIgnoreCase("Human"))
			{
				System.out.println(players[1] + " reloads gun.\nAttacklvl goes up by 30!\n");
				aplayers[1] += 30;
			}
			else if(splayers[1].equalsIgnoreCase("Angel"))
			{
				System.out.println(players[1] + " prays to god.\nAttacklvl goes up by 30!\n");
				aplayers[1] +=30;
			}
			else if(splayers[1].equalsIgnoreCase("Demon"))
			{
				System.out.println(players[1] + " possess a new vessel.\nAttacklvl goes up by 30!\n");
				aplayers[1] +=30;
			}
			else
			{
				System.out.println(players[1] + " makes some hex bags.\nAttacklvl goes up by 30!\n");
				aplayers[1] += 30;
			}
		}
		if(cmove == 2)
		{
			if(splayers[1].equalsIgnoreCase("Angel"))
				System.out.println(players[1] + " uses wing attack");
			else if(splayers[1].equalsIgnoreCase("Human"))
				System.out.println(players[1] + " shoots their gun");
			else if(splayers[1].equalsIgnoreCase("Demon"))
				System.out.println(players[1] + " uses demonic possession");
			else
				System.out.println(players[1] + " uses magic");
			if(aplayers[1] < dplayers[0])
			{
				hplayers[0] -= 5;
				System.out.println(players[0] + " loses 5 health.\n");
				if(move.equalsIgnoreCase("Defend"))
				{
					System.out.println(players[1] + "'s attack lvl goes down by 10\n");
					aplayers[1] -= 10;
					if (aplayers[1] < 0)
						aplayers[1] = 0;
				}
			}
			else if(aplayers[1] > dplayers[0])
			{
				hplayers[0] -= 10;
				System.out.println(players[0] + " loses 10 health. Nice shot!\n");
				if(move.equalsIgnoreCase("Defend"))
				{
					System.out.println(players[1] + "'s attack lvl goes down by 20\n");
					aplayers[1] -= 20;
					if (aplayers[1] < 0)
						aplayers[1] = 0;
				}
			}
			else
			{
				hplayers[0] -= 8;
				System.out.println(players[0] + " loses 8 health.\n");
				if(move.equalsIgnoreCase("Defend"))
				{
					System.out.println(players[1] + "'s attack lvl goes down by 15\n");
					aplayers[1] -= 15;
					if (aplayers[1] < 0)
						aplayers[1] = 0;
				}
			}
		}
		return cmove;
	}
	public static void stats (String[] players, String[] splayers, int[] aplayers, int[] dplayers, int[] hplayers)
	{
		if(hplayers[0] <= 0)
		{
			hplayers[0] = 0;
			splayers[0] = "Ghost";
		}
		if( hplayers[1] <= 0)
		{
			hplayers[1] = 0;
			splayers[1] = "Ghost";
		}
		System.out.println(players[0]);
		System.out.println("Species: " + splayers[0]);
		System.out.println("Health: " + hplayers[0]);
		System.out.println("Attack Lvl: " + aplayers[0]);
		System.out.println("Defense Lvl: " + dplayers[0] + "\n");
		System.out.println(players[1]);
		System.out.println("Species: " + splayers[1]);
		System.out.println("Health: " + hplayers[1]);
		System.out.println("Attack Lvl: " + aplayers[1]);
		System.out.println("Defense Lvl: " + dplayers[1] + "\n");
	}
}
