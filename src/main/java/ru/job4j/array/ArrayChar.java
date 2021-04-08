package ru.job4j.array;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        //int index = word.length >= pref.length ? pref.length : word.length;

        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }

        return result;
    }
}
