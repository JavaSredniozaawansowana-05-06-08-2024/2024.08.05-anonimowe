import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        lista.add(4);
        lista.add(234);
        lista.add(47);
        lista.add(45);
        lista.add(12);
        lista.add(5674);
        lista.add(678);
        lista.add(34);
        lista.add(867);
        lista.add(3456);

        System.out.println(lista);
        Collections.sort(lista);
        System.out.println(lista);

        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Toyota", "Corolla", 150));
        cars.add(new Car("BMW", "5", 300));
        cars.add(new Car("Audi", "A5", 400));
        cars.add(new Car("Kia", "Ceed", 200));

        System.out.println(cars);
        Collections.sort(cars, new Comparator<Car>() {

            @Override
            public int compare(Car o1, Car o2) {
                return o1.getBrand().compareTo(o2.getBrand());
            }
        });
        System.out.println(cars);
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return -o1.getBrand().compareTo(o2.getBrand());
            }
        });
        System.out.println(cars);
        Collections.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car o1, Car o2) {
                return o1.getPrice() - o2.getPrice();
            }
        });
        System.out.println(cars);

        MojInterfejs jakisObiekt = new MojInterfejs() {
            @Override
            public void a() {
                System.out.println("a");
            }

            @Override
            public void b() {
                System.out.println("b");
            }

            @Override
            public void c() {
                System.out.println("c");
            }
        };

        jakisObiekt.a();
        jakisObiekt.b();
        jakisObiekt.c();


    }
}
