//변수 선언
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam03_1{
    public static void main(String[] args) {
        byte b;
        short s;
        int i;
        long l;
        float f;
        double d;
        char c;
        boolean bool;
     


    }
}

//변수 선언
//-값을 저장할 메모리를 준비시키는 명령.
//문법
//메모리종류 별명;
//메모리 종류
//1)primitive data type(원시 데이터 타입)
//  자바에서 기본으로 제공하는 메모리 종류
//-정수
// -byte : 1byte (-128~127)
// -short : 2byte (-32768~32767)
// -int : 4byte (약 -21억~ 21억)
// -ling : 8byte (약 -922경 ~ 922경)
//-부동소수점
// -float : 4byte(유효자릿수 7자리)
// -double : 8byte(유효자릿수 15자리)
//-문자
// -char : 2byte
//-논리값
// -boolean : JVM에서 4byte메모리를 사용한다.
//2) reference(레퍼런스)
//  -데이터가 저장된 메모리의 주소를 저장하는 메모리
//-문자열(주소)
// -string : 문자열이 저장된 주소를 저장한다.