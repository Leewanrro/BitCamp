// JDBC 프로그래밍 개요 - JDBC 드라이버 타입과 준비
package step25.ex1;

import java.sql.DriverManager;

// JDBC 드라이버 다운로드 및 설정
// 2) 빌드 도구(gradle)를 이용하여 라이브러리 관리하기
//  - 라이브러리 파일이 한 두개 일 때는 직접 해당 사이트로 가서 다운로드 하고
//    직접 CLASSPATH를 설정하면 된다.
//  - 문제는 실제 현업에서는 몇 십개의 라이브러리를 가져와서 사용한다.
//    이럴 때는 외부 라이브러리를 관리하기가 번거롭다.
//  - 해결책?
//    Maven 또는 gradle과 같은 빌드도구를 이용하여 의존 라이브러리를 관리하면 편하다!
//  - 절차
// 1) mvnrepository.com 에서 의존 라이브러리를 검색한다.
// 2) 의존 라이브러리 정보를 복사하여 build.gradle 파일에 등록한다.
public class Exam01_5 {

    public static void main(String[] args) throws Exception {
        // 1) JDBC 드라이버 로딩 
        // => 드라이버 객체를 생성하지 않고 클래스를 로딩하면,
        //    자동으로 객체가 생성되어 DriverManager에 등록된다.
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        // DriverManager에 자동 등록된 것을 확인해보자!
        java.sql.Driver driver = DriverManager.getDriver("jdbc:mysql:");
        System.out.println("JDBC 드라이버 로딩 및 등록 완료!");
        // 해당 드라이버가 등록되지 않았으면 예외가 발생할 것이다.
        
    }
}