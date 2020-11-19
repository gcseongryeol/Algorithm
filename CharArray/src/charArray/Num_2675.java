package charArray;

import java.util.Scanner;

public class Num_2675 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		int T = scan.nextInt(); // 테스트 케이스 개수
		for(int i = 0; i < T; i++) { // 테스트 케이스 개수만큼 반복
			
			int R = scan.nextInt(); // 테스트 케이스 반복 횟수
			String S = scan.next(); // 문자열
			
			for(int j = 0; j < S.length(); j++) { // 문자열의 길이만큼 반복
				for(int k = 0; k < R; k++) { // 반복횟수 만큼 반복
					System.out.print(S.charAt(j)); // j인덱스에 해당하는 문자를 반환
				}
			}
			
			System.out.println();
		}

	}

}
