package Chapter04_Array;

import java.util.Arrays;

public class InputArray {

	public static void main(String[] args) {
		
//		02. array 값 불러오기		     
		
//		array 데이터 출력
		
//		10개 짜리 방을 생성
		int[] score = new int[10];

//		length : 배열의 길이 값을 가지고 있다.
		System.out.println(score.length);
		
//		배열에 값 넣기
		score[0] = 10; // 0번 방에 10을 대입
		score[1] = 50; // 1번 방에 50을 대입
		score[2] = 70; // 2번 방에 70을 대입
		
//		3번부터 끝까지 100을 대입
		score[3] = 100;
		score[4] = 100;
		score[5] = 100;
		score[6] = 100;
		score[7] = 100;
		score[8] = 100;
		score[9] = 100;
		
//		아.. 이런 식으로 넣다가는 끝이 없다. 나주에 배열이 100000면 어떻하지?
		
		/*여기서 []에 숫자만 증가 하니 for을 사용하면 편함
		 * for 로 자동 증가
		*/	
		for (int i = 3; i < score.length; i++) { // i가 score보다 클 때 까지 계속 반복
			score[i] = 100; // for 에서 증가한 i를 배열[i] index로 사용해 i 번째 index 에 데이터를 대입 한다.
		}
		

//		score 의 모든 변수 가져오기
		System.out.println(score[1]);
		
		for (int i = 0; i < score.length; i++) {
			System.out.println(score[i]); // score[i] 번째의 index 값에 있는 데이터 출력
		}
		
		System.out.println("============");
		
//		Arrays.toString( 배열 이름) 으로도 출력이 가능하다.
		System.out.println(Arrays.toString(score));
		
	}

}


