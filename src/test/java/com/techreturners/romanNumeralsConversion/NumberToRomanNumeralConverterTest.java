package com.techreturners.romanNumeralsConversion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberToRomanNumeralConverterTest {

    private NumberToRomanNumeralConverter converter = new NumberToRomanNumeralConverter();

    //list all basic numberals
    @Test
    public void checkBasicNumberalsTest(){
        assertEquals("M", converter.convertNumberToRomanNumerals(1000));
        assertEquals("D", converter.convertNumberToRomanNumerals(500));
        assertEquals("C", converter.convertNumberToRomanNumerals(100));
        assertEquals("L", converter.convertNumberToRomanNumerals(50));
        assertEquals("X", converter.convertNumberToRomanNumerals(10));
        assertEquals("V", converter.convertNumberToRomanNumerals(5));
        assertEquals("I", converter.convertNumberToRomanNumerals(1));
    }

    @Test
    public void checkSpecialNumberalsTest(){
        assertEquals("CM", converter.convertNumberToRomanNumerals(900));
        assertEquals("CD", converter.convertNumberToRomanNumerals(400));
        assertEquals("XC", converter.convertNumberToRomanNumerals(90));
        assertEquals("XL", converter.convertNumberToRomanNumerals(40));
        assertEquals("IX", converter.convertNumberToRomanNumerals(9));
        assertEquals("IV", converter.convertNumberToRomanNumerals(4));
    }

    @Test     // test one to Nine
    public void checkOneToNineTest(){
        assertEquals("I", converter.convertNumberToRomanNumerals(1));
        assertEquals("II", converter.convertNumberToRomanNumerals(2));
        assertEquals("III", converter.convertNumberToRomanNumerals(3));
        assertEquals("IV", converter.convertNumberToRomanNumerals(4));
        assertEquals("V", converter.convertNumberToRomanNumerals(5));
        assertEquals("VI", converter.convertNumberToRomanNumerals(6));
        assertEquals("VII", converter.convertNumberToRomanNumerals(7));
        assertEquals("VIII", converter.convertNumberToRomanNumerals(8));
        assertEquals("IX", converter.convertNumberToRomanNumerals(9));
    };

    @Test     // test two digit
    public void checkTwoDigitTest(){
        assertEquals("XI", converter.convertNumberToRomanNumerals(11));
        assertEquals("XXIV", converter.convertNumberToRomanNumerals(24));
        assertEquals("XXXVI", converter.convertNumberToRomanNumerals(36));
        assertEquals("XLVII", converter.convertNumberToRomanNumerals(47));
        assertEquals("LVIII", converter.convertNumberToRomanNumerals(58));
        assertEquals("LXIII", converter.convertNumberToRomanNumerals(63));
        assertEquals("LXXIX", converter.convertNumberToRomanNumerals(79));
        assertEquals("LXXXVIII", converter.convertNumberToRomanNumerals(88));
        assertEquals("XCIX", converter.convertNumberToRomanNumerals(99));
    }

    @Test     // test three digit
    public void checkThreeDigitTest(){
        assertEquals("CI", converter.convertNumberToRomanNumerals(101));
        assertEquals("CCXXXIV", converter.convertNumberToRomanNumerals(234));
        assertEquals("CCCXLVI", converter.convertNumberToRomanNumerals(346));
        assertEquals("CDLXVII", converter.convertNumberToRomanNumerals(467));
        assertEquals("DLXXXVIII", converter.convertNumberToRomanNumerals(588));
        assertEquals("DCXIII", converter.convertNumberToRomanNumerals(613));
        assertEquals("DCCXXIX", converter.convertNumberToRomanNumerals(729));
        assertEquals("DCCCLXXXVIII", converter.convertNumberToRomanNumerals(888));
        assertEquals("CMXCIX", converter.convertNumberToRomanNumerals(999));
    }

    @Test     // test Four digit
    public void checkFourDigitTest(){
        assertEquals("MI", converter.convertNumberToRomanNumerals(1001));
        assertEquals("MMCCXXXIV", converter.convertNumberToRomanNumerals(2234));
        assertEquals("MMMCCCXLVI", converter.convertNumberToRomanNumerals(3346));
        assertEquals("MMMCMXCIX", converter.convertNumberToRomanNumerals(3999));
    }

}
