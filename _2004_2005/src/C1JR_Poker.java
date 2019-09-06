import java.util.*;
import java.io.*;

public class C1JR_Poker {
	public static void main(String[] args) {
		
		try {
			
			Scanner in = new Scanner(new File("0405c1jr.in"));
			
			
			for(int gLoop = 0; gLoop < 9; gLoop++) {
				
				//frequency array the tallies how often a card number appears
				int[] freq = new int[13];
				String[] temp = in.nextLine().split(" ");
				ArrayList<Integer> num = new ArrayList<Integer>();
				
				for(int i = 0; i < temp.length; i++) {
					int n = Integer.parseInt(temp[i])%13;
					num.add(n);
					
				}
				//sort for arraylist
				Collections.sort(num);
				
				for(int j = 0; j < num.size(); j++) {
					freq[num.get(j)]++;
				}
				
				//variables that keeping track of how many numbers of cards there are
				int two = 0;
				int three = 0;
				int four = 0;
				for(int k = 0; k < freq.length; k++) {
					
					if(freq[k] == 4) {
						four += 1;
					}
					else if(freq[k] == 3) {
						three += 1;
					}
					else if(freq[k] == 2) {
						two += 1;
					}
					
				}
				
				if(four == 1) {
					System.out.println("FOUR OF A KIND");
				}
				else if(three == 1 && two == 1) {
					System.out.println("FULL HOUSE");
				}
				else if(three == 1) {
					System.out.println("THREE FO A KIND");
				}
				else if(two >= 1) {
					System.out.println("PAIR");
				}
				else {
					System.out.println("NONE");
				}
				
			}
			
			
		}catch(Exception e){
			e.printStackTrace();
			
		}
		
	}
	
	
	
}
