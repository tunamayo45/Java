package Chapter03_condition;

public class For {

	public static void main(String[] args) {

		/* for( 이 녀석이 ; 이것을 만족한다면 ; 증가 또는 감소 )
		 * for 은 반복 횟수가 정해진 상태가 적합
		 * 
		 * for 는 조건식이 true인 동안에는 계속 반복 실행되는 반복문이다.
		 * 보통 반복 횟수가 정해져 있는 때 사용한다.
		 * 조건식이 false 가 되면 코드 블록을 빠져나와 반복문아 종료한다.
		 */
		
//		물 10잔 떠오기
		
		/*for (int i = 0; i <=10; i++) {
			System.out.println("물 "+i+" 잔을 가져옴");
		}*/
		
		
//		2중 for 
//		작동 원리 : 바깥쪽 for 문이 한번 실행될 때마다. 안쪽에 for문은 조건식은 false 가 될 때까지 실행
		
//		총 10잔에 커피 2개를 탄다.
//		물을 10잔 가져온다. 거기에 커피를 2개를 탄다.
		
		for (int i = 1; i <=10; i++) {
			System.out.println("물 "+i+"잔을 가져옴");
			for (int j =1; j <= 2; j++) { // false 가 나올때 까지 반복
				System.out.println("커피를 "+j+"개 탄다");
			}
		}
		
		/*코드 설명
		 * 2중 for문을 사용한다.
		 * 가장 바깥에 있는 for이 1번 실행 될때
		 * 안쪽 for문은 false 가 나올때 까지 실행이 된다.
		 * 주로 행과 열처럼 2차원 구조의 데이터를 처리할 때 사용한다.
		*/
		
	}

}
