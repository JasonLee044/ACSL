
import java.util.*;
import java.io.*;

public class C1JR_golf {
	
	static Scanner in;
	static int t1, t2, t3, t4;
	
	public static void main(String[] args) throws IOException {
		
		in = new Scanner(new File("0910c1jr.in"));
		
		for(int i = 0; i < 4; i++) {
			
			try{
				
				init();
				solve();
				
			}catch(Exception e) {
				e.printStackTrace();
				
			}
			
		}
		
		solve2();
		in.close();
	}
	
	static void init() {
		
		 t1 = in.nextInt(); 
		 t2 = in.nextInt();
		 t3+=t1;
		 t4+=t2;
	}
	
	static void solve() {
		
		
		
		if(t1 == t2 ) {
			System.out.println("par");
		}else if(t1 == t2+1) {
			System.out.println("birdie");
		}else if(t1 == t2+2) {
			System.out.println("eagle" );
		}else if(t1+1 == t2) {
			System.out.println("bogey");
		}else {
			System.out.println("double bogey");
		}
		
	}
	
	static void solve2() {
		if(t3 == t4+2) {
		System.out.println("eagle");
	}else if(t3 == t4+1) {
		System.out.println("birdie");
	}else if(t3 == t4) {
		System.out.print("par");
	}else if (t3 + 1 == t4) {
		System.out.println("bogey");
	}else{
		System.out.print("double bogey");
	}
	

	}
}

