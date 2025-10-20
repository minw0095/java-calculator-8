# java-calculator-precourse



* 구분자(Separator) 
  - 주어진 기본 구분자("," 와":")
  - 커스텀 구분자
    - 입력한 문자열 맨앞에 "//(?)\\\n"의 형태가 있는 지 확인
    - ex) //;\n1;2;3의 경우 ";"가 커스텀 구분자

​	



* 추출된 숫자들을 통해 계산(Calculator)

  - 구분자들을 통해 분리된 숫자들의 합을 구함

    

* 오류 발생(IllegalArgumentException)

  - 한 번에 여러 구분자들을 넣을 경우 오류 발생
    - ex) 1,,,,3
  - 양수가 아닌 수 혹은 문자를 넣을 경우 오류 발생
    - ex)1,3,!

  

  

  

src/main/java/calculator/Calculator.java