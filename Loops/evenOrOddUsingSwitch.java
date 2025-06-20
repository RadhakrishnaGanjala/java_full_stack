import java.util.Scanner;

class evenOrOddUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int rem = num % 2;
        switch (rem) {
            case 0:
                System.out.println(num + " is Even");
                break;
            case 1:
                System.out.println(num + " is Odd");
                break;
            default:
                System.out.println("Invalid input");
                break;
        }
    }
}
