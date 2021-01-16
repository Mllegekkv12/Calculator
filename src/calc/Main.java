package calc;

import java.util.Scanner;

import static calc.Converter.arabicToRoman;
import static calc.Converter.romanToArabic;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        short direction = 0;

        String v1 = in.next(), sign = in.next(), v2 = in.next();

        int resTo1 = 0, resTo2 = 0;
        int res = 0;

        if (isNumber.isNum(v1) && isNumber.isNum(v2)) {
            direction = 1;
            resTo1 = Integer.parseInt(v1);
            resTo2 = Integer.parseInt(v2);

        } else if (!isNumber.isNum(v1) && !isNumber.isNum(v2)) {
            resTo1 = romanToArabic(v1);
            resTo2 = romanToArabic(v2);
        } else throw new IllegalArgumentException("Неверно введены строки!");


        if (direction == 0) {
            switch (sign) {
                case "+":
                    res = resTo1 + resTo2;
                    System.out.println(arabicToRoman(res));
                    break;
                case "-":
                    res = resTo1 - resTo2;
                    System.out.println(arabicToRoman(res));
                    break;
                case "*":
                    res = resTo1 * resTo2;
                    System.out.println(arabicToRoman(res));
                    break;
                case "/":
                    res = resTo1 / resTo2;
                    System.out.println(arabicToRoman(res));
                    break;
                default:
                    System.out.println("Неверное введен знак");

            }
        } else switch (sign) {
            case "+":
                res = resTo1 + resTo2;
                System.out.println(res);
                break;
            case "-":
                res = resTo1 - resTo2;
                System.out.println(res);
                break;
            case "*":
                res = resTo1 * resTo2;
                System.out.println(res);
                break;
            case "/":
                res = resTo1 / resTo2;
                System.out.println(res);
                break;
            default:
                System.out.println("Неверное введен знак");

        }

    }
}
