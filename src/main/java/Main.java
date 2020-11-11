import wordProcess.WordProcess;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ZeBr on 10.11.2020.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> myString = new ArrayList<>(Arrays.asList("абв", "абвгд", "абжгд", "абвкс"));
        WordProcess wordList = new WordProcess(myString);

        System.out.println(wordList.getPrefixClassic());
    }
}
