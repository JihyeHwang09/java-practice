#  Map 컬렉션(Map<K, V>)
- Map 컬렉션은 **`키(key)`와 `값(value)`으로 구성된 객체를 저장하는 구조**를 갖는다. 
- **`키`는 중복으로 저장할 수 없고**, 값은 중복으로 저장할 수 있다.
- (**동일한 key로 값을 추가하면 기존 key에 해당하는 값은 제거된다.**) 
- 따라서, Map 컬렉션은 `키(key)`로 데이터를 관리한다. 
- Map 컬렉션을 구현하는 대표적인 클래스의 종류: HashMap, Hashtable, LinkedHashMap, TreeMap 등이 있다.
- 공통적으로 사용되는 주요 메서드들은 put, get, remove, keySet 등이 있다.
| 리턴타입 | 메서드 | 내용  |
|---|---|---|
| V |  put(K key, V value) | 키(key)와 값(value) 추가  |
| V |  get(Object key) | 지정된 키(key)값 리턴  |
| V |  remove(Object key) |  키(key)값에 해당되는 데이터 삭제 |
| Set<K>  | keySet()  | 저장된 모든 키(key) 리턴 |
| Set<Map.Entry<K, V>>  | entrySet()  | 저장된 모든 키(key)와 값(value) 리턴  |
| boolean |  containsKey(Object key) | 해당 키(key) 지정 여부 확인  |
| boolean  | containsValue(Object value)  | 해당 값(value) 지정 여부 확인  |
| int  | size()  | 저장된 키(key)의 개수 리턴 |
| void  | clear()  | 저장된 모든 키(key)와 값(value) 삭제 |
| boolean | isEmpty()  | 컬렉션이 비었는지 확인 |

 K와 V는 제네릭으로 `K`는 key 타입, `V`는 value 타입을 의미한다.
 K와 V는 기본 자료형(int, double, boolean 등)은 사용할 수 없고, 클래스나 인터페이스 타입만 사용이 가능하다.
 Map에 저장된 값을 가져오기 위해서는 get 메서드로 key 값을 입력하여 하나씩 가져오거나, 
 keySet 및 entrySet 메서드를 이용하여 Set 컬렉션에 key 및 value를 저장하여 반복문을 통해 가져올 수 있다. 

## HashMap
- HashMap은 Map 컬렉션의 대표적인 구현 클래스이다. 
- HashMap을 생성하는 방법
```java
Map<K, V> map = new HashMap<K, V>(); // K는 키 타입, V는 값 타입을 나타내는 제네릭
```
---
## Hashtable
- `Hashtable`은 HashMap과 동일한 사용법을 갖는다.
- 차이점: `Hashtable`은 **동기화(synchronization)를 보장**한다. 
- 따라서 **멀티** 스레드에서는 `Hashtable`을 사용해야 하고,
 **단일** 스레드에서는 `HashMap`을 사용하는 게 유리하다.
- Hashtable을 생성하는 방법
```java
Map<K, V> map = new Hashtable<K, V>(); // K는 키 타입, V는 값 타입 제네릭
```
  

