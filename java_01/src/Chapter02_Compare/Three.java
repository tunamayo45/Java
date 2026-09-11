package Chapter02_Compare;

public class Three {

	public static void main(String[] args) {


//		삼항연산자
//		조건이 true면 A, false B가 대입됨
		
		int score = 80;
		
		char grade = score > 90 ? 'A' : 'B';
		System.out.println(grade);
		
		
//		문제
//		score가 90보다 크면 A 
//		80 보다 크면 B
//		아니면 C
		
//		참고 : condition ? var1 : var2 <- var에 값 또는 조건이 들어갈 수 있다.
		
		char result = score > 90 ? 'A' : score > 80 ? 'B' : 'C';
		System.out.println(score+" 점은 "+result+" 등급 입니다.");
		

	}

}
