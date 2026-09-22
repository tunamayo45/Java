package Chapter03_condition;

public class Break {

	public static void main(String[] args) {
		
//		반복문을 강제로 종료시키는 코드
//		소스코드를 정지하는 것이 아니다.
		
		
//		example
//		while 은 무한 루푸 중
//		그런데 i 값이 100이 된다면 빠져나오도록 만들기
		
		int i = 1;
		
		while (true) {
			System.out.println(i);
			if (i==100) { // 이 부분의 조건을 만족하면 
				break;		// break가 작동해서 무한 while 문을 정지한다.
			}
			i++;
		}

	}

}
