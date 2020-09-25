import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class git2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Nhap A0");
        int a0 = in.nextInt();
        System.out.println("Nhap A1");
        int a1 = in.nextInt();
        System.out.println("Nhap A2");
        int a2 = in.nextInt();
        System.out.println("Nhap B0");
        int b0 = in.nextInt();
        System.out.println("Nhap B1");
        int b1 = in.nextInt();
        System.out.println("Nhap B2");
        int b2 = in.nextInt();
        int alicePoints = 0, bobPoints = 0;
        int[] alice = {a0, a1, a2};
        int[] bob = {b0, b1, b2};
        for(int i = 0; i < 3; i++) {
            if(alice[i] > bob[i])
                alicePoints++;
            else if(alice[i] < bob[i])
                bobPoints++;

        }
        System.out.println("Diem Cua ALice ="+alicePoints + " ; "+"Diem cua Bob =" + bobPoints);
    }
}