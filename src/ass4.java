public class ass4 {
    public String test = "<div>Hello, it's <strong>me</strong> you're <i>looking</i> for <span class=\"blink\">;)</span>!</div>";
    public String test1;
    public ass4() {
    }
    public ass4( String test1) {
        this.test1 = test1;
    }
    private void checka() {
        if (test1.equals(test)) {
            System.out.println("1");
        }else {
            System.out.println("0");
        }
    }
    public static void main(String[] args) {
        ass4 a = new ass4("<div>Hello, it's <strong>me</strong> you're <i>looking</i> for <span class=\"blink\">;)</span>!</div>");
        a.checka();
    }
}
