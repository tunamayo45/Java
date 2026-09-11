package Chapter02_Compare;

public class Compare { 

	public static void main(String[] args) {
		
//		2항 연산자
		
//		= 은 대입 연산
		int v1 = 1;
		double v2 = 1.0;
		int v3 = 4;
		
		
//		문자열은 여러가지 방법으로 선언 할 수 있다.
		String v4 = "java";
		String v5 = new String("java");
		
//		비교연산 - 비교 연산은 항상 왼쪽이 기준이다.
		System.out.println(v1==v2); // 같은지 검사
		
		
//		!논리 부정 연산자 = true -> false로 변환한다. (확은 반대로)
		System.out.println(v1!=v2);
		System.out.println(v1<v2);
		System.out.println(v4 == v5); //문자열은 다른 연산자로 비교
		System.out.println(v4.equals(v5)); // 문자열 비교는 반드시 .equals 로 해야 됨
		
		
//		간단한 사용법
		
		String id = "admin";
		String pw = "pass";
		
//		입력받은 id와 pw 가 각각 admin과 pass면 로그인
		if ("admin".equals(id) && "pass".equals(pw)) { //if = 조건문 ( 조건에 따라 작동) | && (AND) 조건 다 만족 애야함
			System.out.println("로그인 성공");		// 조건이 만족하면 실행
		}
		
		
		
		

	}

}
