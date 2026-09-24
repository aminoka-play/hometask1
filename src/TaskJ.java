import java.util.Scanner;

class TaskJ {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int j = n + 2 - n % 2;
        System.out.println(j);
    }
}
