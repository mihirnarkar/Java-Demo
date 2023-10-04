// This is comparable code

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Laptop1 implements Comparable<Laptop1> {
    private int lid;
    private String make;
    private double cost;

    public Laptop1(int lid, String make, double cost) {
        this.lid = lid;
        this.make = make;
        this.cost = cost;
    }

    public void show() {
        System.out.println(this.lid + " " + this.make + " " + this.cost);
    }

    @Override
    public int compareTo(Laptop1 o) {
        if (this.cost < o.cost)
            return -1;
        else if (this.cost > o.cost)
            return 1;
        else
            return 0;
    }

    public int getLid() {
        return this.lid;
    }
}

public class NewTester {

    public static void main(String[] args) {
        List<Laptop1> list = new ArrayList<>();
        list.add(new Laptop1(101, "Dell", 50000));
        list.add(new Laptop1(102, "HP", 45000));
        list.add(new Laptop1(103, "Lenovo", 55000));
        list.add(new Laptop1(104, "Apple", 75000));

        // Using Comparable to sort the laptops based on cost
        Collections.sort(list);

        for (Laptop1 laptop : list) {
            laptop.show();
        }
    }
}
