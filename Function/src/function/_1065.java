package function;

import java.util.Scanner;

public class _1065 {
	
	public static int sequence(int num) {
		
		int count = 0; 
		
		if( num < 100 ) {
			return num;
			
		} else {
			
			count = 99;
			if(num == 1000) {
				num = 999;
			}
			
			for(int i = 100; i <= num; i++) {
				int hun = i / 100;
				int ten = (i / 10) % 10;
				int one = i % 10;
				
				if((hun - ten) == (ten - one)) {
					count++;
				}
			}
		}
		
		return count;
		
		
		
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int number = scan.nextInt();
		
		System.out.println(sequence(number));
		
	}

}
