package array;

class Solution {

//    public static int solution(String[] grades, int[] weights, int threshold) {
//        int answer = -1234567890;
//        int score = 0;
//        int result = 0;
//        
//        for(int i = 0; i < grades.length; i++) {
//        	
//            if(grades[i] == "A+") {
//                score = 10;
//            } else if (grades[i] == "A0") {
//                score = 9;
//            } else if (grades[i] == "B+") {
//                score = 8;
//            } else if (grades[i] == "B0") {
//                score = 7;
//            } else if (grades[i] == "C+") {
//                score = 6;
//            } else if (grades[i] == "C0") {
//                score = 5;
//            } else if (grades[i] == "D+") {
//                score = 4;
//            } else if (grades[i] == "D0") {
//                score = 3;
//            } else {
//                score = 0;
//            }
//            
//            result += score * weights[i];
//        }
//        
//        answer = result - threshold;
//        
//        return answer;
//        
//    }

	public static void main(String[] args) {

		String[] grades = { "B+", "A0", "C+" };
		int[] weights = { 6, 7, 8};

		int threshold = 200;
		
		int score = 0;
		int result = 0;
		int answer = -1234567890;

		for (int i = 0; i < grades.length; i++) {

			if (grades[i] == "A+") {
				score = 10;
			} else if (grades[i] == "A0") {
				score = 9;
			} else if (grades[i] == "B+") {
				score = 8;
			} else if (grades[i] == "B0") {
				score = 7;
			} else if (grades[i] == "C+") {
				score = 6;
			} else if (grades[i] == "C0") {
				score = 5;
			} else if (grades[i] == "D+") {
				score = 4;
			} else if (grades[i] == "D0") {
				score = 3;
			} else {
				score = 0;
			}

			result += score * weights[i];
		}

		answer = result - threshold;
		
		System.out.println(answer);

	}
}
