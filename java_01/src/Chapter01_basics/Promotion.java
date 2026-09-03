package Chapter01_basics;

public class Promotion { //class 선언부, clsaa name

	public static void main(String[] args) { //main method 선언부 ,진입점
		
//		작은거에서 큰 걸로 갈때는 묵시적 형변환 ( Promotion) 이 된다.
		
		byte byvalue;
		char chvalue = 'a';
		int inValue = 0;
		long loValue;
		float flValue = 0.1f;
		double doValue;
		
//	 	기본 허용범위 크기 : byte < short < int < long < float < double
		
//		byte < int
		byvalue = 10;
		inValue = byvalue;
		System.out.println(inValue);

//		char < int
		inValue = chvalue;
		System.out.println(inValue); //97 -> ASCII CODE 
//		숫자에서 문자로는 promotion 은 안된다
//		char에는 음수가 없고 int에는 음수가 있어서 서로의 범위가 다르다.
		
//		int < long
		loValue = inValue;
		System.out.println(loValue);
		
//		float < double
		doValue = flValue;
		System.out.println(doValue);
		

	}

}
