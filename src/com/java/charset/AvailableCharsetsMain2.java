package com.java.charset;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class AvailableCharsetsMain2 {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsetSortedMap = Charset.availableCharsets();
        for (String charsetName : charsetSortedMap.keySet()) {
            System.out.println("charsetName = " + charsetName);
        }
    }
}
