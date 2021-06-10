package ifexample;

public class SwitchCase2 {

	public static void main(String[] args) {

		int month = 10;
		int day;
		
		if(month == 2) {
			day = 28;
		}
		else if((month <= 7)&&(month % 2 == 1)) {
			day = 31;
		}
		else if(month >= 8 && month % 2 == 0) {
			day = 31;
		}
		else {
			day = 30;
		}
		System.out.println(day);
	}
}
