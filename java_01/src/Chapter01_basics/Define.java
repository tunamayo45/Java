package Chapter01_basics; // 내가 지금 속한 패키지

public class Define { // class 선언부, class name

	public static void main(String[] args) { // 이 부분이 있어야 프로그램이 실행됨 (진입점)2
		
//		src : 소스파일
//		bin : 바이트코드파일
		
		/*	범위 주석 
		 * 여러 줄 주석
		 * 여러 줄 주석을 할 때 사용
		*/
		
		// 라인 주석
		
		//변수에 기본 타입 [변수 타입] [변수 이름] = [변수 안의 값];
		// ; <- 문장이 끝 났다는 뜻 ( 무조건 필수 )
		// 값을 저장할 때는 대입연산자 (=)를 사용
		
		/*논리*/
		boolean verBool = true;	// 논리 타입은 true,false 만 사용 가능
		
		/*문자*/
		String verStr = "문자열";	// 여러 글자 (더블 쿼터 ) ""	용량 큼 
		char verch = 's';				// 한글자 	   (싱글 쿼터)  ''
		
		/*정수*/
		byte verbyte = 1;			// 1byte = 8bit
		int verint = 10;				// 일반적인 정수 (10진수)
		long verlong = 10000000L; // 큰 정수 ( 뒤에 l,L 을 붙인다.) 용량 큼
		
		/*실수*/
		float verfloat = 3.14f;		// 뒤에 f,F를 붙여야 한다. (0.7자)
		double verdou = 3.141592; // 큰 실수 ( 일반적으로 소숫점 5자리 이상 ) (0.15자)
		
//		리터럴
//		소스코드에 직접 입력한 값, 프로그램 실행시 변하지 않는 고정값
		
//		정수 리터럴
		int base1 = 0b1011; // 2진수 표기 법
		
		int base2 = 01234567; //8진수 
		
		int base3 = 1234567890; // 10 진수 
		
		int base4 = 0x123ABC; //16진수 
		
		/*실수 리터럴*/
		double a = 3.141592; // 10 진수 
		
		double b = 5e2;   // 5 × 10² = 500.0 e,E 10의 지수 형태로 표현
		System.out.println(b);
		
 		
		
	}

}
