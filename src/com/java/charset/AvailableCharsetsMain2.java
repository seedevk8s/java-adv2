package com.java.charset;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.SortedMap;

public class AvailableCharsetsMain2 {
    public static void main(String[] args) {
        SortedMap<String, Charset> charsetSortedMap = Charset.availableCharsets();
        for (String charsetName : charsetSortedMap.keySet()) {
            System.out.println("charsetName = " + charsetName);
        }

        System.out.println(("====================================="));
        System.out.println("charset1 = " + Charset.forName("MS949"));

        System.out.println(("=================위 별칭 조회===================="));
        Charset charset = Charset.forName("MS949");
        for (String alias : charset.aliases()) {
            System.out.println("alias = " + alias);
        }

        System.out.println(("=================별칭 조회2===================="));
        Charset charset2 = Charset.forName("EUC-KR");
        for (String alias : charset2.aliases()) {
            System.out.println("alias = " + alias);
        }

        System.out.println(("=================별칭 조회3===================="));
        Charset standardCharsets = StandardCharsets.UTF_8;
        for (String alias : standardCharsets.aliases()) {
            System.out.println("alias = " + alias);
        }
    }
}
