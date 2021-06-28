package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		

		// 추상클래스는 인스턴스 생성이 안 된다.
//		Computer c1 = new Computer();
		Computer c2 = new DeskTop();
//		Computer c3 = new NoteBook();
		
		// aaa 가 안 보인다.
		// Computer 의 메서드만 보인다.
//		Computer c4 = new MyNoteBook();
		
		// NoteBook 의 메서드가 보인다.
		NoteBook c4 = new MyNoteBook();
	
		c4.aaa();
		c4.display();
		
		c2.display();
		c2.turnOn();
		// 오버라이딩 메서드가 불린다.
		
		
	}

}
