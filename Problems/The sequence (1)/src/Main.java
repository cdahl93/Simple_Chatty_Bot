import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int i = 1;
        int count = 1;
        while (count <= input) {
            for (int j = 0 ; j < i ; j++) {
                System.out.print(i + " ");
                count++;
                if (count > input) {
                    break;
                }
            }

            i++;
        }
    }
}