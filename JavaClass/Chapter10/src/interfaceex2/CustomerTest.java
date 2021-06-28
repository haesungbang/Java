package interfaceex2;

public class CustomerTest {

	public static void main(String[] args) {

		// Customer 일 때는 모든 것을 사용할 수 있다.
		Customer customer = new Customer();
		
		// 한정적으로 사용가능 얘는 buy 메서드만 사용가능
		Buy buyCustomer = customer;
		buyCustomer.buy();
		
		Sell seller = customer;
		seller.sell();
		
		// 모두 같은 게 불린다.
		// 이유는 인스턴스의 오버라이딩 된 메서드가 불리기 때문이다.
		customer.order();
		buyCustomer.order();
		seller.order();
		
	}

}
