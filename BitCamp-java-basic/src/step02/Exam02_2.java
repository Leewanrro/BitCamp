//키보드 입력받기 - 응용
package step02;

import java.io.InputStream;

import java.util.*;


public class Exam02_2{
    public static void main(String[] args) {
        //키보드에 접속하기 위해 키보드 정보를 가져온다
         //키보드에서 값을 꺼내주는 콘솔을 연결한다
        java.io.InputStream keyboard = System.in;
        java.util.Scanner keyScan = new Scanner(keyboard);

        //팀 멤버의 정보를 입력 받아 출력하라.
        //이름, 전화, 이메일, 나이, 재직여부
       //예)
       //이름: 홍길동
       //전화: 1111-1111
       //이메일: 홀@naver.com
       //나이: 23
       //재직여부: yes
       System.out.print("이름:");
       System.out.println(keyScan.nextLine());
       System.out.print("전회:");
       System.out.println(keyScan.nextLine());
       System.out.print("이메일:");
       System.out.println(keyScan.nextLine());
       System.out.print("나이:");
       System.out.println(keyScan.nextLine());
       System.out.print("재직여부:");
       System.out.println(keyScan.nextLine());
        
    }
}