package Chapter04_Array;

public class ArrayDefine {

	public static void main(String[] args) { //01
		
		//01 배열의 정의 
		
//		1. 선언과 동기에 값을 초기화
		int[] score = {12,13,14,15}; // 배열의 길이 : 4 , index : 0~3
		String[] names = {"홍길동","고길동","박길동"};
		
//		2. new 연산자를 이용하여 나중에 값 추가
		int[] scores;
		score = new int[] {1,2,3,4,5};
		
//		3.new 연잔자로 바로 배열 생성 ( 값 초기화 없이 길이만 먼저 지정 )
		int[] arr = new int[4]; // array 길이 : 4 , index : 0~3;
		arr[0] = 2; // 값을 대입하는 법
		

	}

}
