package array;

import java.util.Scanner;

public class _4344 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int testCase = scan.nextInt();
		int stuNum = 0;
		
		double avg = 0;
		int[] arr = new int[1000];
		
		for(int i = 0; i < testCase; i++) {
			stuNum = scan.nextInt();
			int total = 0;
			int num = 0;
			
			for(int j = 0; j < stuNum; j++) {
				arr[j] = scan.nextInt();
				total += arr[j];
			}
			
			avg = (double)total / stuNum;
			
			for(int j = 0; j < stuNum; j++) {
				if(arr[j] > avg) {
					num++;
				}
			}
			
			System.out.printf("%.3f", 100.0 * num / stuNum);
			System.out.println("%");
		}
		
		scan.close();
	}

}
