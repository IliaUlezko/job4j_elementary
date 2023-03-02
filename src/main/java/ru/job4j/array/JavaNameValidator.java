package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = name.length() != 0
                && isLowerLatinLetter(name.codePointAt(0))
                && !Character.isDigit(name.codePointAt(0));

        if (result) {
            for (int i = 1; i < name.length(); i++) {
                int element = name.codePointAt(i);
                if (!isSpecialSymbol(element)
                        && !isUpperLatinLetter(element)
                        && !isLowerLatinLetter(element)
                        && !Character.isDigit(element)) {
                    result = false;
                    break;
                }
            }
        }

        return result;
    }

    public static boolean isSpecialSymbol(int code) {
        return code == 36 || code == 95;
    }

    public static boolean isUpperLatinLetter(int code) {
        return code >= 65 && code <= 90;
    }

    public static boolean isLowerLatinLetter(int code) {
        return code >= 97 && code <= 122;
    }
}
