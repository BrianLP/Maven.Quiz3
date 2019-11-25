package rocks.zipcode.io.quiz3.arrays;

import rocks.zipcode.io.quiz3.fundamentals.StringUtils;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {

    public static String[] wave(String str) {
        ArrayList <String> wavey = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isAlphabetic(str.charAt(i))) {
                wavey.add(StringUtils.capitalizeNthCharacter(str.toLowerCase(), i));
            }

        }
        return wavey.toArray(new String[0]);
    }
}

