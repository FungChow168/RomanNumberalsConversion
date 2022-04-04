package com.techreturners.romanNumeralsConversion;

import java.util.*;


public class RomanToNumeralsConverter {

    private Dictionary <Character, Integer> conversionTable = new Hashtable <Character, Integer>(){{put('I', 1);
        put('V', 5);
        put('X', 10);
        put('L', 50);
        put('C', 100);
        put('D', 500);
        put('M', 1000);
    }};

    public RomanToNumeralsConverter() {
    }

    public int convertRomanNumeralToNumber(String romanNumeral){
        int previousValue = 0;
        int currentValue = 0;
        int total = 0;
        for (int i = romanNumeral.length() -1; i >= 0; i--) {
            currentValue = conversionTable.get(romanNumeral.charAt(i));
            if (currentValue >= previousValue)
                total += currentValue;
            else
                total -= currentValue;
            previousValue = currentValue;
        }
        return total;
    }

//    public void conversionConsole (){
//        Scanner userInput = new Scanner(System.in);
//        System.out.print("Please input a roman numeral in the range of 1 to 3999 : ");
//        String romanNumeral = userInput.nextLine();
//        System.out.println(convertRomanNumeralToNumber(romanNumeral));
//
//    }

}