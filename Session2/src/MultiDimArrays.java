
public class MultiDimArrays {

	public static void main(String[] args) {
		
		int[] demVotes = {126, 345, 678, 432, 324};
		int[] repVotes = {250, 120, 456, 789, 500};
		
		System.out.println("demVotes is: "+demVotes+" and length is: "+demVotes.length);
		System.out.println("repVotes is: "+repVotes+" and length is: "+repVotes.length);
		
		// Array of Arrays
		int[][] votes = {
							{126, 345, 678, 432, 324}, // 0th -> demVotes
							{250, 120, 456, 789, 500}  // 1st -> repVotes
				  		};
		
		System.out.println("votes is: "+votes+" and length is: "+votes.length);
		System.out.println("votes[0] is: "+votes[0]+" and length is: "+votes[0].length);
		System.out.println("votes[1] is: "+votes[1]+" and length is: "+votes[1].length);
		System.out.println("votes[0][0]: "+votes[0][0]);
		
		System.out.println("***********************");
		// 2 times from 0 to 1
		for(int i=0;i<votes.length;i++){
			for(int j=0; j<votes[i].length; j++){
				System.out.print(votes[i][j]+"  ");
			}
			System.out.println();
		}
		System.out.println("***********************");
		
		// Array of Array of Arrays  |  3D
		//Popultation Country -> Population State -> population City
		int[][][] population = {
									{
										{10,20,30,40,50},
										{10,20},
										{10,20,30},
										{10},
										{10,20,30,40}
									},
									{
										{10,20,30,40,50},
										{10,20},
										{10,20,30},
										{10},
										{10,20,30,40}
									}
							   };
		
		// Data will be written later
		int[][] arr1 = new int[3][5]; // 3 1-D arrays, each array having 5 elements
		
		int[][] arr2 = new int[3][];  // 3 1-D arrays, each arrays size will be decided later
		arr2[0] = new int[5];
		arr2[1] = new int[15];
		arr2[2] = new int[25];
		
		
		// HW: Read M-Dim Arrays with Enhanced For Loop
		
		// N-D Arrays is a collection of N-1 D Arrays
		
	}

}
