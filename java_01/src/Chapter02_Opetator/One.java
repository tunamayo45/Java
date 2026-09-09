package Chapter02_Opetator;

public class One {

	public static void main(String[] args) {
		
//		단항 연산자
		int x = 10;
		int y = 10;

//		x++;  	나중에 증가	코드가 실행되고 나서 +1
//		++x;		먼저 증가 		코드가 실행 될때 +1
		
		System.out.println("x = "+ x++);
		System.out.println("y = "+ ++y);
		
		x=1;
		y=1;
		
//		전위 증가 : 증가 후 사용 ( x가 먼저 증가)
		int result1 = (++x) + 10;
//		x 가 먼저 증가 -> 2+10
		
//		후위 증가 : 사용 후 증가 ( y가 나중에 증가 )
		int result2 = (y++) + 10;
//		y와 10을 더해서 11 -> 이후 y는 증가해서 2가 된다.
		
		System.out.println(result1);
//		++x : 증가한 내용을 이용해 다른행동을 할 때 사용
		
		System.out.println(result2);
//		y++ : 덤밸을 들고 나서 +1 -> 카운트에 주로 사용
		
		
//		반전연산 ( ! not ) true -> false 변환 ( 반대로도 가능 )
		boolean yn = true;
		System.out.println("yn = "+yn); //변환 X
		
		yn = !yn;
		System.out.println("yn = "+yn); //변환 O false
		
		yn = !yn;
		System.out.println("yn = "+yn); //변환 O true
		
	}

}
