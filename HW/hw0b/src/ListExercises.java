import java.util.ArrayList;
import java.util.List;

public class ListExercises {

    /** Returns the total sum in a list of integers */
    public static int sum(List<Integer> L) {
        // TODO: Fill in this function.
        int sum = 0;
        //使用增强型循环来访问所有元素
        for (int i : L){
            sum += i;
        }
        return sum;
    }

    /** Returns a list containing the even numbers of the given list */
    public static List<Integer> evens(List<Integer> L) {
        // TODO: Fill in this function.
        //新建列表
        List<Integer> EventList = new ArrayList<>();
        for (int i : L){
            if (i % 2 == 0){
                EventList.add(i);
            }
        }
        return EventList;
    }

    /** Returns a list containing the common item of the two given lists */
    public static List<Integer> common(List<Integer> L1, List<Integer> L2) {
        // TODO: Fill in this function.
        //使用双重循环，线性查阅两个列表
        List<Integer> L3 = new ArrayList<>();
        for (int i : L1){
            for (int j : L2){
                if (i == j){
                    L3.add(j);
                }
            }
        }
        return L3;
    }


    /** Returns the number of occurrences of the given character in a list of strings. */
    public static int countOccurrencesOfC(List<String> words, char c) {
        // TODO: Fill in this function.
        int times = 0;//出现次数

        for (String word : words){
            //将字符串视为数组
            for (int i = 0; i < word.length(); i++){
                if (word.charAt(i) == c){
                    times++;
                }
            }
        }
        return  times;
    }
}
