package com.java.charset;

import java.nio.charset.Charset;

public class AvailableCharsetsMain {
    public static void main(String[] args) {
        Charset.availableCharsets().forEach((k, v) -> {
            System.out.println(k + " : " + v);
        });
    }
}
