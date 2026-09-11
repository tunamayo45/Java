package Chapter02_condition;

public class Else {

	public static void main(String[] args) {
		
//		if에 있는 조건을 만족 시키지 못할 경우에 else가 사용 된다.
		
		System.out.println("가게에 간다.");
		
		int tofubox = 0;
		
		
//		else를 사용하지 안았을때 문제 풀기 방법
		
//		1.
		if (tofubox>0) {
			System.out.println("두부를 사온다");
		}
		
		if (tofubox < 1) {
			System.out.println("순두부를 사온다.");
		}
		
//		이렇게 사용하면 중간에 어떤 구문도 실행되지 않는 부분이 생긴다.
//		경계선 값 오류 : n 값이 포함이 되질 않아서이다.
		
		/* Example
		 * 
		 	if (a>1) { -> 2,3,4.... 실행
				System.out.println("두부를 사온다");
			}
			
			if (a < 1) { -> 0,-1,-2... 실행
				System.out.println("순두부를 사온다.");
			}
			
			a가 1인 경우 어떤 구문도 실행되지 않는다.
			
			if를 따로 쓰면 두 조건이 모두 실행되거나 
			둘 다 실행되지 않는 경우가 발생할 수 있다.
			
			if-else 는 하나의 조건을 기준으로
			반드시 하나의 블록만 실행되도록 보장한다.
			
			이런 문제를 경계 값 오류(boundary value) 오류라고 한다.
			
		*/
		
		if (tofubox > 0) {
			System.out.println("두부를 사온다.");
		} else { //else 사용하면 tofubox가 0 이상인지에 따라 행동을 명확히 구분 한다.
			System.out.println("순두부를 사온다.");
		}
		System.out.println("집으로 온다.");

	}

}
