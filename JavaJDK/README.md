## 기본 클래스

**1. toString()**

toString() 의 원형 : object.Book@16f65612
                             클래스이름 @ 해쉬코드

String 내에서 이미 toString 이 정의 되어있다.

객체가 가지고 있는 정보나 값들을 문자열로 만들어 리턴하는 메서드.

**2. equals()**

== : 인스턴스가 같다는 것은 원래 힙메모리 주소가 같아야 같은 것.
논리적인 동일성을 보여줄 때 사용한다. 기본적으로 String 과 Integer 비교해주는 듯
이 외에는 equals 를 재정의 해줘야한다.

**3. hashCode**

hash: 정보를 저장, 검색 등을 하는 자료구조
검색을 위한 최적의 자료구조
haschCode: 힙 메모리의 주소를 반환한다. JVM 에서 hash 방식으로 관리해서 hashCode

Index = hash(key)
저장 위치 = 해시함수(객체정보)

equals() 를 재정의해서 논리적으로 같으면 hashCode() 도 같은 값을 갖는게 기본
String 과 Integer 는 hashCode() 가 재정의 되어있다.

**4. clone()**

객체의 원본을 복제하는데 사용하는 메서드
원본을 유지해놓고 복사본을 사용할 때
implements Cloneable 선언을 해줘야한다.

**5. String**

선언하는 두 가지 방법

1. String str1 = new String("abc") // 힙 메모리에 생성
2. String str2 = "test" // 상수풀에 생성(constant pool)
3. 만약 String str3 = "test" 일 경우, str2  와 같은 것을 가리킨다.

1번 의 경우,  value 가 final 로 되어있어서, 바꿀 수 없다.
따라서, str1 = str1.concat(str2) 의 값은 새로운 메모리 주소에 저장되고, garbage 가 생성된다.
=> 이를 해결하기 위해서 StringBuffer, StringBuilder 를 사용

Buffer, builder 는 배열에 추가하는 느낌 인 것 같다.

**6. Class**

일반적으로 자료형을 알 수 없는 경우에 사용한다.
String 과 같은 것은 이미 우리가 정보를 알고 있다.
클래스 정보를 모른 경우 Class 를 활용해서 정보를 알아올 수 있다.

.getClass() : 이미 인스턴스 생성된 것을 가져올 때.
**.forName()** : 문자열 안에 클래스가 있으면 그 클래스를 로딩을 시킨다. **중요**
=> 동적으로 로딩하는 느낌, 유용하게 쓰일 수 있다.
어떤 클래스를 사용할 지 모를 때, 변수로 처리하고 실행될 때,  실행될 수 있도록
Constructor, Method 등 java.lang.reflect 패키지에 있는 클래스들을 활용하여 프로그래밍

---

## 컬렉션 프레임워크

**제너릭 프로그래밍**

변수의 선언이나 메서드의 매개변수를 하나의 참조 자료형이 아닌 여러 자료형으로 변환될 수 있도록 프로그래밍 하는 방식

public class TreeDPrinter<T> {} 

**Collection** : 하나의 데이터를 Handling

- List : 순서가 있는 자료구조
  - ArrayList
  - Vector : 동기화를 지원한다
  - LinkedList
- Set : 중복되는 요소, 순서가 없다. 보통 유일한 데이터를 많이 관리(ID, 사번, 학번 등)
  - HashSet
  - TreeSet
- Collection 관련 메서드
  - add()
  - clear()
  - remove() : python 과 달리 index 로 -1 을 못 가진다.
  - size()
  - iterator() : 순회를 할 때 사용한다. set 같은 것은 순회가 없기 때문에 사용
    Iterator<Member> iterator = arrayList.iterator();

**Map** : 쌍으로 데이터를 관리할 때(Python Dictionary 와 비슷하다.)
Key 가 되는 객체의 유일성함을 알기 위해 equals() 와 hashCode() 재정의해야한다.

- HashTable : 동기화 지원
- **HashMap** : 많이 쓴다. map 중에서도 가장 많이 쓴다. 동기화 지원 X
  넣을 때는 put(), 꺼낼 때는 get()
- TreeMap: 정렬이 되어있다? Integer 가 Comparable 이 구현되어 있다. 바꾸고 싶으면
                  Comparator 사용
                  

프로세스에 올라간 것을 Cpu로 보내는 것을 쓰레드? 여러개면 멀티쓰레드
lock 을 활용해서, 동기화(synchronized) 를 통해 오류가 안 생기게 한다. 

---

## 자료구조 + 알고리즘

**Array**: 같은 형의 데이터 타입을 메모리에 저장하는 선형적 자료구조
기본적으로 fixed length, 처음 설정한 크기의 크기를 가진다.
장점: 인덱스 연산이 빠르다 **a[2]** O(1)
단점: 비어있는 공간이 없다. 따라서 하나를 사이에 넣고 싶으면 뒤에 것을 다 미루고 넣는다...
        insert, delete O(n) 이 많은 작업이 수행된다...

**Linked List** : 배열의 단점을 보완했다? Data+다음 데이터 링크?
물리적인 위치와 논리적인 위치가 다를 수 있다. 
배열의 요소가 많이 변한다.
장점: insert, delete 의 장점이 있다. Array 보다 훨씬 빠르다.
단점: 인덱스 연산이 빠르게 안 되고,  무조건 앞에서 부터 찾아야한다.

**Stack** : LIFO
push() 넣는다. -> pop() 꺼낸다.
peek() 은 꺼내는게 아니라 걔가 무엇인지를 확인만.

**Queue** : FIFO
enqueue() 넣는다. -> dequeue() 뺀다.

**ArrayList** 로 stack 과 queue 구현 가능
add() 하면 뒤로 들어간다.
remove() 꺼낸다. 
remove(0) 앞에서 꺼낸다: queue 
remove(-1) 뒤에서 꺼낸다: stack

**Tree** : BST(Binary Search Tree)
검색에 사용하기 좋다.
중복허용 X
트리순회 방법: (중위)inorder, (전위)preorder, (후위)postorder
**TreeSet**: 객체의 정렬에 사용되는 클래스로, 중복을 허용하지 않는 BST로 구현
비교를 위해서 Comparable, Comparator 를 구현해야한다.
둘 중 하나만 구현하면 된다.
Comparable 로 구현하고, 뒤에 다른 것과 비교해서 하고 싶을 때 Comparator 를 사용??

**Hashing** : 검색을 위한 자료구조
hashtable, key, hash function 으로 구성.
JVM 이 인스턴스를 관리하는 방식이 hashing 방식
index = h(key)
O(1)

복습완료 



