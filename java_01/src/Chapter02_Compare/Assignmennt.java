package Chapter02_Compare;

public class Assignmennt { //class 선언부 , class name

	public static void main(String[] args) {
		
//		복합대입 연산자
//		자기 자신에 특정 숫자를 연산 할때 사용한다.
		
		int result = 0;
		
//		result = result + 10;
		result +=10;
		System.out.println(result);
		
//		result = result - 5
		result -=5;
		System.out.println(result);

//		result = result * 2
		result *= 2;
		System.out.println(result);
		
//		result = result / 2
		result /=2;
		System.out.println(result);
		
//		result = result % 2
		result %=2;
		System.out.println(result);
		
		
//		응용
		String str = "a";
		str +="b";
		str +="c";
		str +="d";
		str +="e";
		System.out.println(str);
		
		int num = 1;
		num +=2;
		num +=3;
		System.out.println(num);
		
	}

}
