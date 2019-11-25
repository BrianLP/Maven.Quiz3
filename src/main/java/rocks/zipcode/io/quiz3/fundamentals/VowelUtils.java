package rocks.zipcode.io.quiz3.fundamentals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        char[] wordArr = word.toCharArray();
        for (Character c : wordArr) {
            if (isVowel(c) == true) {
                return true;


            }

        }
        return false;
    }

    public static Integer getIndexOfFirstVowel(String word) {
        int count = 0;

        Pattern p = Pattern.compile("[aeiou]",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(word);
        if(m.find()){
            return  m.start();
        }
        /*char[] wordArr = word.toCharArray();
        for (Character c : wordArr) {
            if (isVowel(c) == true) {
                return -1;

            } else if (isVowel(c)) {
                break;
            }
            count++;
        }*/
     return -1;
    }


    public static Boolean startsWithVowel(String word) {

        Pattern p = Pattern.compile("^[aeiou]",Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(word);
        return m.find();
        }


    public static Boolean isVowel(Character character) {
        if (Character.toUpperCase(character) == ('A') || Character.toUpperCase(character) == ('E') || Character.toUpperCase(character) == ('I') || Character.toUpperCase(character) == ('O') || Character.toUpperCase(character) == ('U')) {
            return true;
        }
        return false;
    }
}
