[주제: Gradle 프로젝트 만들기]
1. 일반 프로젝트 생성
2. gradle 구조 디렉토리 생성
src
   -- main
           -- java
           -- resources
   -- test
           -- java
           -- resources
 
 3. 이클립스 프로젝트 설정 파일(.project)에 gradle plug-in 정보 추가
      => 이클립스는 해당 프로젝트가 gradle 프로젝트임을 알 수 있다.
      => gradle 메뉴를 띄워준다.
      => 방법: google -> eclipse nature gradle  검색 
             .project 의 <natures> 태그에 다음 태그를 붙인다.
             <nature>org.springsource.ide.eclipse.gradle.core.nature</nature>
4. Gradle 설정 파일 작성(build.gradle)
  	  => 의존 라이브러리를 다운로드 받을 서버 정보 설정
  	  => 다운로드 받을 의존라이브러리를 지정
  	  => 사용할 gradle 명령어가 들어 있는 플러그인 지정
  	  => 기타 그래들 설정 추가 

5. Gradle Build 수행
      => eclipse ==> 이클립스 설정 파일을 모두 만든다.
6. 톰캣 서버에 배포 및 실행 테스트 
                