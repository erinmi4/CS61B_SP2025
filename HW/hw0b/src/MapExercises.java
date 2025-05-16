import edu.princeton.cs.algs4.In;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExercises {
    /** Returns a map from every lower case letter to the number corresponding to that letter, where 'a' is
     * 1, 'b' is 2, 'c' is 3, ..., 'z' is 26.
     */
    public static Map<Character, Integer> letterToNum() {
        // TODO: Fill in this function.
        //新建一个map
        Map<Character,Integer> letterToNum = new HashMap<>();
        char letter = 'a';
        int num = 1;
        while (letter <= 'z'){
            letterToNum.put(letter,num);
            letter++;
            num++;
        }
        return  letterToNum;
    }

    /** Returns a map from the integers in the list to their squares. For example, if the input list
     *  is [1, 3, 6, 7], the returned map goes from 1 to 1, 3 to 9, 6 to 36, and 7 to 49.
     */
    public static Map<Integer, Integer> squares(List<Integer> nums) {
        // TODO: Fill in this function.
        Map<Integer, Integer> square = new HashMap<>();
        for (int i : nums){
            square.put(i,i * i);
        }
        return square;
    }

    /** Returns a map of the counts of all words that appear in a list of words. */
    public static Map<String, Integer> countWords(List<String> words) {
        // TODO: Fill in this function.
        Map<String, Integer> countWords = new HashMap<>();
        for (String i : words){
            if (countWords.containsKey(i)){
                //如果map中已经有了，直接次数 + 1
                countWords.put(i,countWords.get(i) + 1);
                continue;
            }
            //否则加入
            countWords.put(i,1);
        }
        return countWords;
    }
}
