package Chapter03_condition;

public class Continue {

	public static void main(String[] args) {
		
		/*0 에서 10 까지 출력
		 * 단 3은 캔슬
		*/
		
		for (int i = 0; i <= 10; i++) {
			if (i==3) {
				continue;
			}
			System.out.println(i);
		}
		
		/*continue 는 for, while, do-while, 에서 사용이 가능하다
		 * 특정 조건이 있을때는 아래있는 코드를 무시하라
		 * for 에서는 continue 를 만나면 다시 증감식으로 바로 이동한다.
		 * while, do-while 에서는 조건식으로 이동한다.
		 * 현재 반복문의 아래 코드를 무시하고 다음 반복문으로 이동한다.
		*/

	}

}
