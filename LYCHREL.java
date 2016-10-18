package lychrel;
	import java.util.*;
public class LYCHREL {
		/*
		 * 	COMMANDS:
		 *	PRINTLN : System.out.println("");
		 * 	PRINT : System.out.print("");
		 *	PAL	: Returns the reverse of the number 
		 *	LYCHREL : Checks if the numbers from 1 to n are lychrel
		 *
		 */
	//MAIN
	public static void main(String[] args)
		{
			
			int LychrelNumberMax;
			Print("Give a max for Lychrel Numbers: ");
				Scanner LyNumberMax_User = new Scanner(System.in);
				LychrelNumberMax = LyNumberMax_User.nextInt();
			int LychrelNumberCount = 0; // The amount of lychrel numbers found 
			int k;
				int[] p = new int[2];
				for(int i=1; i<=LychrelNumberMax; i++)
					{
						k = i + Pal(i);
							p[0] = k;
							p[1] = Pal(k);
				
								if(p[0] == p[1])
									{
										LychrelNumberCount++;
									}
					}
			Println(LychrelNumberCount+" Lychrel Numbers to "+ LychrelNumberMax);
			
			int size;
			size = LychrelNumberCount;
			int[] LychrelVecotr = new int[size];
			int c = 0;
				for(int i=1; i<=LychrelNumberMax; i++)
					{
						k = i + Pal(i);
						p[0] = k;
						p[1] = Pal(k);
		
							if(p[0] == p[1])
								{
									LychrelVecotr[c++] = p[0];
								}
					}
			int rel=1;
			Scanner Kpp_K= new Scanner(System.in);
				while(rel!=0)
					{
					Println("Nth lychrel number from 1 to "+LychrelNumberMax+" do you want to see?: ");
					Println("[ 0 = exit ]");
					    Kpp_K = new Scanner(System.in);
						rel = Kpp_K.nextInt();
					Println(rel+" nth = " + LychrelVecotr[rel]);
					}
				
				LyNumberMax_User.close();
				Kpp_K.close();
		}
	//MAIN.END
	
	//PROCEDURE
	public static void Print(String x)
		{
			System.out.print(x);
		}
	//PROCEDURE.END
		
	//PROCEDURE
	public static void Println(String x)
		{
			System.out.println(x);
		}
	//PROCEDURE.END
	
	//FUNCTION
	public static int Pal(int x)
		{
			int k = 0;
				
				while(x!=0)
					{
						k = k*10 + x%10;
						x = x / 10;
					}
			return k;	
		}
	//FUNCTION.END
}
