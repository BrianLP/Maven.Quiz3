package rocks.zipcode.io.quiz3.fundamentals;

import java.util.Arrays;

/**
 * @author leon on 09/12/2018.
 */
public class PigLatinGenerator {
    public String translate(String str) {
        String newStr = "";
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (VowelUtils.startsWithVowel(words[i])) {
                newStr += words[i] + "way ";

            } else if (!VowelUtils.startsWithVowel(words[i])) {
                if (VowelUtils.hasVowels(words[i])) {
                    newStr += words[i].substring(VowelUtils.getIndexOfFirstVowel(words[i])) + words[i].substring(0, VowelUtils.getIndexOfFirstVowel(words[i])) + "ay ";
                } else newStr = words[i].substring(1) + words[i].substring(0, 1) + "ay";
            }

        }
        return newStr.trim();
    }
}



