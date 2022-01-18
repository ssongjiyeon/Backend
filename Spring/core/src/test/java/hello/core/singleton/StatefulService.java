package hello.core.singleton;

public class StatefulService {

    private int price; //상태 유지 필드(공유 필드)

    public void order(String name, int price) {
        System.out.println("name = " + name + " price = " + price);
        this.price = price; // 여기가 문제;
    }

//    public void order(String name, int price) {
//        System.out.println("name = " + name + " price = " + price);
//        return price; // private로 안만들고 값을 넘겨버리면됨
//    }

    public int getPrice() {
        return price;
    }
}
