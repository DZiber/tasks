import wordProcess.WordProcess;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by ZeBr on 10.11.2020.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> myString = new ArrayList<>(Arrays.asList("абв", "абвгд", "абвжгд", "абвкс"));
        WordProcess wordList = new WordProcess(myString);

        wordList.getPrefixOnStreams();


        System.out.println(wordList.getPrefixOnStreams());
    }
}
