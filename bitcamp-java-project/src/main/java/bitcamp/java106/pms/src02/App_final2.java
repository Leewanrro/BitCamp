package bitcamp.java106.pms;


import bitcamp.java106.pms.util.Console;
import bitcamp.java106.pms.domain.Team;
import bitcamp.java106.pms.controller.TeamController;
import bitcamp.java106.pms.controller.MemberController;
import bitcamp.java106.pms.domain.Member;
import java.util.Scanner;

// ver 0.2 - 회원 관리 기능을 별도의 클래스로 옮기고 그 클래스를 통해 활용한다.
// ver 0.1 - 팀 관리 기능(메소드)을 별도의 클래스로 옮기고 그 클래스를 통해 활용한다.
//          = controller.TeamController 클래스 만들고 여기로 이동
//          - 출력 기능을 별도의 클래스로 이동시킨다.
//          = util.Consol 클래스 추가.
public class App_final2 {
   static Scanner keyScan = new Scanner(System.in);

   public static String option = null; // 문자열 없음!

   static void onQuit() {
       System.out.println("안녕히 가세요!");
   }

   static void onHelp() {
       System.out.println("[도움말]");
       System.out.println("팀 등록 명령 : team/add");
       System.out.println("팀 조회 명령 : team/list");
       System.out.println("팀 상세조회 명령 : team/view 팀명");
       System.out.println("회원 등록 명령 : member/add");
       System.out.println("회원 조회 명령 : member/list");
       System.out.println("회원 상세조회 명령 : member/view 아이디");
       System.out.println("종료 : quit");
   }

   public static void main(String[] args) {
       TeamController.keyScan = keyScan;
       Console.keyScan = keyScan;    

       while (true) {
           String[] arr = Console.prompt();
           String menu = arr[0];

           if (arr.length == 2)
               option = arr[1];
               if (menu.equals("quit")) {
                   onQuit();
                   break;
               } else if (menu.equals("help")){ 
                   onHelp();
            } else if(menu.startsWith("team/"))
                TeamController.service(menu,option);               
               else if (menu.equals("member/add"))
                   MemberController.onMemberAdd();
               else if (menu.equals("member/list"))
                   MemberController.onMemeberList();
               else if (menu.equals("member/view"))
                   MemberController.onMemberView(option);
               else if (menu.equals("member/delete"))
                   MemberController.onMemberDelete(option);
               else if (menu.equals("member/update"))
                   MemberController.onMemberUpdate(option);
               else
                   System.out.println("명령어가 올바르지 않습니다.");
           

           System.out.println();
       }
   }
}

