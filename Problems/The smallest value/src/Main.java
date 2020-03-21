import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long M = scanner.nextLong();
        int n = 1;
        long factorial = n;
        while (factorial <= M && n < 14) {
            n++; // increase n by 1
            factorial = factorial * n;
        }
        System.out.print(n);
    }
}