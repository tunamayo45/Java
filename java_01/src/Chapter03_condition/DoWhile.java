package Chapter03_condition;

public class DoWhile {

	public static void main(String[] args) {

//		do while 은 일단 먼저 지르고 본다
//		while과는 조건이 부합하지 않을 경우 다른 결과를 낸다.
//		example : 버스에 카드를 찍고 타냐, 일단타고 내릴때 찍냐 차이
		
		int cnt = 11;
		
		while (cnt < 10) { // 조건을 보고
			cnt ++; // 실행을 한다.
		}
		System.out.println("while : "+cnt);
		
		
		do {
			cnt++;
		} while (cnt<10);
		System.out.println("do While : "+cnt);
		
		/* 음... while 뒤에 외 ? {} 가 없지?
		 * while의 조건이 만족하면 do로 다시 돌아간다.
		 * 
		 * 조건이 만족되지 못하는 상황으로 시작할때는 두 구문을 다르게 반응 한다.
		*/
		
	}

}
