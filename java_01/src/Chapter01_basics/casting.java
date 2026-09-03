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
		
	}

}
