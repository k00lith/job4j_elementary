package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int postIndex = 0;
        for (int i = (word.length - post.length); i < word.length; i++) {
            if (word[i] != post[postIndex]) {
                result = false;
                break;
            } else {
                postIndex++;
            }
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}
