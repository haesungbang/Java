클래스와 객체

시간 순서대로: 절차지향 프로그래밍

객체 지향 프로그래밍: 객체를 기반으로 하는 프로그래밍
시간, 순서가 중요한 것보다 대상이 중요하다.

객체를 정의, 기능구현, 객체사이의 협력 구현

클래스란: 객체에 대한 속성과 기능을 코드로 구현, 클래스를 정의한다 라고 한다.(청사진)
객체의 속성: 특성, 속성, 멤버 변수(property, attribure, member variable) 3 다 똑같은 의미?
객체의 기능: method 

class 는 대부분 대문자로 시작.
하나의 자바 파일에는 클래스를 하나 두는 것이 원칙, 여러 개의 클래스가 있는 경우 public 클래스는 단 하나. public 클래스와 자바 파일의 이름은 동일해야한다.

---

메서드: 함수의 일종(클래스 내부에 구현되는 함수)

반환형 함수이름(변수) {
return
}

Return 이 없으면 void

클래스(static 코드) - > 인스턴스(dynamic memory)
Student studentA = new Student();

생성된 인스턴스는 힙메모리에 생성된다. 가비지 콜렉터에 의해서 제거된다. 스택은 함수가 끝나면

classpart.Student@156643d4 이런식으로 주소값을 가지고 힙메모리에 저장.

new Student() 에서 Student() 는 생성자라고 한다. 클래스와 이름이 똑같아야된다.
내가 처음이 객체를 생성하면서 하고싶은 것을 구현한다.
하나의 클래스에 여러 개의 생성자가 있을 수 있다.

---

클래스와 객체2

객체를 어떻게 사용할 것인지? static, this에 대해서도 공부한다.

**this**
자신의 메모리를 가리킨다.
생성자에서 다른 생성자를 호출
자신의 주소를 반환

**객체간의 협력**
cooperation package 확인

---

클래스와 객체 2(2)

**static 변수**

인스턴스가 공유하는 값을 static 으로 선언을 한다.
static 은 인스턴스와 달리 힙메모리에 저장이 아니라, Data? 에 저장.
new 에서 할당되는게 아니라, 전체 프로그램이 로드될 때 할당된다.(상수, static 등)

static 변수는 인스턴스의 참조변수로 잘 쓰지 않는다.
클래스에서 가져온다,

singleton 패턴
java 는 글로벌 변수가 없다.
singleton 패턴이 정확히 무엇인가? 용도는?

 한번의 객체 생성으로 재 사용이 가능하기 때문에 메모리 낭비를 방지할 수 있다. 또한 **싱글톤**으로 생성된 객체는 무조건 한번 생성으로 전역성을 띄기에 다른 객체와 공유가 용이하다

---

배열과 ArrayList

배열은 fixed length 이고 연속된 자료이다. 하나 없어지면 앞으로 다 땡겨준다.

**기본 array**
Int[] arr = new int[10];
자료형[] 배열이름 = new 자료형[개수]
char
double

초기화 값은 int 의 경우 0, double 의 경우 0.0

**객체의 array**

Book[] library = new Book[]
공간만 만들어 준다.
각각의 공간에 인스턴스를 생성해야된다.

**배열 복사하기**

System.arraycopy(복사할 배열, 복사할 첫 위치, 대상 배열, 붙여넣을 첫 위치, 복사할 개수)
객체의 경우, 하나를 바꾸면 둘다 변경이 일어난다
주소를 복사하는 것이기 때문이다.

위와 같이 하기 싫은 경우는 어떻게 해야될까? 인스턴스를 다시 생성해야된다.

```java
    Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥1", "조정래");
		bookArray1[1] = new Book("태백산맥2", "조정래");
		bookArray1[2] = new Book("태백산맥3", "조정래");
		
		bookArray2[0] = new Book();
		bookArray2[1] = new Book();
		bookArray2[2] = new Book();
		
//		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
//    이거는 주소를 복사한다.
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray2[i].setBookName(bookArray1[i].getBookName());
			bookArray2[i].setAuthor(bookArray1[i].getAuthor());
		}
		
		// 둘 다 바뀐다.
		// 이유는 복사하는게 주소가 복사되는 것이기 때문에, 힙메모리가 바뀌면 같이 바뀐다.
    // 인스턴스를 새로 만들고 할 경우, 따로따로가 된다.
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		
		for(int i = 0; i<bookArray1.length; i++) {
			bookArray1[i].showInfo();
		}
		
		for(int i = 0; i<bookArray2.length; i++) {
			bookArray2[i].showInfo();
		}
```



**향상된 for 문**

```java
// 향상된 for 
	    String[] strArr = {"Java", "Android", "C"};
	   
	    // 처음부터 끝까지 다 돌 것 이라면!
	    for(String s : strArr) {
	    	System.out.println(s);
	    }
	    
	    int[] numbers = {1, 2, 3, 4, 5};
	    for(int i : numbers) {
	    	System.out.println(i);
	    }
```



**다차원 배열** : 2차원 이상의 배열

**ArrayList 클래스** : 기존 배열은 길이가 정해져있기 때문에 늘어나면 복사하는 코드를 직접구현해야한다.
							 이러한 것들을 쉽게 해주는 것을 제공해준다.

주요 메서드: add, size, get, remove, isEmpty
arrayList 에서는 index 를 제공하지 않는다. list[0] 불가능!
ArrayList<어떤 객체(타입)> 쓰지 않으면 object 로 저장된다. : 요즘에는 쓰이지 않는다.

Chapter7 Student, Subject, StudentTest ( 보기 )

 **디버깅** : 벌레 클릭

---

**상속과 다형성** : 상속을 통해 다형성을 구현할 수 있다.

자바는 single inheritance 만을 지원한다.

class Mamma{}
class Human extends Mamma{} // 상속 받았다.

상속은 일반적인 것과 구체적인 관계에서만 사용: point 랑 circle 는 사용 x

private, protected 차이?? : protected 는 외부는 private 상속에서는 public
protected 는 같은 패키지에서도 보인다.

class 를 짰는데 메서드안에 if else 가 너무 많으면 잘못 작성한 것, 상속을 사용해야된다.

VIP 와 SILVER 회원의 분리

<<<<<<< HEAD
상속을 활용한 클래스 구현.

Java JDK 거의 다왔다...

=======
상속을 활용한 클래스 구현