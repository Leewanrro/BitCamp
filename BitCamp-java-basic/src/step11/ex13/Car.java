package step11.ex13;

public class Car {
    String model;
    String maker;
    int cc;
    int valve;
    
    //외부에서 직접 인스턴스를 생성하는 것을 막기위해 생성자를 private로 선언
    private Car() {}
    // 대신 객체를 생성해주는 static 메서드를 준비한다.
    
    // 어떨 때 이렇게 인스턴스를 직접 생성하지 않고 스태틱 메서드를 통해 인스턴스를 생성하는가?
    // => 다음의 경우처럼 인스턴스 생성과정이 복잡할 경우에
    //    직접 인스턴스를 생성하기 보다는
    //    인스턴스를 생성해주는 메서드를 사용하여 인스턴스를 만든다.
    // => singletone 패턴에서 getInstance() 메서드는 오직 한 개의 인스턴스만 생성한다.
    //    즉 메서드의 목적은 단지 인스턴스를 한 개만 만들어 사용하기 위함이다.
    // => 그러나 다음 create() 메서드는 호출할 때 마다 인스턴스를 만들어 주기 때문에
    //    singleton 하고 구조가 비슷하지만 singleton은 아니다.
    //    이 메소드의 목적은 복잡한 인스턴스 생성을 대신 해주는 것이다.
    //  다시! 언제 이런 방식으로 설계하는가?
    // => 즉 인스턴스를 생성해 주는 메서드를 통해
    //    인스턴스를 생성하면 인스턴스를 사용하고픈 개발자는 코드가 간결해서 좋다.
    // 이런 설계 방식에 대한 이름은"factory method"설계 패턴이다.
    public static Car create(String name) {
        
        Car c = new Car(); // private는클래스 안에서 사용가능
        switch (name) {
            case "티코":
                c.model = "티코";
                c.maker = "대우";
                c.cc = 800;
                c.valve = 16;
                break;
            case "소나타" :
                c.model ="소나타";
                c.maker = "현대";
                c.cc = 1900;
                c.valve = 16;
                break;
            default:
                c.model = "모델S";
                c.maker = "테슬라";
                c.cc = 0;
                c.valve = 0;
                       //이게 생성자 같기도하고 스태틱메소드 같기도하고
        }
        return c;
    }
}
