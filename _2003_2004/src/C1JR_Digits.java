import java.util.*;
import java.io.*;

public class C1JR_Digits {
	public static void main(String[] args) {
		
		try {
			
			//set up input file
			Scanner in = new Scanner(new File("0302c1jr.in"));
			
			//giant for loop
			for(int gLoop = 0; gLoop < 10; gLoop++) {
				
				
				//organize data
				
				String temp = in.nextLine();
				int[] num = new int[temp.length()];
				
				for(int i = 0; i < num.length; i++) {
					num[i] = Character.getNumericValue(temp.charAt(i));
				}
				
				//find largest digit
				int indexL = 0;
				for(int i = 0; i < num.length; i++) {
					if(num[indexL] < num[i]) {
						indexL = i;
					}
				}
				
				//process digits
				if(num[indexL] % 2 == 1) {
					num[indexL] = 0;
				}else {
					num[indexL] = (num[indexL]) % 10;
					
				}
				
				
				//output
				for(int i = 0; i < num.length; i++) {
					if(num[i] == 0 && i == 0) {
						continue;
					}
					System.out.print(num[i]);
				}
				System.out.println();
				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}
}
