package Chapter02_condition;

public class ElseIf {

	public static void main(String[] args) {
		
//		Else If 
//		를 사용해서 여러 조건을 비교할 수 있다.
		
//		우리가 가지고 있는 음료수 : 콜라, 생수, 오렌지주스, 사이다, 에너지음료,냉커피, 식혜
		String item = "캔커피";
		
		/*문제
		 * item이 가지고 잇는 음료 출력
		 * 사용코드 : if, else if, .equals
		 * 문제 풀이 : 다 하나하나 비교한다.
		 * */
		
		if ("콜라".equals(item)) {
			System.out.println(item+"가 나왔습니다.");
		}else if("생수".equals(item)){
			System.out.println(item+"가 나왔습니다.");
		}else if("오렌지주스".equals(item)){
			System.out.println(item+"가 나왔습니다.");
		}else if("사이다".equals(item)){
			System.out.println(item+"가 나왔습니다.");
		} else if("에너지음료".equals(item)){
			System.out.println(item+"가 나왔습니다.");
		}else if("냉커피".equals(item)){
			System.out.println(item+"가 나왔습니다.");
		}else if("식혜".equals(item)){
			System.out.println(item+"가 나왔습니다.");
		}else {
			System.out.println(item+"은 보유하고 있지 않습니다.");
		}
//		else if를 통해 이전 조건이 아니면 다른 조건을 실행 시킨다.
			

	}

}
