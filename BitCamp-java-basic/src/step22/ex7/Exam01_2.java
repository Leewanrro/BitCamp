// 객체 읽기 - 파일이 데이터를 읽어 인스턴스로 만들기 
package step22.ex7;

import java.io.FileInputStream;

public class Exam01_2 {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("temp/test4.data");
        DataInputStream in = new DataInputStream(fileIn);
        
        Member member = null;
        
        member = new Member();
       
        member.name = in.readUTF();
        member.age = in.readInt();
        member.gender = in.readBoolean();
        
        in.close();
        
        System.out.printf("%s\n", member);
    }
}
