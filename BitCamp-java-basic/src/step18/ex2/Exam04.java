// 클래스 정보 추출 - 클래스의 중첩 클래스 정보 알아내기 II
package step18.ex2;

public class Exam04 {
    static class A{
        static class B{} // static nested class
        class C{} // non- static nested class == inner class
        public void m() {
            class D{} // local class
        }
        public void m2() {
            Object obj = new Object(); // anamymas clss
        }
        public static class E{}
        public class F{}
        private class G{}
        protected class H{}
    }


    public static void main(String[] args)throws Exception {
        Class clazz = Class.forName("step18.ex2.Exam04$A");

        // 지정된 클래스에 인ㅌ페이스 정보를 가져온다.
        Class[] nestedList = clazz.getDeclaredClasses();

        for(Class nested : nestedList) {
            System.out.println(nested.getName());
        }
    }
}
