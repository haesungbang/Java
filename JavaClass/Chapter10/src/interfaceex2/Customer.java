package interfaceex2;

public class Customer implements Sell, Buy {

	@Override
	public void buy() {
		System.out.println("산다.");
	}

	@Override
	public void sell() {
		System.out.println("판다.");
		
	}

	@Override
	public void order() {
		// TODO Auto-generated method stub
		System.out.println("고객 판매 주문");
	}

}
