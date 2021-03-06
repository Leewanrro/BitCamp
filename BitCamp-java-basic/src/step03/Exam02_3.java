//레퍼런스 배열과 반복문 결합
package step03;

public class Exam02_3{
    public static void main(String[] args) {
        //여러 개의 인스턴스 주소 저장하기

        class Score{ 
            String name;
            int kor;
            int eng;
            int math;
            int sum;
            float aver;

        }
//**************인스턴스 주소
        
        //Score 레퍼런스를 여러 개 준비한다.
        //=>레퍼런스 배열 준비(인스턴스 배열이 아니다)
        Score[] arr = new Score[3];
        
       //반복문을 이용하여 레퍼런스 배열에 인스턴스 주소를 저장한다.
       for(int i=0;i<arr.length;i++){ 
        arr[i] = new Score(); 
       };
       //값을 저장할 때는 일일히 지정하여야 한다
       arr[0].name="홍길동";
       arr[1].name="임꺽정";
       arr[2].name="유관순";
       //배열에 반복문을 사용하면 인스턴스 값을 꺼내기 쉽다
       for(int i=0; i < arr.length; i++){
       System.out.printf("이름: %s\n",arr[i].name);
        };
    }
}
//결론
//배열은 반복문과 사용할 때 유용하다