package Chapter04_Array;

public class OutArr {

	public static void main(String[] args) {
		
//		03. 배열의 값을 꺼내기
		
//		1차 배열
		 
		int[] scores = {90,75,84,35,88};
		
//		0번 방 호출
		System.out.println(scores[0]); // 어느 배열에 있는 몇번째 index 데이터를 출력 한다.
		
//		3번 방 호출
		System.out.println(scores[3]);
		
//		4번 방 호출
		System.out.println(scores[4]);
		
//		모든 방의 값을 출력
		for (int i = 0; i < scores.length; i++) { // i 가 scores의 배열 길이보다 클때 까지 반복
			System.out.println(scores[i]);	//scores[i] 번째 index 데이터를 출력
		}

	}

}
