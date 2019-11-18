package rocks.zipcode.io.quiz3.fundamentals;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        String str1 = str.substring(0, indexToCapitalize - 1);
        String str2 = str.substring(indexToCapitalize).toUpperCase();
        String str3 = str.substring(indexToCapitalize + 1, str.length() - (indexToCapitalize + 1));
        String almost = str1.concat(str2);
        return almost.concat(str3);
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString)==characterToCheckFor;

    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++)
                result.add(string.substring(i, j));

        }
        return result.toArray(new String[result.size()]);
    }

    public static Integer getNumberOfSubStrings(String input) {
        Integer count = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                count++;
                System.out.println(input.substring(i, j));

            }

        }
        return count;

    }
}

