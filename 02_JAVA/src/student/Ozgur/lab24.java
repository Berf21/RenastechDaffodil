package student.Ozgur;

import java.util.ArrayList;
import java.util.Arrays;

public class lab24 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,40,50,100,24,55,16,150,160,25,25,24,25));
        ArrayList<Integer> removed = new ArrayList<>();
        for (int each : numbers){
            if (each < 100){
                removed.addAll(Arrays.asList(each));
            }
        }
        System.out.println("removed = " + removed);

    }



}
