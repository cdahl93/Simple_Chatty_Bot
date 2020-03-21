import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        System.out.print(input + " ");
        do {
            if (input == 1) {

            } else if (input % 2 == 0) {
                input /= 2;
                System.out.print(input + " ");
            } else {
                input = input * 3 + 1;
                System.out.print(input + " ");
            }

        } while (input != 1);
    }
}