package Chapter02_condition;

public class If {

	public static void main(String[] args) {
		
//		if 조건문
		
		System.out.println("가게에 간다");
		
		int tofubox = 20;
		
		if (tofubox > 0) { // 조건 문으로 두부가 0가 보다 많으면 {}가 실행된다.
			System.out.println("두부를 산다.");
			tofubox--;
			System.out.println("남아있는 두부 : "+tofubox);
		}
		
		System.out.println("집에온다");

	}

}
