----
##1단계 TDD 실습 - 구현할 기능 목록
- [x] Request Line은 RFC7230 (https://www.rfc-editor.org/rfc/rfc7230) -> 3.1.1. Request Line 의 정의에 따라 String 타입의 `method SP request-target SP HTTP-version CRLF` 의 구조를 가진다.
- [x] method는 Enum으로 구현하여야 하며 형태는 RFC7231 (https://www.rfc-editor.org/rfc/rfc7231#section-4) 의 정의에 따라  
  `GET, HEAD, POST, PUT, DELETE, CONNECT, OPTIONS, TRACE`의 형태를 가진다.
- [x] HttpParser는 RequestLine을 method, path(request-target), protocaol, version으로 분리 할 수 있다.
- [x] Request Line 객체를 만든다.
- Request Line 객체는 method, path(request-target), protocaol, version을 필드로 가진다.
- [x] Query String이 포함된 형태의 Request Line이 들어오면 쿼리 스트링을 파싱 할 수 있다. (Map 형태로 파싱할예정)
---
##2단계 HTTP 웹 서버 구현 - 구현할 기능 목록
 -[ ] 