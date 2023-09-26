# Spring  Boot JPA 프로젝트
- java Persistence API Project
- Spring Boot 에서는 Spring DATA-JPA 프로젝트가 있다.
- ORM(Object-Relation Mapping) 방식의 DB 핸들링
- 기본 CRUD 는 SQL 을 거의 사용 하지 않고, DB의 Table 생성 부터 적용할수 있다
- Java 의 DTO(VO) 데이터 클래스에 `@Entity`, `@Table`을 설정 하므로서 Java 데이터 클래스가
- 자동으로 Table 을 생성하게 할 수 있다
- 또한 각 속성변수에는 여러가지 Annotation 들을 부착하여 DB 핸들링을 할수 있다