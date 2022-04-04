package com.techreturners.romanNumeralsConversion;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RomanToNumberConverterTest {

    private RomanToNumeralsConverter converter = new RomanToNumeralsConverter();

    @Test     // test the basic I, V, X, L, C, D, M
    public void checkTheBasicTest(){
        assertEquals(1, converter.convertRomanNumeralToNumber("I"));
        assertEquals(5, converter.convertRomanNumeralToNumber("V"));
        assertEquals(10, converter.convertRomanNumeralToNumber("X"));
        assertEquals(50, converter.convertRomanNumeralToNumber("L"));
        assertEquals(100, converter.convertRomanNumeralToNumber("C"));
        assertEquals(500, converter.convertRomanNumeralToNumber("D"));
        assertEquals(1000, converter.convertRomanNumeralToNumber("M"));
    }

    @Test     // test one to ten
    public void checkOneToTenTest(){
        assertEquals(1, converter.convertRomanNumeralToNumber("I"));
        assertEquals(2, converter.convertRomanNumeralToNumber("II"));
        assertEquals(3, converter.convertRomanNumeralToNumber("III"));
        assertEquals(4, converter.convertRomanNumeralToNumber("IV"));
        assertEquals(5, converter.convertRomanNumeralToNumber("V"));
        assertEquals(6, converter.convertRomanNumeralToNumber("VI"));
        assertEquals(7, converter.convertRomanNumeralToNumber("VII"));
        assertEquals(8, converter.convertRomanNumeralToNumber("VIII"));
        assertEquals(9, converter.convertRomanNumeralToNumber("IX"));
        assertEquals(10, converter.convertRomanNumeralToNumber("X"));
    }

    @Test   // test two digit
    public void checkTwoDigitTest(){
        assertEquals(10, converter.convertRomanNumeralToNumber("X"));
        assertEquals(11, converter.convertRomanNumeralToNumber("XI"));
        assertEquals(12, converter.convertRomanNumeralToNumber("XII"));
        assertEquals(13, converter.convertRomanNumeralToNumber("XIII"));
        assertEquals(14, converter.convertRomanNumeralToNumber("XIV"));
        assertEquals(15, converter.convertRomanNumeralToNumber("XV"));
        assertEquals(16, converter.convertRomanNumeralToNumber("XVI"));
        assertEquals(17, converter.convertRomanNumeralToNumber("XVII"));
        assertEquals(18, converter.convertRomanNumeralToNumber("XVIII"));
        assertEquals(19, converter.convertRomanNumeralToNumber("XIX"));
        assertEquals(20, converter.convertRomanNumeralToNumber("XX"));
        assertEquals(44, converter.convertRomanNumeralToNumber("XLIV"));
        assertEquals(55, converter.convertRomanNumeralToNumber("LV"));
        assertEquals(66, converter.convertRomanNumeralToNumber("LXVI"));
        assertEquals(99, converter.convertRomanNumeralToNumber("XCIX"));
    }

    @Test   // test three digit
    public void checkThreeDigitTest(){
        assertEquals(100, converter.convertRomanNumeralToNumber("C"));
        assertEquals(101, converter.convertRomanNumeralToNumber("CI"));
        assertEquals(126, converter.convertRomanNumeralToNumber("CXXVI"));
        assertEquals(478, converter.convertRomanNumeralToNumber("CDLXXVIII"));
        assertEquals(519, converter.convertRomanNumeralToNumber("DXIX"));
        assertEquals(620, converter.convertRomanNumeralToNumber("DCXX"));
        assertEquals(999, converter.convertRomanNumeralToNumber("CMXCIX"));
    }

    @Test   // test three digit
    public void checkFourDigitTest(){
        assertEquals(1001, converter.convertRomanNumeralToNumber("MI"));
        assertEquals(1976, converter.convertRomanNumeralToNumber("MCMLXXVI"));
        assertEquals(2423, converter.convertRomanNumeralToNumber("MMCDXXIII"));
        assertEquals(3519, converter.convertRomanNumeralToNumber("MMMDXIX"));
        assertEquals(3999, converter.convertRomanNumeralToNumber("MMMCMXCIX"));
    }

}
