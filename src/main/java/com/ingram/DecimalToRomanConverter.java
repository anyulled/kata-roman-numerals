package com.ingram;

public class DecimalToRomanConverter {

    public static String toRoman(int decimal) {
        StringBuilder roman = new StringBuilder();

        for (RomanToDecimal romanToDecimal : RomanToDecimal.values()) {
            while (decimal >= romanToDecimal.decimal) {
                roman.append(romanToDecimal.roman);
                decimal -= romanToDecimal.decimal;
            }
        }

        roman.append("I".repeat(Math.max(0, decimal)));
        return roman.toString();
    }

    enum RomanToDecimal {
        THOUSAND(1000,"M"),
        NINE_HUNDRED(900,"CM"),
        FIVE_HUNDRED(500,"D"),
        FOUR_HUNDRED(400,"XD"),
        HUNDRED(100,"C"),
        NINETY(90,"XC"),
        FIFTY(50, "L"),
        FORTY(40, "XL"),
        TEN(10, "X"),
        NINE(9, "IX"),
        FIVE(5, "V"),
        FOUR(4, "IV"),
        ONE(1, "I");

        private final int decimal;
        private final String roman;

        RomanToDecimal(int decimal, String roman) {

            this.decimal = decimal;
            this.roman = roman;
        }
    }
}
