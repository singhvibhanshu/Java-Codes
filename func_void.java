import java.util.Scanner;

public class func_void {
    public static void main(String[] args) {
        sum();
    }

    static void sum() {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number 01: ");
        int a = in.nextInt();
        System.out.print("Enter number 02: ");
        int b = in.nextInt();
        System.out.print(a + b);
    }
}