String

1. str.toCharArray() : 문자열을 Char 배열로 변환
2. toLowerCase() / toUpperCase() : 소문자 및 대문자 변환
3. isLowerCase() / isUpperCase() : 이게 소문자냐? 대문자냐?
4. split() : 문자열을 특정한 기준으로 쪼갠다. ex) split(" ");
5. indexOf : 특정 문자 또는 문자열이 원래 문자열 내에서 처음으로 나타나는 인덱스 (위치) 를 반환
6. subString : 문자열의 특정 부분을 추출하여 새로운 문자열을 반환 / 주로 IndexOf랑 결합됨.

StringBuilder

1. String tmp = new StringBuilder(x);
2. StringBuilder(x).reverse().toString();