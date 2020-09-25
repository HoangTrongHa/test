import java.util.Scanner;
public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Chuoi nay dai:");

        int a = sc.nextInt();
        System.out.println("Yeu Cau mat Khau");
        String s = sc.next();
        boolean num = false,
                upper_case = false,
                lower_case = false,
                special_characters = false;
        int count = 0;
        String Kytydacbiet = "!@#$%^&*()-+";
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (!num && (int) ch >= 48 && (int) ch <= 57) {
                count++;
                num = true;
            }
            if (!lower_case && (int) ch >= 97 && (int) ch <= 122) {
                count++;
                lower_case = true;
            }
            if (!upper_case && (int) ch <= 90 && (int) ch >= 65) {
                count++;
                upper_case = true;

            }
            if (!special_characters) {
                for (int j = 0; j < Kytydacbiet.length(); j++) {
                    if (Kytydacbiet.charAt(j) == ch) {
                        count++;
                        special_characters = true;
                        break;
                    }
                }
            }
        }
        if (s.length() < 7) {
            System.out.println(Math.max((6 - s.length()),( 4 - count)));
        } else {
            System.out.println("số ký tự tối thiểu mà cô ấy phải thêm để làm cho mật khẩu của cô ấy mạnh "+(4-count));
        }
    }
}
