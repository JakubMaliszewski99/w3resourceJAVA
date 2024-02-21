public class Zadanie15{
    public static void main(String[] args) {
        int a = 15;
        int b = 5;

        System.out.println("a = " + a + ", b = " + b);

        // Swapping
        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("a = " + a + ", b = " + b);
    }
}