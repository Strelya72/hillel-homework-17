package task4;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Lorna");
        names.add("Desiree");
        names.add("Melissa");
        names.add("Josh");
        names.add("Bart");
        names.add("Olivia");
        Collection<String> removedNames = null;
        try {
            removedNames = removeEachSecond(names);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(removedNames);
        System.out.println(names);

    }

    public static Collection<String> removeEachSecond(List<String> names) {
        if (names == null || names.size() <= 1) {
            throw new IllegalArgumentException("Invalid parameters in the list");
        }
        Collection<String> removedNames = new ArrayList<>();

        int removeIndex = 1;
        while (names.size() > 1) {
            removedNames.add(names.get(removeIndex));
            names.remove(removeIndex);
            removeIndex++;
            removeIndex %= names.size();
        }
        return removedNames;
    }
}
