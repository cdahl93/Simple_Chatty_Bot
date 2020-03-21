import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input_old;
        int input_new;

        // first two inputs
        input_old = scanner.nextInt();
        input_new = scanner.nextInt();

        // determine ASC || DESC
        int DESC;
        if (input_old > input_new) {
            DESC = 1;
        } else {
            DESC = 0;
        }
        if (input_new == 0) {
            System.out.print("true");
        } else {
            String output = "true";
            input_old = input_new;
            do {
                input_new = scanner.nextInt();
                if (input_new == 0) {
                    //System.out.print("true");
                    break;
                }
//System.out.println("NEW " + input_new + " OLD " + input_old);
                if (DESC == 1){
                    if (input_new > input_old) {
                        output = "false";
                        break;
                    } else {
                        input_old = input_new;
                        output = "true";
                    }
                } else {
                    if (input_new < input_old) {
                        output = "false";
                        break;
                    } else {
                        input_old = input_new;
                        output = "true";
                    }
                }
            } while (scanner.nextInt() != 0);
            System.out.print(output);
        }
//System.out.println("DESC " + DESC);

    }
}