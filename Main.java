import java.util.*;

public class Main {
    public static void main(String[] args) {

        int[] apples = { 29, 70, 85, 77, 55, 44, 33, 98, 90, 47, 22, 44, 55, 37, 65 };

        ArrayList<Integer> sm = new ArrayList<Integer>();
        ArrayList<Integer> med = new ArrayList<Integer>();
        ArrayList<Integer> bg = new ArrayList<Integer>();

        for (int i = 0; i < apples.length; i++) {
            int apple = apples[i];
            if (apple <= 50) {
                sm.add(apple);
            } else if (apple >= 71) {
                bg.add(apple);
            } else {
                med.add(apple);
            }
        }

        System.out.println("Small apples. Mass is less then 51 grams = " + sm);
        System.out.println("Medium apples. Mass is between 51 and 70 grams = " + med);
        System.out.println("Big apples. Mass is greater than 70 grams = " + bg);

    }
}