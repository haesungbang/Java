package inheritance;

public class VIPCustomer extends Customer {
	
	private int agentID;
	private double saleRatio;
	
	public VIPCustomer(int customerID, String customerName, int agentID)
	{
	    // super(); 기본적으로 상위 클래스를 부른다.
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
		
//		System.out.println("VIPCustomer() 을 호출 ");

	}

	// 재정의 한다.
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public int getAgentID() {
		return agentID;
	}
}
