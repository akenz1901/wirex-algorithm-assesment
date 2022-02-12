package assessment;

import java.util.Arrays;

public class IntegerArrayReverser {

    public static void main(String... args){
        int [] numbers = {1,3,6,7,8,10};
        System.out.println(Arrays.toString(reverseNumbers(numbers)));
    }

    public static int[] reverseNumbers(int... numbers){
        int[] num = new int[numbers.length];
        int temCounter = 0;

        for(int i = numbers.length-1; i >= 0; i--) {
            num[temCounter++] = numbers[i];
        }
        return num;
    }
}
