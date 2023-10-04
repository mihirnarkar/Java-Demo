
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class LaptopComparator implements Comparator<Laptop1> {
    @Override
    public int compare(Laptop1 laptop1, Laptop1 laptop2) {
        return Integer.compare(laptop1.getLid(), laptop2.getLid());
    }
}

public class ComparatorExample {
    public static void main(String[] args) {
        List<Laptop1> laptops = new ArrayList<>();
        laptops.add(new Laptop1(101, "Dell", 50000));
        laptops.add(new Laptop1(103, "Lenovo", 55000));
        laptops.add(new Laptop1(102, "HP", 45000));

        // Using the custom comparator to sort laptops by ID
        Comparator<Laptop1> idComparator = new LaptopComparator();
        Collections.sort(laptops, idComparator);

        for (Laptop1 laptop : laptops) {
            laptop.show();
        }
    }
}

