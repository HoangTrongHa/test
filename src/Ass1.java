public class Ass1 {
    public int n;

    public int getN() {
        return n;
    }

    public void setN(int n) {
        this.n = n;
    }

    public Ass1(int n) {
        this.n = n;
    }

    public void check() {
        for (int i = 1; i <= n; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                if (i == n) {
                    System.out.print("SmartOSC" + ".");
                }else {
                System.out.print("SmartOSC" + ",");}
            } else if (i % 3 == 0) {
                if (i == n) {
                    System.out.print("Smart" + ".");
                }else {
                    System.out.print("Smart"+",");
                }
            } else if (i % 5 == 0) {
                if (i == n) {
                    System.out.print("OSC" + ".");
                }else {
                System.out.print("OSC" + ",");}
            }else {
                if (i == n) {
                    System.out.print(i + ".");
                }else {
                    System.out.print(i + ",");}
            }
        }
    }

    public static void main(String[] args) {
        Ass1 n = new Ass1(3);
        n.check();
    }
}
