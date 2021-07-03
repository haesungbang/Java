package classex;

public class ClassTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		// TODO Auto-generated method stub

		Person person = new Person();
		
		// .getClass()object 의 메서
		Class pClass1 = person.getClass();
		System.out.println(pClass1.getName());
		
		Class pClass2 = Person.class;
		System.out.println(pClass2.getName());
		
		// forName 은 "" 안에 클래스를 Class 클래스에 가져온다.
		Class pClass3 = Class.forName("classex.Person");
		System.out.println(pClass3.getName());
		
		Class pClass = Class.forName("classex.Person");
		
		// newInstance 는 기본 Constructor 가 불린다.뭐 이런게 있다.
		Person p2 = (Person)pClass.newInstance();
		System.out.println(p2);

	}

}
