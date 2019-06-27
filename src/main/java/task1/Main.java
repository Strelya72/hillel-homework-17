package task1;

public class Main {
    public static void main(String[] args) {
        String value = "abbbbbcdddde";
        String value2 = "dcccbaaa";
        String value3 = "asbdgw";
        String value4 = "aaaa";

        System.out.println(isOrder(value));
        System.out.println(isOrder(value2));
        System.out.println(isOrder(value3));
        System.out.println(isOrder(value4));
    }

    public static String isOrder(String string) {
        int typeOrder = 0;

        while (string.length() > 1) {
            char current = string.charAt(0);
            char next = string.charAt(1);

            int currentOrder = Character.compare(current, next);

            if (currentOrder != 0) {
                if (typeOrder == 0) {
                    typeOrder = currentOrder;
                } else if (typeOrder * currentOrder < 0) {
                    return "Chaos";
                }
            }

            string = string.substring(1);
        }
        return typeOrder > 0 ? "Reverse order" : "Alphabetically";
    }
}


