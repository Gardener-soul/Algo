String

1. str.toCharArray() : 문자열을 Char 배열로 변환
2. toLowerCase() / toUpperCase() : 소문자 및 대문자 변환
3. isLowerCase() / isUpperCase() : 이게 소문자냐? 대문자냐?
4. split() : 문자열을 특정한 기준으로 쪼갠다. ex) split(" ");
5. indexOf : 특정 문자 또는 문자열이 원래 문자열 내에서 처음으로 나타나는 인덱스 (위치) 를 반환
6. subString : 문자열의 특정 부분을 추출하여 새로운 문자열을 반환 / 주로 IndexOf랑 결합됨.
7. String tmp = Stringt.valueOf(s); / ValueOf : String화 시켜줌.
8. Character.isAlphabetic() : ()가 알파벳인가? 
9. equals / equalsIgnoreCase() : 대소문자 구분 없이 일치한지
10. isDigit() : 이거 숫자냐? 
11. Integer.parseInt(tmp, 2) : tmp가 2진수일 때, 10진수로 바꿔 줌 ㄷㄷ

StringBuilder

1. String tmp = new StringBuilder(x);
2. StringBuilder(x).reverse().toString();