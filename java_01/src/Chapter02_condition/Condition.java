package Chapter02_condition;

public class Condition {

	public static void main(String[] args) {

//		조건문
		
		if (true) {
			System.out.println("조건이 참 일 경우만 실행");
		}
		
		if (false) { // Dead code 경고 바로 false를 쓰면 경고가 뜸
			System.out.println("조건이 false 경우 무조건 실행 되지 않는다.");
		}
		
		boolean a = true;
		boolean b = false;
		
		if (a) {
			System.out.println("a는 true 이므로 실행 된다.");
		}
		
		if (b) {
			System.out.println("b 는 false 이므로 실행 되지 않는다.");
		}

	}

}
