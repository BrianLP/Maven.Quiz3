package rocks.zipcode.io.quiz3.fundamentals;

import com.sun.xml.internal.fastinfoset.util.StringArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
               String answer = "";
        for (int i = 0; i < str.length() ; i++) {
            if(i != indexToCapitalize){
                answer+= str.charAt(i)+"";

         }else{
                answer+=(str.charAt(i)+"").toUpperCase();
            }
        }
        return answer;




    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        return baseString.charAt(indexOfString) == characterToCheckFor;

    }

    public static String[] getAllSubStrings(String string) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < string.length(); i++) {
            for (int j = i + 1; j <= string.length(); j++) {
                if (!result.contains(string.substring(i, j))) {
                    result.add(string.substring(i, j));

                }


            }
        }
        return result.toArray(new String[0]);
    }

    public static Integer getNumberOfSubStrings(String input) {
        Integer count = 0;
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                if (!result.contains(input.substring(i, j))) {
                    result.add(input.substring(i, j));
                    count++;

                }

            }


        }
        return count;
    }
}

