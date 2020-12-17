package ru.job4j.ex;

import java.util.Arrays;

public class ElementNotFoundException extends Exception {
    public static int indexOf(String[] value, String key) throws UserInputException {
        int rsl = -1;
        for (String val: value) {
            if (val.equals(key)) {
                rsl = Arrays.asList(value).indexOf(key);
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
