package Chapter01_basics;

public class casting { 

	public static void main(String[] args) {
			
		/* Casting
		 * 		변수를 변경 할 수 있다.
		 * 
		 * Promotion
		 * 		작은거 -> 큰거
		 * 		내가 다른 변수로 변경한다는 것을 알리지 않아도 됨
		 * 
		 * Casting
		 * 		큰거 -> 작은거
		 * 		내가 들어간다고 말해야 함
		 * 
		*/
		
//		변수 선언
		char chValue;
		int inValue;
		long loValue;
		float flValue;
		double doValue;
		
//		int < char
		inValue = 74;
		chValue = (char)inValue;  //강제 타입 변환
		System.out.println(chValue);

		loValue = 50000;
		doValue = 3.14;
		
//		long -> int
		inValue = (int)loValue;
		System.out.println(inValue);	
//		double -> float
		flValue = (float)doValue;
		System.out.println(flValue);
		
		/* 연산 자동 변환
		 * 		정수 타입 변수가 산술에서 피연산자로 사용되는 경우
		 * 		byte,char,short 타입 변수는 int 으로 promotion
		 * 
		 * 		double 도 같은 연산 과저을 거침
		*/
		
		inValue = chValue + 10;
		System.out.println(inValue);
		
		inValue = chValue + chValue;
		System.out.println(inValue);
		
		
		doValue = inValue + doValue;
		System.out.println(doValue);
		
		doValue = 1 / (double)2;			// 정수에서 실수 값을 구하고 싶다면 한쪽을 casting을 해 줘야 한다. 
		System.out.println(doValue);
		
		doValue = 1 / 2;
		System.out.println(doValue);
		
		
		/*연산자 문자열 자동 변환
		 * 		연산자는 피연산자가 모두 숫자 일 경우 덧셈 연산 수행
		 * 		연산자중 문자열이 있으면 문자열로 변환 후 문자열을 결합니다.
		 * 		+ 가 여러개 이면 순자적으로 덧셈을 하다 문자열을 만나는 순간 문자열로 변환이 된다.
		*/
		
		 inValue = 1+2;
		 System.out.println(inValue);
		 
		 String stValue= "1" + 1;
		 System.out.println(stValue);
		 
		 stValue = 1 + 1 + "1";
		 System.out.println(stValue);
		
		 
	}

}
