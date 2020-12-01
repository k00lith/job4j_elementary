package ru.job4j.array;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        if (word[word.length - 1] != post[post.length - 1]) {
            result = false;
        }
        /* проверить. что массив word имеет последние элементы одинаковые с post */
        return result;
    }
}
