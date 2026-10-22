package Chapter04_Array;

public class TwoArr {

	public static void main(String[] args) {
		
//		04. 2차 배열
		
//		arr 아파트 2층, 3개 호를 가지고 있다.
		
//		배열 표기 차의
//		int[] arr, int arr[] : 기능적으로 완전히 동일하다. = 표기 방식에서만 차의가 있다.
		
		
//		2차 배열 선언 하는 법
//		int[][] arr = {{00,01,02,03},{10,11,12,13}};
//		이런 식이면 가독성이 떨어진다.
		
		// int [row] [column]
		int[][] arr = { // 다 차원은 이런 식으로 적어야 보기 편함
				{00,01,02,03} //row
				,{10,11,12,13} //row
		};
		
		
//		royal 아파트는 4층 5개호가 있다.
		String[][] royal = new String[4][5];
		royal[0][0] = "0층 0호"; // 이러면 data를 총 20번을 입력해야 된다.
		
//		문제 : 자동으로 값을 다 넣어라 (2중 for)
		for (int i = 0; i < royal.length; i++) { // row 의 index를 결정하는 for
			for (int j = 0; j < royal[i].length; j++) { // column 의 index를 결정하는 for
				//royal[i].length 는 i번째 row 에 column의 배열 길이를 반환 한다.
				royal[i][j] = i+" 층 "+j+" 호";
				System.out.println(royal[i][j]);
			}
		}
		
	}

}
