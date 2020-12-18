package ru.job4j.ex;

import java.util.Arrays;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws UserInputException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
                break;
            }
        }
        if (rsl == -1) {
            throw new UserInputException("No index found");
        } else {
            return rsl;
        }
    }

    public static void main(String[] args) {
        String[] value = {"One", "Two", "Tree"};
        try {
            indexOf(value, "Two");
        } catch (UserInputException e) {
            e.printStackTrace();
        }
    }
}
