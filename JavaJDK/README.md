**1. toString()**

toString() 의 원형 : object.Book@16f65612
                             클래스이름 @ 해쉬코드

String 내에서 이미 toString 이 정의 되어있다.

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

