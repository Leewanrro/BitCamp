
// indexOf()에서 객체를 찾을 때 equals()로 비교하여 찾는다.
package step12.ex01;

import java.util.ArrayList;

public class Exam03_4 {
    // hashCode()와 equals()를 오버라이딩 한다면?
    static class Member {
        String name;
        int age;
        
        public Member(String name, int age) {
            this.name = name;
            this.age = age;
        }
        
        @Override
        public String toString() {
            return String.format("[%s,%d]", this.name, this.age);
        }
        
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Member other = (Member) obj;
            if (age != other.age)
                return false;
            if (name == null) {
                if (other.name != null)
                    return false;
            } else if (!name.equals(other.name))
                return false;
            return true;
        }
        
        
    }
    public static void main(String[] args) {
        Member s1 = new Member("홍길동", 20);
        Member s2 = new Member("임꺽정", 30);
        Member s3 = new Member("유관순", 16);
        Member s4 = new Member("임꺽정", 30);

        ArrayList list = new ArrayList();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        print(list);
        
        // Member 클래스는 equals()를 오버라이딩 했다.
        // 따라서 인스턴스가 다르더라도 Member의 name과 age 값이 같다면 
        // equals()의 검사 결과가 true이기 때문에, idexOf()로 객체를 찾을 수 있다.
        System.out.println(list.indexOf(s4)); // 1
    }
    
    static void print(ArrayList list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }
        System.out.println();
    }
}   

