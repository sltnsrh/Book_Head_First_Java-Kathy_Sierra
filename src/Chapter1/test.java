package Chapter1;

public class test {
    public static void main(String[] args) {
        int x = 0, y = 0;
        while (x < 5) {
            if (y < 5) {
                x = x + 1;
                if (y < 3) {
                    x = x - 1;
                }
            }
            y = y + 2;
            System.out.print(x + "" + y + " ");
            x = x + 1;
        }
    }
}
