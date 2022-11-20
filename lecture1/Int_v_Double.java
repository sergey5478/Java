package lecture1;

public class Int_v_Double {
    public static void main(String[] args) {
        int i = 5; double b = i;
        System.out.println(i);
        System.out.println(b);
        b = 1.321; i = (int)b;
        System.out.println(i); 
        System.out.println(b);
        byte d = Byte.parseByte("123");
        System.out.println(d);
    }
}
