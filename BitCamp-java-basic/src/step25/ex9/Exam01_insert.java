// mybatis + spring IoC - 트랜잭션 적용 전
package step25.ex9;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Exam01_insert {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext iocContainer = 
                new ClassPathXmlApplicationContext(
                        "step25/ex9/application-context.xml");

        BoardService boardService = iocContainer.getBean(BoardService.class);


        Board b1 = new Board();
        b1.setNo(171);
        b1.setTitle("1111");
        b1.setContent("xxxx");


        Board b2 = new Board();
        b2.setNo(172);
        b2.setTitle("2222");

        Board b3 = new Board();
        b3.setNo(171);
        b3.setTitle("3333");

        boardService.test2(b1,b2,b3);



    }
}

