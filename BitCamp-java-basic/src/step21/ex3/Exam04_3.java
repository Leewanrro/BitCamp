// 던지는 예외 받기 - try ~ catch ~
package step21.ex3;

import java.io.IOException;
import java.sql.SQLException;

public class Exam04_3 {

    // 메서드에서 발생되는 모든 예외를 나열하기
    static void m(int i) 
            throws Exception, RuntimeException, SQLException, IOException {
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2) 
            throw new SQLException();
        else 
            throw new IOException();
    }

    // 공통 분모를 사용하여 퉁치는 방법
    // => 메서드에서 발생하는 예외의 공통 수퍼 클래스를 지정하면 된다.
    // => 호출자에게 어떤 오류가 발생하는지 정확하게 알려주는 것이 유지보수에 도움이 된다.
    //    따라서 가능한 그 메서드에서 발생하는 예외를 모두 나열하라!
    static void m2(int i) throws Exception {
        if (i == 0)
            throw new Exception();
        else if (i == 1)
            throw new RuntimeException();
        else if (i == 2) 
            throw new SQLException();
        else 
            throw new IOException();
    }

    public static void main(String[] args) {
        // try 블록에서 예외가 발생할 수 있는 메서드를 호출한다.
        try {
            m(1);
        }catch (IOException e) {
            //catch 블록에서 그 예외를 받아서 처리한다
            //메서드가 던지는 예외 개수 만큼 catch블록을 선언하면 된다.
        }catch (SQLException e) {

        }catch (RuntimeException e) {

        }catch (Exception e) {

        }
    }

}