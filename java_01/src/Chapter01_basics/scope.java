package Chapter01_basics;

public class scope { // class 선언부 , class 이름

	public static void main(String[] args) { // main 선언부, 진입점, 이부분이 있어야 실행이 됨
				
		/* 핵심 키워드 : scope, 지역변수, 전역변수 메서드
		 * 
		 *  scope
		 *  	어디서 접근이 가능하고 접근이 불가능 한지 결정하는 범위
		 *  	선언된 곳 보다 바깥쪽 영역에서는 사용이 불가
		 *  	선언된 범위 { } 안쪽에서 만 사용 가능
		 *  	선언된 곳 보다 바깥쪽 영역에서는 사용 불가
		 *  
		 * 로컬 변수
		 * 		메서드 안에서만 사용 가능 (지역화폐)
		 * 
		 * 전역변수 
		 *		class 전역에서 사용 가능 (통화)
		 *
		 *요약
		 *		밖에 있는 건 안으로 들어갈 수 있다. -> 안에 있는 건 밖으로 갈 수 없다.
		*/
		
		int num = 1; // main method 안에서 사용 가능
		
		for (int i = 0; i < 5 ; i++) {
			int sum = num + i;				// for에서만 사용 가능
			System.out.println(sum);
		}
//			System.out.println(sum); sum 은 for 문장을 넘어 갈 수 없다.
	}

}
