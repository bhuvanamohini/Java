public class shift {
    public static void main(String[] args) {
        System.out.println("Start of program");
        checkNumber(-2);
        System.out.println("End of program");  // not executed if return inside method stops execution
    }
    public static void checkNumber(int num) {
        if (num < 0) {
            System.out.println("Negative number");
            return;  // exits the method here
        }
        System.out.println("Positive number or zero");
    }
}
