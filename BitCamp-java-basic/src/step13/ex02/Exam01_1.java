package step13.ex02;

public class Exam01_1 {

    public static void main(String[] args) {

        LinkedList2<Member> list = new LinkedList2<>();
        list.add(new Member("홍길동",20));
        list.add(new Member("임꺽정",16));
        list.add(new Member("유관순",25));
        
        // get() 메서드는 제네릭이 적용되었기 때문에 굳이 형변환 할 필요가 없다.
        for(int i = 0; i < list.size(); i++) {
            Member member = list.get(i);
            System.out.printf("%s(%d)\n",member.name, member.age);
        }
    }

}
