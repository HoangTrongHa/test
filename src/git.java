import java.util.Scanner;

public class git {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Moi Ban Nhap Mang");

            int sum=0;
            int n=sc.nextInt();
            for(int i=0;i<n;i++)
            {
                Scanner s = new Scanner(System.in);
                System.out.println("MOi Ban nhap phan tu");
                sum = sum+(s.nextInt());
            }
            System.out.println(sum); }

}
