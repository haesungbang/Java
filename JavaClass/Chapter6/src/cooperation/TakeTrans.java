package cooperation;

public class TakeTrans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student james = new Student("James", 5000);
		Student thomas = new Student("Thomas", 8000);
		
		Bus bus100 = new Bus(100);
		james.takeBus(bus100);
		james.showInfo();
		bus100.showInfo();
		
		Subway subwayGreen = new Subway(2);
		thomas.takeSubway(subwayGreen);
		thomas.showInfo();
		subwayGreen.showInfo();
	}

}
