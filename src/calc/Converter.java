package calc;

import java.util.List;

public class Converter {

    public static int romanToArabic(String input) {
        String romanNumeral = input.toUpperCase();
        int result = 0;

        List<RomeNums> romanNumerals = RomeNums.getReverseSortedValues();


        int i = 0;

        while ((romanNumeral.length() > 0) && (i < romanNumerals.size())) {
            RomeNums symbol = romanNumerals.get(i);
            if (romanNumeral.startsWith(symbol.name())) {
                result += symbol.getCurr();
                romanNumeral = romanNumeral.substring(symbol.name().length());
            } else {
                i++;
            }
        }

        if (romanNumeral.length() > 0) {
            throw new IllegalArgumentException(input + " не может быть преобразован в римскую цифру");
        }

        return result;
    }


    public static String arabicToRoman(int number) {
        if ((number <= 0) || (number > 4000)) {
            throw new IllegalArgumentException(number + " не находится в диапазоне (0,4000]");
        }

        List<RomeNums> romanNumerals = RomeNums.getReverseSortedValues();

        int i = 0;
        StringBuilder sb = new StringBuilder();

        while ((number > 0) && (i < romanNumerals.size())) {
            RomeNums currentSymbol = romanNumerals.get(i);
            if (currentSymbol.getCurr() <= number) {
                sb.append(currentSymbol.name());
                number -= currentSymbol.getCurr();
            } else {
                i++;
            }
        }

        return sb.toString();
    }
}