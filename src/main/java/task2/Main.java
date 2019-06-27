package task2;

public class Main {
    public static void main(String[] args) {
        String value1 = "123";
        String value2 = "44";
        String value3 = "33";
        String value4 = "27";

        System.out.println(divisibleByThree(value1));
        System.out.println(divisibleByThree(value2));
        System.out.println(divisibleByThree(value3));
        System.out.println(divisibleByThree(value4));
    }

    public static String divisibleByThree(String string) {
        int amount = 0;
        while (string.length() > 0) {
            amount += (int) string.charAt(0);
            string = string.substring(1);
        }

        return amount % 3 == 0 ? "Yes" : "No";
    }
}
