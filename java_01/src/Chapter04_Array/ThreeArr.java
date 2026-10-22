package Chapter04_Array;

public class ThreeArr {

	public static void main(String[] args) {
		
//		05. 3차 배열
		
		/*배열의 배치
		 * 1차 : column (index)
		 * 2차 : row , column
		 * 3차 : row , column , depth
		 */

//		royal 아파트는 4개층 5개호 방3개
		String[][][] royal = new String[4][5][3];
		System.out.println(royal.length+"층");
		System.out.println(royal[0].length+"호");
		System.out.println(royal[0][0].length+"방");
		
//		2층 3호 2번 방은 "철수의 방
		royal[2][3][2] = "철수의 방";
		
//		0층 0호 0번 방은 "영희의 방"
		royal[0][0][0] = "영희의 방";
		
//		data 가 없으면 표시되는 방식 = null
		System.out.println(royal[1][1][1]);
		
//		문제 : 나머지는 "공실" 로 표기
//		입력은 for 사용, 공실은 null 로 표시 -> 그럼 null 인 값에만 if 를 사용해서 "공실"로 대입한다.
//		사용 코드 : for , if
		for (int i = 0; i < royal.length; i++) { // row
			for (int j = 0; j < royal[i].length; j++) {	// column
				for (int j2 = 0; j2 < royal[i][j].length; j2++) {	// depth
//					System.out.println(royal[i][j][j2]); // 데이터 확인
					
					/*1. 논리 부정 사용 ( ! )
						철수의 방, 영희의 방 아니다.
					 * if (!royal[i][j][j2].equals("철수의 방")&&!royal[i][j][j2].equals("영희의 방")) {
					 *	철수,영희가 나오면 false / null 이면 true
					 * royal[i][j][j2] = "공실"; 
					 * }
					 */
					
//					2. null 의 데이터만 골라서 입력
					if (royal[i][j][j2]==null) {
						royal[i][j][j2] = "공실";  // <- 결과 값이 어떻게 나오는지 알고 있으면 이렇게도 가능
					}

				}
			}
		}
		
//		출력 층,호,방을 넣어서
		
		for (int i = 0; i < royal.length; i++) {
			for (int j = 0; j < royal[i].length; j++) {
				for (int j2 = 0; j2 < royal[i][j].length; j2++) {
					System.out.println(i+"층 "+j+"호 "+j2+"방 "+royal[i][j][j2]);
					
				}
			}
		}
		
	}

}
