import java.util.*;
public class Bobcar 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner (System.in);
		int base, discount, y, car, days, x;
		double pep, total;
		System.out.println("Avaliable Cars: enter 1 for Economy, enter 2 for Compact, enter 3 for Standard");
		System.out.print("Please choose a rental car: ");
		car = scan.nextInt();
		System.out.print("Please enter number of rental days: ");
		days = scan.nextInt();
		System.out.print("Are you a Club Member?: enter 1 for yes, enter 0 for no: ");
		x = scan.nextInt();
		if(x==1)
		{
			System.out.print("Do you want the Platinum Executive Package?:"
					+ " enter 1 for yes, enter 0 for no: ");
			y = scan.nextInt();
		}
		else
		{
			y = 0;
		}

		if(car == 1)
		{
			if(x == 1)
			{
				if(y == 1)
				{
					base = (days*35);
					discount = ((days/7)*35);
					pep = (base*0.15);
					total = (base - discount + pep);
					System.out.println("\nBase: "+days+" days for a Economy @ $35 per day:  \t  $"+base);
					System.out.println("Club Member Discount:                   \t- $"+discount);
					System.out.println("Plantinum Exective Package:             \t+ $"+pep);
					System.out.println("                                            \t----------");
					System.out.println("Total Estimate for Rental:                  \t   $"+total);
				}
				else
				{
					base = (days*35);
					discount = ((days/7)*35);
					pep = (0);
					total = (base - discount + pep);
					System.out.println("\nBase: "+days+" days for a Economy @ $35 per day:  \t  $"+base);
					System.out.println("Club Member Discount:                   \t- $"+discount);
					System.out.println("                                            \t----------");
					System.out.println("Total Estimate for Rental:                  \t   $"+total);
				}
			}
			else
			{
				base = (days*35);
				discount = (0);
				pep = (0);
				total = (base - discount + pep);
				System.out.println("\nBase: "+days+" days for a Economy @ $35 per day:  \t  $"+base);
				System.out.println("                                            \t----------");
				System.out.println("Total Estimate for Rental:                  \t   $"+total);
			}
		}
		else if(car==2)
		{
			if(x==1)
			{
				if(y==1)
				{
					base = (days*45);
					discount = ((days/7)*45);
					pep = (base*0.15);
					total = (base - discount + pep);
					System.out.println("\nBase: "+days+" days for a Compact @ $45 per day:  \t  $"+base);
					System.out.println("Club Member Discount:                   \t- $"+discount);
					System.out.println("Plantinum Exective Package:             \t+ $"+pep);
					System.out.println("                                            \t----------");
					System.out.println("Total Estimate for Rental:                  \t   $"+total);
				}
				else
				{
					base = (days*35);
					discount = ((days/7)*35);
					pep = (0);
					total = (base - discount + pep);
					System.out.println("\nBase: "+days+" days for a Compact @ $45 per day:  \t  $"+base);
					System.out.println("Club Member Discount:                   \t- $"+discount);
					System.out.println("                                            \t----------");
					System.out.println("Total Estimate for Rental:                  \t   $"+total);
				}
			}
			else
			{
				base = (days*35);
				discount = (0);
				pep = (0);
				total = (base - discount + pep);
				System.out.println("\nBase: "+days+" days for a Compact @ $45 per day:  \t  $"+base);
				System.out.println("                                             \t----------");
				System.out.println("Total Estimate for Rental:                   \t   $"+total);
			}
		}
		else
		{
			if(x==1)
			{
				if(y==1)
				{
					base = (days*95);
					discount = ((days/7)*95);
					pep = (base*0.15);
					total = (base - discount + pep);
					System.out.println("\nBase: "+days+" days for a Standard @ $95 per day:  \t  $"+base);
					System.out.println("Club Member Discount:                    \t- $"+discount);
					System.out.println("Plantinum Exective Package:               \t+ $"+pep);
					System.out.println("                                              \t----------");
					System.out.println("Total Estimate for Rental:                    \t   $"+total);
				}
				else
				{
					base = (days*95);
					discount = ((days/7)*95);
					pep = (0);
					total = (base - discount + pep);
					System.out.println("\nBase: "+days+" days for a Standard @ $95 per day:  \t  $"+base);
					System.out.println("Club Member Discount:                    \t - $"+discount);
					System.out.println("                                             \t----------");
					System.out.println("Total Estimate for Rental:                   \t   $"+total);
				}
			}
			else
			{
				base = (days*95);
				discount = (0);
				pep = (0);
				total = (base - discount + pep);
				System.out.println("\nBase: "+days+" days for a Standard @ $95 per day:  \t  $"+base);
				System.out.println("                                             \t----------");
				System.out.println("Total Estimate for Rental:                   \t   $"+total);
			}
		}

	}
}
