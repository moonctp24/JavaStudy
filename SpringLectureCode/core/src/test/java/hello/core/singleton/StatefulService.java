package hello.core.singleton;

public class StatefulService {
    /*
    // singleton 패턴에서 발생할 수 있는 문제점이 발생한 코드
    private int price; // 상태를 유지하는 코드

    public void order(String name, int price){
        System.out.println("name = "+name+", price = "+price);
        this.price = price; // 여기가 문제!!
    }

    public int getPrice(){
        return price;
    }
     */

    /* singleton 패턴에서 발생할 수 있는 문제점을 해결한 코드 - 공유필드 없애기 */
    public int order(String name, int price){
        System.out.println("name = "+name+", price = "+price);
        return price;
    }

}
