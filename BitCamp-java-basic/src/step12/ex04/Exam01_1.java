// 스택 구현과 사용
package step12.ex04;


import java.util.*;

public class Exam01_1 {

    public static void main(String[] args) {
        String s1 = new String("aaa");
        String s2 = new String("bbb");
        String s3 = new String("ccc");
        String s4 = new String("ddd");
        String s5 = new String("eee");

        Queue queue = new Queue();
        queue.offer(s1);
        print(queue);
        queue.offer(s2);
        print(queue);
        queue.offer(s3);
        print(queue);
        
        
        System.out.println("==>" + queue.poll());
        print(queue);
        System.out.println("==>" + queue.poll());
        print(queue);
        
        queue.offer(s4);
        print(queue);
        queue.offer(s5);
        print(queue);
        
        String value;
        while(queue.size()>0) {
            System.out.println(queue.poll());
        }

    }
    static void print(Queue list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }

}

