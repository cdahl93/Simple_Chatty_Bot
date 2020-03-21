import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int nint = scanner.nextInt();
        int[] sequence = new int[nint];
        int sum = 0;
        for(int i = 0 ; i < nint ; i++) {
            sequence[i] = scanner.nextInt();
            if (sequence[i] % 6 == 0){
                sum += sequence[i];
            }
        }
        System.out.println(sum);
    }
}