//package array;
//
//import java.util.Scanner;
//
//public class _1546 {
//	
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int N = scan.nextInt();
//		
//		double score[] = new double[N];
//		
//		double max = 0;
//		double num = 0;
//		
//		for(int i = 0; i < score.length; i++) {
//			score[i] = scan.nextInt();
//			
//			if (score[i] >= max) {
//				max = score[i];
//			}
//			
//		}
//		
//		for(int i = 0; i < N; i++ ) {
//			num = num + score[i] / (double)max * 100;
//		}
//		
//		double avg = num / N;
//		
//		System.out.println(avg);
//		
//		
//	}
//	
//	
//
//}
