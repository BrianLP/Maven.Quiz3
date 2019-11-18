package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        String[] strArray = new String[str.length()];
        for (int i = 0; i < str.length(); i++) {

            String str2= str.toLowerCase();
            if (str2.charAt(i)=='_'||str2.charAt(i)==' '){
                str2+=str2.charAt(i);
            }
            String placeIt = str2.substring(i,1).toUpperCase();
            str2+=",\n";
            strArray[i]=str2;


        }
        return strArray;
    }
}
