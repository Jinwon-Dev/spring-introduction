# spring-introduction
스프링 프레임워크의 기초에 대해 학습한 내용을 기록합니다.

강의는 [인프런 - 스프링 입문(김영한)](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-%EC%9E%85%EB%AC%B8-%EC%8A%A4%ED%94%84%EB%A7%81%EB%B6%80%ED%8A%B8#curriculum)을 수강하고, 정리한 내용은 [개인 노션 링크](https://jinwonyoon.notion.site/MVC-DB-47075201e4dd4bfda6a4f29b9da3d6a8)에 저장합니다.

---

## [회원 관리 예제]

### ? 비즈니스 요구사항
- 데이터: 회원ID, 이름
- 기능: 회원 등록, 조회
- 아직 데이터 저장소가 선정되지 않음(가상의 시나리오)

</br>

### ? 클래스 의존관계
<img width="465" alt="?????????? 2022-11-10 ???? 10 22 32" src="https://user-images.githubusercontent.com/106216912/201103257-4dd0839b-da25-4767-bc10-9c44c2c4ac14.png">

- 아직 데이터 저장소가 선정되지 않아서, 우선 인터페이스로 구현 클래스를 변경할 수 있도록 설계
- 데이터 저장소는 RDB, NoSQL 등등 다양한 저장소를 고민중인 상황으로 가정
- 개발을 진행하기 위해서 초기 개발 단계에서는 구현체로 가벼운 메모리 기반의 데이터 저장소 사용