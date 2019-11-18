package rocks.zipcode.io.quiz3.arrays;

/**
 * @author leon on 09/12/2018.
 */
public class WaveGenerator {
    public static String[] wave(String str) {
        int placeholder=0;
        String[] strArray = new String[str.length()];
        for (int i = 0; i < strArray.length; i++) {

            String str2 = str.toLowerCase();
            if (str2.charAt(i)=='_'||str2.charAt(i)==' ') {
                placeholder++;
            }else{
            }String placeIt = str2.substring(0,i-1)+str2.substring(i,1).toUpperCase()+str2.substring(i+1)+",\n";
            strArray[i]=placeIt;


        }
        return strArray;
    }
}
