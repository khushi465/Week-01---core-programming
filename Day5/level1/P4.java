
public class P4 {

    public void generateException() {
        String text = null;
        System.out.println(text.toLowerCase());
    }

    public void NullPointerException() {
        String text = null;
        try {
            System.out.println(text.toLowerCase());
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        P4 obj = new P4();
        // obj.generateException();
        obj.NullPointerException();

    }
}
