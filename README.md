# spring-introduction
스프링 프레임워크의 기초에 대해 학습한 내용을 기록합니다.

강의는 [인프런 - 스프링 입문(김영한)](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8#curriculum)을 수강하고, 정리한 내용은 [개인 노션 링크](https://jinwonyoon.notion.site/MVC-DB-47075201e4dd4bfda6a4f29b9da3d6a8)에 저장합니다.

---

## [회원 관리 예제]

### ? 비즈니스 요구사항
- 데이터: 회원ID, 이름
- 기능: 회원 등록, 조회
- h2 데이터베이스 사용

</br>

### ? 클래스 의존관계
<img width="458" alt="image" src="https://user-images.githubusercontent.com/106216912/201868506-312898f9-90f0-49f9-97ba-f73f51e88a52.png">


- 스프링의 DI (Dependencies Injection)을 사용하여 기존 코드를 손대지 않고, 설정만으로 구현 클래스를 변경
- 데이터 저장소는 [h2 데이터베이스](https://www.h2database.com/html/main.html)를 사용한다.
- 내부 메모리를 사용해 데이터를 저장하지 않고, DB를 이용해 데이터를 저장한다.