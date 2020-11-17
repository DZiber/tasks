package wordProcess;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by ZeBr on 10.11.2020.
 */
public class WordProcess {

    private List<String> myString = new ArrayList<String>();

    public WordProcess(ArrayList<String> myString) {
        this.myString = myString;
    }

    private ArrayList<String> getSorted(Boolean isNaturalOrder) {
        ArrayList<String> list = new ArrayList<String>(this.myString);
        if (isNaturalOrder) {
            list.sort(Comparator.naturalOrder());
        } else {
            list.sort(Comparator.reverseOrder());
        }
        return list;
    }

    public String getPrefixClassic() {
        String result = "";
        ArrayList<String> sortedList = getSorted(true);

        for (int i = 0; i < sortedList.get(0).length(); i++) {
            char ch = sortedList.get(0).charAt(i);
            int count = 0;
            for (int j = 0; j < sortedList.size(); j++) {
                if (sortedList.get(j).indexOf(ch) == i) {
                    count++;
                }
            }
            if (count == sortedList.size()) {
                result += ch;
            }
        }

        if (result.length() == 0) {
            result = "Нет совпадающих символов";
        }
        return result;
    }

    public String getPrefixOnStreams() {
        String result = "";
        List<String> sortedList = this.myString.stream().sorted().collect(Collectors.toList());

        for (int i = 0; i < sortedList.get(0).length(); i++) {
            char ch = sortedList.get(0).charAt(i);
            //без этого стрим ругается
            int j = i;
            if(sortedList.stream().allMatch((s)->s.indexOf(ch) == j)) {
                result += ch;
            }
        }
        if (result.length() == 0) {
            result = "Нет совпадающих символов";
        }
        return result;
    }
}
