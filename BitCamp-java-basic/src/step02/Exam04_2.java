//정수 변수-다른 크기의 변수 값 할당
package step02;



public class Exam04_2{
    public static void main(String[] args) {
      int i=100;
      byte b=100;

      //i 변수에 들어 있는 값이 byte 메모리에 저장할 수 있을 지라도
      //리터럴이 아닐 경우에는 큰 크기의 메모리에 값을
      //작은 크기의 메모리에 저장할 수 없다.
      
      //리터럴에 대해서만 예외를 허용한다
      //b=i;//컴파일 오류-int는 4바이트이고 b는 2 바이트이기때문

      short s=100;
      //s=i; //컴파일 오류
      long l=200;
      l=i;//작은 메모리의 값을 큰 메모리 값에 저장될 수 있다

      int k;
      //k=l; //컴파일오류- 큰 메모리의 값을 작은 메모리에 저장할 수 없다
    

    }
}
