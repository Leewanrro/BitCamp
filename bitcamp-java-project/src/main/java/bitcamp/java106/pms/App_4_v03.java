package bitcamp.java106.pms;

import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

//ver 0.1 - 명령 입력 프롬프트를 출력한다
//ver 0.2 - 사용자로부터 입력을 받아 출력한다.
//ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.


public class App_4{
    public static void main(String[] args) {
    
        Scanner keyScan = new Scanner(System.in);
        
        while(true){
            System.out.println("명령?");
            String input = keyScan.nextLine();

           
        }        
        System.out.println(input);
    }
}