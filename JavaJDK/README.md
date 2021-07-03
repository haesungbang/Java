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



