package Chapter04_Array;

public class ForEach {

	public static void main(String[] args) {
		
//		05. 향상된 for
		
		int[] scores = {10,20,30,40,50};
		
//		데이터를 빼는 법
		
//		일반 for
		/* 수동으로 세세한 조작이 가능 하다.
		 * 단점 : 처음부터 끝까지 빠르게 빼올 수가 없다
		*/
		for (int i = 0; i < scores.length; i++) {
			System.out.println(i+" : "+scores[i]);
		}
		
		
//		향상된 for
		/*scores에 있는 데이터를 처음부터 끝까지 i에 저장한다.
		 * 거의 읽기 전용에 가깝다.
		 * 단점 : 세세한 조작이 불가능 하다.(index를 직접 제어하기 어렵다.)
		*/
		for (int i : scores) { // scores에 있는 데이터가 있는 한 계속 반복해서 scores의 각 요소를 순서대로 i에 전달한다.
			System.out.println(i);
		}
		
		/*  
		 * 	i는 index 값이 아니라 배열 요소의 값을 복사해서 받은 변수다.
		 * 따라서 scores[i]로 접근하면 의도한 결과가 나오지 않을 수 있다.
		*/

	}

}
