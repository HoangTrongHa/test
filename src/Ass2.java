import java.io.*;
import java.util.*;

public class Ass2 {
    public static void main(String[] args) {
        List<Integer> arrayIntegers = new ArrayList<>(Arrays.asList(1,2,3));

        System.out.println(arrayIntegers);
        int largest1, largest2;
        largest1 = arrayIntegers.get(0);
        for (int i = 0; i < arrayIntegers.size(); i++) {
            if (arrayIntegers.get(i) > largest1) {
                largest1 = arrayIntegers.get(i);
            }
        }
        largest2 = arrayIntegers.get(0);
        for (int i = 0; i < arrayIntegers.size(); i++) {
            if (arrayIntegers.get(i) > largest2 && arrayIntegers.get(i) < largest1)
                largest2 = arrayIntegers.get(i);
        }
        System.out.println("The Second Largest:\n"+largest2);
    }
}

