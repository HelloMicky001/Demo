// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");?

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k= 1; k<i*2; k++) {
                System.out.print("*");
            }
            for (int x = 1; x <= 10-i*2; x++) {
                System.out.print(" ");
            }
            for (int k= 1; k<i*2; k++) {
                System.out.print("*");
            }

        System.out.print("\n");
            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
        }
        for (int i = 0; i <= 20; i++) {
            for (int a = 1; a <=  i; a++) {
                System.out.print(" ");
            }
            for (int k = 1; k < 20-i * 2; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println("sum:"+sum(2,4));
    }
    public static int sum(int num1, int num2) {
        return num1+num2;
    }
}