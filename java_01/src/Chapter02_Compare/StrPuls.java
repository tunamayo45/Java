package Chapter02_Compare;

public class StrPuls { //class 선언부, class name

	public static void main(String[] args) {
		
//		문자열 Plus
//		연산자가 문자열( ' '," " )과 만나면 더하기(Plus)가 아니라 추가(add)가 된다.
//		피연산자가 모두 숫자일 경우 뎃셈 연산
		
		String str = "JDK"+1+2.3;
		System.out.println(str);
		
		str = 1+2.4+"JDK";
		System.out.println(str);
		
		str = ""+1+23.4+"JDK";
		System.out.println(str);

	}

}
