import java.util.*;
public class yellow extends spnsource {
	public static void main (String [] args){
		Scanner scan = new Scanner(System.in);
		Random ranGen = new Random();
		
		System.out.print("How many character choices would you like?: ");
		final int max = scan.nextInt();
		String[] hunters = new String[max];
		String[] players = new String[2];
		String[] species = new String[max];
		String[] splayers = new String[2];
		int[] hp = new int[max];
		int[] hplayers = new int[2];
		int[] attacklvl = new int[max];
		int[] aplayers = new int[2];
		int[] defenselvl = new int[max];
		int[] dplayers = new int[2];
		int cmove = 1;
		
		System.out.println("Welcome to the Supernatural Game!");
		
		intro(hunters, species, hp, attacklvl, defenselvl);
		int x = scan.nextInt();
		
		champion(x, hunters, species, hp, attacklvl, defenselvl, players, splayers, hplayers, aplayers, dplayers);
		int z = scan.nextInt();
		
		opponent(z, hunters, species, hp, attacklvl, defenselvl, players, splayers, hplayers, aplayers, dplayers);
		
		controls(players);
		
		while(hp[x-1] > 0 || hp[z-1] > 0)
		{
			System.out.print("\nWhat will be your move?: ");
			String move = scan.next();
			System.out.println(" ");
			
			if(move.equalsIgnoreCase("Attack") || move.equalsIgnoreCase("a"))
				attack(players, aplayers, dplayers, splayers, hplayers, cmove);
			else if (move.equalsIgnoreCase("Defend") || move.equalsIgnoreCase("d"))
				defend(players, dplayers);
			else if (move.equalsIgnoreCase("Equip") || move.equalsIgnoreCase("e"))
				equip(players, splayers, aplayers);
			else if (move.equalsIgnoreCase("Flee") || move.equalsIgnoreCase("f"))
			{
				System.out.println("You have fled");
				break;
			}
			if(move.equalsIgnoreCase("Attack") || move.equalsIgnoreCase("Defend") || move.equalsIgnoreCase("Equip") || move.equalsIgnoreCase("a")
				 || move.equalsIgnoreCase("d") || move.equalsIgnoreCase("e") || move.equalsIgnoreCase("f"));
			{
				cmove = counter(players, aplayers, dplayers, splayers, hplayers, move);
				stats(players, splayers, aplayers, dplayers, hplayers);
			}
			if(hplayers[0] <= 0 || hplayers[1] <= 0)
				break;
		}
		if(hplayers[1] == 0)
			System.out.println("Yay!!!! you won");
		else if(hplayers[0] == 0)
			System.out.println("Bummer you lost");
		System.out.println("\n****~~~~Thank You for playing The Supernatural Games!~~~~****");
	}
}


