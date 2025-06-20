class LargestOfThree {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        if (a > b && a > c) {
            System.out.println("Largest number is: " + a);
        } else if (b > a && b > c) {
            System.out.println("Largest number is: " + b);
        } else if (c > a && c > b) {
            System.out.println("Largest number is: " + c);
        } else {
            System.out.println("Two or more numbers are equal and largest");
        }
    }
}
