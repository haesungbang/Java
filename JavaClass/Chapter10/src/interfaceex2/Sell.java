package interfaceex2;

public interface Sell {

	void sell();
	
	default void order() {
		System.out.println("매주문");
	}
}
