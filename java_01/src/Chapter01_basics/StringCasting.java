package Chapter01_basics;

public class StringCasting {

	public static void main(String[] args) {
		
		/* 문자열 기본타입 변환
		 * 		문자열에 "1","14" 등의 숫자가 있다면 기본타입으로 변경이 가능하다
		 * 		단! 문자열에 "1a" 이런식으로 문자,특수 문자 등이 있다면 변경이 불가능 하다
		*/
		
		String val =  "12";
		
		byte byVal = Byte.parseByte(val);
		System.out.println(byVal);
		
		int inVal = Integer.parseInt(val);
		System.out.println(inVal);
		
		double doVal = Double.parseDouble(val);
		System.out.println(doVal);
		
		
//		이 반대의 경우도 가능하다.
		val = String.valueOf(43);
		System.out.println(val);
		
		
		val = String.valueOf(29.3);
		System.out.println(val);
		
		
	}

}
