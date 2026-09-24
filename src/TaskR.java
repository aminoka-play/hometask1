import java.util.Scanner;

class TaskR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int l = b % a;
        int y = (a - l) % a;
        System.out.println(y);
    }
}
