## 프로젝트 소개
Heroku를 통해 배포되어 Reminder 앱에서 호출될 Spring Boot REST API 입니다.  
개발 환경에서는 Docker를 통해 MySQL 8.0.28 컨테이너를 띄워 진행하였습니다.   

## API 명세서
# API 정의 (User & Email Service)
- 유저 ID 중복 확인 API

  |EndPoint|JSON|Query Param|Path Param|Response|  
  |---|---|---|---|---|
  |POST /users/check-email|{"userid":"iwantbaobab"}|||200|
