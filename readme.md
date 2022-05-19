## 프로젝트 소개
Heroku를 통해 배포되어 Reminder 앱에서 호출될 Spring Boot REST API 입니다.  
개발 환경에서는 Docker를 통해 MySQL 8.0.28 컨테이너를 띄워 진행하였습니다.   
  

## API 명세서 (Quiz Service)
- 퀴즈 추가 API  
  |EndPoint|JSON|Query Param|Path Param|Response|  
  |---|---|---|---|---|
  |POST /quiz/add|{"word":"apple", "mean":"사과"}|||200|
    
    
- 퀴즈 삭제 API  
  |EndPoint|JSON|Query Param|Path Param|Response|  
  |---|---|---|---|---|
  |POST /quiz/del|{"word":"apple"}|||200|


- 퀴즈 수정 API  
  |EndPoint|JSON|Query Param|Path Param|Response|  
  |---|---|---|---|---|
  |POST /quiz/update|{"word":"apple", "mean":"애플"}|||200|


- 시간공간별 퀴즈 가져오기 API  
  - quizSpace를 기준으로 학습 공간이 1~5(시간별)로 구분된다.
  - 1 : 1시간
  - 2 : 하루
  - 3 : 일주일
  - 4 : 한달
  - 5 : 장기기억  
  
  
  |EndPoint|JSON|Query Param|Path Param|Response|  
  |---|---|---|---|---|
  |POST /quiz/{quizSpace}||1~5 중 택일1||200|


- 퀴즈 시간공간별 이동하기 API  
  |EndPoint|JSON|Query Param|Path Param|Response|  
  |---|---|---|---|---|
  |POST /quiz/updateSpace|{"word":"apple", "quizSpace": 2}|||200|
