1. map.getOrDefault(x,0); : map에 x 값이 있다면, get으로 값을 가져오고, 없다면 0을 반환함.
2. for(char x : map.keySet()) : map에 존재하는 key값들을 다 탐색.
3. map.containsKey(); : 특정한 key 값이 존재하는지 true false로 판별
4. map.remove() : 키 삭제

TreeSet : 이진 트리 세트 : 중복 제거하면서 정렬까지 자동으로 함.
1. tset.first() : 첫 번째 값 반환
2. tset.last() : 마지막 값 반환