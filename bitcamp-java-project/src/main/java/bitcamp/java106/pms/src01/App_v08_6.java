package bitcamp.java106.pms;


import bitcamp.java106.pms.domain.Team;
import java.util.Scanner;

// ver 0.1 - 명령 입력 프롬프트를 출력한다. 
// ver 0.2 - 사용자로부터 입력을 받아 출력한다.
// ver 0.3 - 사용자로부터 입력 받는 것을 무한 반복한다.
// ver 0.4 - quit 명령어 입력 시 반복문을 종료한다.
// ver 0.5 - help 명령을 구현한다.
// ver 0.6 - team/add 명령을 구현한다.
// ver 0.7 - team/list 명령을 구현한다.
// ver 0.8 - team/view 명령을 구현한다.
    // 1단계: 입력 값에서 명령어와 검색어를 구분한다.
    // 2단계: 기능이나 코드가 바뀌면 그에 따라 적절히 변수명도 바뀔 필요가 있다.
    // 3단계: 입력 값에서 검색어를 별도의 변수에 저장한다.
    // 4단계: 팀명이 없으면 안내문구를 출력한다.
    // 5단계: 팀명으로 배열을 뒤져 팀 정보를 찾는다.
    // 6단계: 팀명으로 검색할 때 대소문자를 구분하지 않는다.
public class App_v08_6{
    public static void main(String[] args) {
        Scanner keyScan = new Scanner(System.in); //scanner을 쓰겠다는 명령문
        
        Team[] teams = new Team[1000]; //Team 클래스를 여러번 사용하기 위해 teams라는 배열을 만든다
        int teamIndex = 0; //배열주소의 시작위치를 0으로 초기화한다(왜? 0부터 접근하여 차례대로 저장하기 위하여)
        
        while(true){

            System.out.print("명령> ");
            String[] arr = keyScan.nextLine().toLowerCase().split(" ");
            String menu = arr[0];
            String option = null; // 문자열 없음!
            if (arr.length == 2) {
                option = arr[1];
            }

            if (menu.equals("quit")) {
                System.out.println("잘가라 닝겐");
                break;
            } else if (menu.equals("help")){
                System.out.println("팀 등록 명령 : team/add");
                System.out.println("팀 조회 명령 : team/list");
                System.out.println("팀 상세조회 명령 : team/view 팀명");
                System.out.println("회원 등록 명령 : member/add");
                System.out.println("회원 조회 명령 : member/list");
                System.out.println("회원 상세조회 명령 : member/view 아이디");
                System.out.println("종료 : quit");
                
                continue; //continue 함수 아래에 문장이 있으면 아래에 있는 문장을 반복하고 조건문의 맨위로 올라간다.
                //break; 브레이크를 걸면 quit를 입력하지 않아도 바로 콘솔이 종료된다.
            } else if(menu.equals("team/add")){

                System.out.println("[팀 정보 입력]");
                Team team = new Team();

                System.out.print("팀명? ");
                team.name = keyScan.nextLine();

                System.out.print("설명? ");
                team.description = keyScan.nextLine();

                System.out.print("최대인원? ");
                team.maxQty = keyScan.nextInt();
                keyScan.nextLine(); 

                System.out.print("시작일? ");
                team.startDate = keyScan.nextLine();

                System.out.print("종료일? ");
                team.endDate = keyScan.nextLine();
                
                teams[teamIndex++] = team;
                // 팀 정보가 담겨있는 객체의 주소를 배열에 보관한다.
            } else if(menu.equals("team/list")){
                System.out.println("[팀 목록]");
                for (int i = 0; i < teamIndex; i++) {
                    System.out.printf("%s, %d, %s ~ %s\n", 
                        teams[i].name, teams[i].maxQty, 
                        teams[i].startDate, teams[i].endDate);
                }
            }else if (menu.equals("team/view")) {
                System.out.println("[팀 정보 조회]");
                if (option == null) {
                    System.out.println("팀명을 입력하시기 바랍니다.");
                    System.out.println();
                    continue;
                    
                }
                for (int i = 0; i < teamIndex; i++) {
                    if (option.equals(teams[i].name.toLowerCase())) { //toLowerCase
                        System.out.printf("팀명: %s\n", teams[i].name);
                        System.out.printf("설명: %s\n", teams[i].description);
                        System.out.printf("최대인원: %d\n", teams[i].maxQty);
                        System.out.printf("기간: %s ~ %s\n", 
                            teams[i].startDate, teams[i].endDate);
                    }
                }  
            }
            System.out.println();
        }
    }
}