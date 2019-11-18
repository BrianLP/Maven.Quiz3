package rocks.zipcode.io.quiz3.fundamentals;

/**
 * @author leon on 09/12/2018.
 */
public class VowelUtils {
    public static Boolean hasVowels(String word) {
        Boolean checker = false;
        String word2=word.toUpperCase();
        for (int i = 0; i < word2.length() ; i++) {
            if (word2.charAt(i)=='A'||word2.charAt(i)=='E' ||word2.charAt(i)=='I'||word2.charAt(i)=='O'||word2.charAt(i)=='U') {
                checker=true;
            }
        }
        return checker;
    }


    public static Integer getIndexOfFirstVowel(String word) {
        Integer here = -1;
        String word2=word.toUpperCase();
        for (int i = 0; i < word2.length() ; i++) {
            if (word2.charAt(i)=='A'||word2.charAt(i)=='E' ||word2.charAt(i)=='I'||word2.charAt(i)=='O'||word2.charAt(i)=='U') {
                here = i;
                break;
            }

        }
        return here;
    }


    public static Boolean startsWithVowel(String word) {
        if (word.charAt(0) == ('A') || word.charAt(0) == ('E') || word.charAt(0) == ('I') || word.charAt(0) == ('O') || word.charAt(0) == ('U')) {
            return true;
        }
        return false;
    }


    public static Boolean isVowel(Character character) {
        if (Character.toUpperCase(character) == ('A') || Character.toUpperCase(character)== ('E') || Character.toUpperCase(character) == ('I') || Character.toUpperCase(character) == ('O') || Character.toUpperCase(character) == ('U')) {
            return true;
        }
        return false;
    }
}
