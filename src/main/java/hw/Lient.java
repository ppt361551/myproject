package hw;

import java.util.ArrayList;
import java.util.List;

public class Lient {
    public static void main(String[] args) {
        List<Integer> years = new ArrayList<>();
        for (int i = 1900; i<=2050; i++) {
            if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0)) {
                years.add(i);
            }
        }
        for (int year : years) {
            System.out.println(year);
        }
    }
}
