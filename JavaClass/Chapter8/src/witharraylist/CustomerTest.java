package witharraylist;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {

		ArrayList<Customer> customerList = new ArrayList<Customer>();
		
		
	    Customer customerLee = new Customer(10010, "이순신");
	    GoldCustomer customerShin = new GoldCustomer(10011, "신사임당");
	    GoldCustomer customerHong = new GoldCustomer(10012, "홍길동");
	    VIPCustomer customerKim = new VIPCustomer(10014, "김유신", 12345);
	    
	   customerList.add(customerLee);
	   customerList.add(customerShin);
	   customerList.add(customerHong);
	   customerList.add(customerKim);
	   
	   for(Customer customer : customerList) {
		   System.out.println(customer.showCustomerInfo());
	   }
	   
	   int price = 10000;
	   for(Customer customer : customerList) {
		   int cost = customer.calcPrice(price);
		   System.out.println(customer.getCustomerName() + "님이 " + cost + " 를 지불했습니다.");
	   }
	   
	}

}
