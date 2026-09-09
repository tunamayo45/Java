package Chapter01_basics;

public class Toaster {

//	간단한 method 사용 법

//	타입이 존재하지 않을 때 void(공허, 하무것도 없다.)
	
	public static void main(String[] args) {
		// toaster 라는 method를 호출하는 동시에 매개변수에 값을 전달 한다.
		// dish에 toaster 에 반환 값을 저장 한다
		String dish = toaster("빵");
		System.out.println(dish);
	}
	
//	↱꼭 써야 하지만 아직 모름			↱매개변수 타입, 이름
	static String toaster(String input) { // toaster 을 부른 곳에서 매개변수 보내오면 이 곳에 저장됨
		System.out.println(input + " 구워진다."); // 매변수를 가져와 사용
		return "구워진 "+ input;// method 를 부른 곳 에 반환값 전달.
	}
}
