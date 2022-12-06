import java.util.Scanner;
public class ex02 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int n = sc.nextInt();
        sc.close();

        int i, y;

        for(i = 1; i <= n; i++) {
            for(y = 1; y <= i; y++) {
                System.out.print(y + " ");
            }
            System.out.println();
        }
    }
}