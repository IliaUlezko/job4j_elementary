package ru.job4j.array;

public class JavaNameValidator {
    public static boolean isNameValid(String name) {
        boolean result = name.length() != 0 && checkFirstCharacter(name);

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

    public static boolean checkFirstCharacter(String value) {
        return isLowerLatinLetter(value.codePointAt(0))
                && !Character.isDigit(value.codePointAt(0));
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
