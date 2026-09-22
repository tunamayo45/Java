package Chapter03_condition;

public class Switch {

	public static void main(String[] args) {
		
//		빠르게 대응해야 할 때 주로 쓰인다.
//		하지만 switch 는 if 처럼 조건을 다루지 않는 한계가 있다.
//		switch 으로 찾으면 한번 빠르게 case 만 전부 훑고 일치하는 값을 찾아서 실행 / 하나하나 비교하는 if 와는 다르다. 
//		switch (값)  case 너야? 아니야! 패스 -> 너? 패스 ..
		
//		우리가 가지고 있는 음료수 : 콜라, 생수, 오렌지수즈, 사이다, 에너지음료, 냉커피, 식혜
		
		String item = "오렌지주스";
		
//		JDK1.7 이하에서는 switch 문에 수자, 문자만 사용이 가능 하다.
		switch (item) { 	//	switch는  코드블록을 시작부터 끝까지 읽게 되어있다.
		case "콜라":		//	case 문에서 특정 case 위치로 이동시켜 주지만 코드블럭 끝까지 가야 한다.
				System.out.println(item+"가 나왔습니다."); //	case에 값이 맞으면 실행문을 실행한다.ㄴ 
			break; 	/* 특정 case를 실행 이후 결과 값이 참일때 break 를 통해 해당 코드를 빠져나온다. 이게 없으면 코드 전채를 실행 시킨다.*/
		
		case "생수":
			System.out.println(item+"가 나왔습니다.");
			break;
			
		case "오렌지주스":
			System.out.println(item+"가 나왔습니다.");
			break;
			
		case "사이다":
			System.out.println(item+"가 나왔습니다.");
			break;
			
		case "에너지음료":
			System.out.println(item+"가 나왔습니다.");
			break;
			
		case "냉커피":
			System.out.println(item+"가 나왔습니다.");
			break;
			
		case "식혜":
			System.out.println(item+"가 나왔습니다.");
			break;

		default: // 맞는 조건이 없을때 실행 한다.
			System.out.println(item+"를 보유하지 않습니다.");
			break;
		}

	}

}
