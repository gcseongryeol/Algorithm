//package array;
//
//import java.util.Scanner;
//
//public class _8958 {
//	
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		int n = scan.nextInt();
//		
//		String result[] = new String[n];
//		
//		for (int i = 0; i < result.length; i++) {
//			result[i] = scan.next();
//		}
//		
//		scan.close();
//		
//		for (int i = 0; i < result.length; i++) {
//			int count = 0;
//			int sum = 0;
//			
//			for (int j = 0; j < result[i].length(); j++) {
//				if(result[i].charAt(j) == 'O') {
//					count++;
//				} else {
//					count = 0;
//				}
//				
//				sum += count;
//			}
//			
//			System.out.println(sum);
//		}
//	}
//
//}
