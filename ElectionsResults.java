/*
	This programs gives you the election results based on the name of the candidate input in the command line.
*/

import java.util.Collections;

class Vote
{
	public static void main(String args[])
	{
		// 2D Array with all election results, used by the rest of the program
		String results[][] = {
		{"Macron", "24%"},
		{"Le Pen", "21.3%"},
		{"Fillon", "20%"},
		{"Melenchon", "19.6%"},
		{"Hamon", "6.4%"},
		{"Dupont-Aignan", "4.7%"},
		{"Lassalle", "1.2%"},
		{"Poutou", "1.1%"},
		{"Asselineau", "0.9%"},
		{"Arthaud", "0.6%"},
		{"Cheminade", "0.2%"}
		};

		// If no input was added in the command line
		if (args.length < 1)
		{
			System.out.println("Please input the name of the candidate.");
		}
		
		// provide all the results of the elections
		else if (args[0].equals("all"))
		{
			for(int i = 0; i<results.length; i++)
			{
				System.out.println(results[i][0] +": " + results[i][1]);
			}
		}
		
		// provides the results of the winners, ie the two candidates who came out with the most votes
		else if (args[0].equals("winners"))
		{
			System.out.println(results[0][0] +": " + results[0][1]);
			System.out.println(results[1][0] +": " + results[1][1]);
		}
		
		//provide the results for the specific candidates inputed
		else
		{	int i;
			for (int j = 0; j < args.length; j++)
			{
				for (i = 0; i < results.length; i++)
				{
					if (results[i][0].equals(args[j]))
					{
						System.out.println(results[i][0] +": " + results[i][1]);
						break;
					}
				}
				
				// output if an invalid input was read by the program
				if (i == results.length)
				{
					System.out.println("Name not found.");
				}
			}	
		}
	}
}
	
