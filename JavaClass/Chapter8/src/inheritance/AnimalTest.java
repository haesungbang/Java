package inheritance;

import java.util.ArrayList;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal {
	public void move() {
		System.out.println("사람이 두 발로 움직입니다.");
	}
	
    public void readBook() {
    	System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
	public void move() {
		System.out.println("호랑이가 네 발로 움직입니다.");
	}
	
	public void hunting() {
		System.out.println("호랑이는 사냥을 합니다.");
	}
}

class Eagle extends Animal {
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
}

public class AnimalTest {

	public static void main(String[] args) {
		AnimalTest test = new AnimalTest();
		test.moveAnimal(new Human());
		test.moveAnimal(new Tiger());
//		test.moveAnimal(new Eagle());
//		Animal animal = new Human();
		
		Animal[] animalList = new Animal[3];
		animalList[0] = new Human();
		
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Tiger());
	}
	
	public void moveAnimal(Animal animal) {
		animal.move();
		
		if(animal instanceof Human) {
			Human human = (Human)animal;
			human.readBook();
		}
		
		else if(animal instanceof Tiger) {
			Tiger tiger = (Tiger)animal;
			tiger.hunting();
		}
		
		else {
			System.out.println("지원되지 않는 기능입니다.");
		}
	}

}
