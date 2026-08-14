package Chapter01_basics; // 내가 지금 속한 패키지

public class Define { // package name

	public static void main(String[] args) { // 이 부분이 있어야 프로그램이 실행됨
		
//		src : 소스파일
//		bin : 바이트코드파일
		
		/*
		 * 여러 줄 주석
		 * 여러 줄 주석을 할 때 사용
		*/
		
		//변수에 기본 타입 [변수 타입] [변수 이름] = [변수 안의 값];
		// ; <- 문장이 끝 났다는 뜻 ( 무조건 필수 )
		
		/*논리*/
		boolean verBool = true;	// 논리 타입은 true,false 만 사용 가능
		
		/*문자*/
		String verStr = "문자열";	// 여러 글자 (더블 쿼터 ) ""	용량 큼 
		char verch = 's';				// 한글자 	   (싱글 쿼터)  ''
		
		/*정수*/
		int verint = 10;				// 일반적인 정수 (10진수)
		long verlong = 10000000L; // 큰 정수 ( 뒤에 l,L 을 붙인다.) 요량 큼
		
		
		
	}

}
