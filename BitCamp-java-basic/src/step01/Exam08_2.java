//논리의 리터럴-크기
package step01;
public class Exam08_2{
    public static void main(String[] args){
        

        //다음과 같이 개별적으로 논리값을 표현할 때는
        //4바이트 메모리에 보관한다.
        System.out.println(true);
        System.out.println(false);

        //그러나 다음과 같이 여러개의 논리값을 배열에 보관할 때는
        //각 논리 값을 내부적으로 1바이트 메모리에 보관한다.
        boolean[] arr = {true,false,true,false,false}; 
        
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
    }
}

