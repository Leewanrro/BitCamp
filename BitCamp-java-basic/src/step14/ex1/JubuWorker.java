package step14.ex1;

public class JubuWorker implements Worker {
    // 인터페이스 구현체는 인터페이스에 선언된 모든 메서드를 구현해야 한다.
    @Override
    public void execute() {
        
        System.out.println("주부로 일합니다.");
    }
}
