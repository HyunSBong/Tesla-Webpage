# Tesla-webpage with Spring boot

스프링 부트를 이용하여 테슬라 웹 페이지의 모든 서비스를 구현하는 프로젝트입니다.

현재는 간단한 CRUD 컨트롤러와 요청/응답 받는 프론트 페이지가 Thymeleaf 와 순수 CSS,JS로 구현되어있습니다. 지속적으로 업데이트 될 예정이며 프론트도 프레임워크를 이용하여 전환될 예정에 있습니다.

![](https://user-images.githubusercontent.com/69189272/118437825-40dc1880-b71e-11eb-9351-3dd22e099292.png)![](https://user-images.githubusercontent.com/69189272/118437835-446f9f80-b71e-11eb-8f94-19678b51c678.png)


## 의존성 및 버전 정보
- Back-end : SpringBoot 2.2.5

- Template engine : Thymeleaf

- Database : H2 Database

- Project : Gradle

- IDE : IntelliJ IDEA, VS Code

- Dependencies : Spring Web, Spring Security, Lombok, H2 Database, Spring Data JPA, MySQL Driver...

  그 외 명시하지 않은 의존성들은 gradle에 명시되었거나 SpringBoot 프로젝트의 자동 설정을 따릅니다.

## 실행

```bash
git clone https://github.com/HyunSBong/Tesla-webpage
```

이프로젝트에 사용된 데이터베이스는 H2입니다. 사용법을 아신다면 properties에 경로를 추가해주시면됩니다. 

```bash
반드시 h2.sh 실행 후 Application Run 을 하셔야 오류가 없습니다.
```

## TO-DO list

앞으로 추가될 개발 리스트...

### UX/UI
- [ ] 메인 page에서 보이는 모델명(Model Y 등)의 페이지 이동에 따른 모델명 변화 
- [ ] NavBar의 유동적 변화 추가 (hover 시)
- [ ] 상품 상세 페이지의 애니메이션 추가

### 기능 
- [ ] 관리자 로그인으로 상품 조회 및 추가 
- [ ] Security 로 로그인 프로세스 강화
- [ ] 국가 설정에 따른 언어 변경 
- [ ] 장바구니 

### 퍼포먼스, DB
- [ ] 프론트 프레임워크 전환 (미정)
- [ ] H2 -> MySQL 로 전환
- [ ] ManyToMany 설정 제거 및 관계도 최적화

### 배포
- [ ] AWS 또는 Naver Cloud 로 페이지 배포
