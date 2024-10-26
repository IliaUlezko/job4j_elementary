package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (input.charAt(i) == symbol) {
                counter++;
            } else {
                result += (char) symbol;
                if (counter != 1) {
                    result += counter;
                    counter = 1;
                }
                symbol = input.charAt(i);
            }
        }
        result += (char) symbol;
        if (counter != 1) {
            result += counter;
        }
        return result;
    }

    /**
     * Метод декодирует входящую строку в последовательность символов,
     * количество одинаковых символов не должно превышать 9!
     * С помощью билдера собираем символы в строку.
     * @param input входящая строка
     * @return builder.toString()!
     */
    public static String decode(String input) {
        StringBuilder builder = new StringBuilder();
        char[] values = input.toCharArray();
        char symbol = values[0];
        int counter;
        for (int i = 1; i < values.length; i++) {
            char temp = values[i];
            if (Character.isLetter(temp)) {
                builder.append(symbol);
                symbol = values[i];
            } else {
                StringBuilder digit = new StringBuilder();
                digit.append(temp);
                counter = Integer.parseInt(String.valueOf(temp));
                builder.append(String.valueOf(symbol).repeat(Math.max(0, counter - 1)));
            }
        }
        builder.append(symbol);
        return builder.toString();
    }
}
