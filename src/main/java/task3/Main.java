package task3;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        float pennies = 56.324f;
        float pennies2 = -435f;
        float pennies3 = 4.935f;
        float pennies4 = -321;
        float pennies5 = 321;
        float pennies6 = 81;

        System.out.println(looseChange(pennies));
        System.out.println(looseChange(pennies2));
        System.out.println(looseChange(pennies3));
        System.out.println(looseChange(pennies4));
        System.out.println(looseChange(pennies5));
        System.out.println(looseChange(pennies6));
    }

    public static Map<String, Integer> looseChange(float inputValue) {
        int value = (int) inputValue;

        if (value <= 0) {
            Map<String, Integer> nullMap = new HashMap<>();
            nullMap.put("Nickels", 0);
            nullMap.put("Pennies", 0);
            nullMap.put("Dimes", 0);
            nullMap.put("Quarters", 0);
            return nullMap;
        }
        int countPennies = 0;
        int countNickels = 0;
        int countDimes = 0;
        int countQuarters = 0;

        while (value >= 25) {
            countQuarters++;
            value -= 25;
        }

        while (value >= 10) {
            countDimes++;
            value -= 10;
        }

        while (value >= 5) {
            countNickels++;
            value -= 5;
        }

        countPennies = value;

        Map<String, Integer> map = new HashMap<>();
        map.put("Nickels", countNickels);
        map.put("Pennies", countPennies);
        map.put("Dimes", countDimes);
        map.put("Quarters", countQuarters);

        return map;

    }
}
