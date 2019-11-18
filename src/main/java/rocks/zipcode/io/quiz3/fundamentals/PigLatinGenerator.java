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
                words[i] = (str + "way");
            } else if (!VowelUtils.startsWithVowel(words[i])) {
                words[i] = str.substring(1) + str.substring(0, 1) + "ay";
            }
            }
        for (int i = 0; i <words.length; i++) {
            newStr+=words[1];
        }
        return newStr;
        }
    }
