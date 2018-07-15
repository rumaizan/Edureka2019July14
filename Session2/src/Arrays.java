
public class Arrays {

	public static void main(String[] args) {
		
		int azDemCount = 126;
		int azRepCount = 250;
		
		int flDemCount = 345;
		int flRepCount = 120;
		
		int txDemCount = 678;
		int txRepCount = 456;
		
		int vrDemCount = 432;
		int vrRepCount = 789;
		
		int gjDemCount = 324;
		int gjRepCount = 500;
		
		// Storing Data goes more complex and tough when we have to store it for all the states !!
		// Performing Vote Counts
		
		int demVoteCount = azDemCount + flDemCount + txDemCount + vrDemCount + gjDemCount;
		int repVoteCount = azRepCount + flRepCount + txRepCount + vrRepCount + gjRepCount;
		
		if(demVoteCount > repVoteCount){
			System.out.println("Democratic Party Wins by "+(demVoteCount - repVoteCount)+" votes");
		}else{
			System.out.println("Republican Party Wins by "+(repVoteCount - demVoteCount)+" votes");
		}
		
		// Only one value can be stored
		int i = 10;
		
		// Arrays - Multi Value Container
		// Store lot of data
		// Homogeneous i.e. same type of data
		int[] demVotes = {126, 345, 678, 432, 324};
		int[] repVotes = {250, 120, 456, 789, 500};
		
		// demVotes and repVotes are Reference Variables which points to Arrays in Heap
		System.out.println("demVotes is: "+demVotes);
		System.out.println("repVotes is: "+repVotes);
		
		// Read Data: Use Index
		System.out.println("demVotes[0] is: "+demVotes[0]); // 126
		System.out.println("repVotes is[1]: "+repVotes[1]); // 120
		
		// Sizes of Arrays:
		System.out.println("demVotes length is: "+demVotes.length);
		System.out.println("repVotes length is: "+repVotes.length);
		
		// Reference Copy
		int[] votes = demVotes; // Copying the address
		System.out.println("votes is: "+votes);
		
		System.out.println("votes[2] is: "+votes[2]); //678
		
		// Manipulate data
		votes[2] = 756;
		System.out.println("votes[2] is: "+votes[2]); //756
		System.out.println("demVotes[2] is: "+demVotes[2]); // 756
		
		int countDem=0;
		int countRep = 0;
		
		// Print all the elements in Array
		System.out.println("======demVotes=====");
		for(i=0;i<demVotes.length;i++){
			System.out.println(demVotes[i]);
			countDem = countDem + demVotes[i];
		}
		
		System.out.println("======repVotes=====");
		for(int elm : repVotes){ // Enhanced For Loop - Workable with Arrays as of now
			System.out.println(elm);
			countRep = countRep + elm;
		}
		
		if(countDem > countRep){
			System.out.println("Democratic Party Wins by "+(countDem - countRep)+" votes");
		}else{
			System.out.println("Republican Party Wins by "+(countRep - countDem)+" votes");
		}

	}

}
