package com.techreturners.romanNumeralsConversion;

import java.util.ArrayList;
import java.util.ArrayList.*;
import java.util.Arrays;
import java.util.Arrays.*;

public class NumberToRomanNumeralConverter {

    private ArrayList <String> romanNumeralList = new ArrayList<String>(
                                        Arrays.asList("M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"));
    private ArrayList <Integer> numberList = new ArrayList<Integer>(
                                        Arrays.asList(1000,900,500,400,100,90,50,40,10,9,5,4,1));

    public String convertNumberToRomanNumerals(int aNumber) {
        int index = numberList.indexOf(aNumber);
        String romanNumeral = "";
        int numberToBeConvert = aNumber;
        for (int i=0; i<romanNumeralList.size(); i++)
            while(numberToBeConvert >= numberList.get(i)){
                numberToBeConvert -= numberList.get(i);
                romanNumeral += romanNumeralList.get(i);

            }
        return romanNumeral;
    }
}
