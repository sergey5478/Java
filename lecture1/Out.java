package lecture1;

public class Out {
    public static void main(String[] args) {
        int a = 2; int b = 5;
        int c = a + b;
        String res = String.format("%d + %d = %d", a, b, c);
        System.out.printf("%d + %d = %d\n", a, b, c);
        // System.out.println();
        System.out.println(res);
    }

}
