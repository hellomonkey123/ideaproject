import java.util.HashSet;
import java.util.Iterator;

import java.util.Hashtable;

/**
 * @program: Car
 * @description:
 * @author: liu yuanwen
 * @create: 2019/7/23
 */
class Car {
    public String run(Car c) {
        return ("这是父类run()方法");
    }

    public String run(C d) {
        return ("speed:0");
    }

}

class BMW extends Car {
    public String run( BMW b) {
        return ("这是BMW的run()方法");
    }

    public String run(C d) {
        return ("speed:80");
    }
}
class C extends BMW{}

class D extends BMW{}

public class Tese {


    public static void main(String[] args) {
        Car a = new Car();
        BMW b = new BMW();
        D d = new D();
        C c = new C();

        System.out.println(a.run(b) + "-" + a.run(d) + "-" + a.run(c));

    }

    }