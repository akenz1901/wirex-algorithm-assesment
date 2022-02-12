package assessment;

import assessment.Exceptions.InvalidOrderException;

import java.util.Arrays;

public class SumOfTarget {

    public static void main(String[] args){

        int[] numOfArray = {4, 64, 6, 12, 2, 7, 9, 8};
        int target = 76;
        System.out.println(getTarget(numOfArray, target));

    }

    public static String getTarget(int[] arrayTray,int target){
        validateArrayLength(arrayTray.length);
        validateTarget(target);

        int[] temTray = new int[2];
        int temTarget;
        int j = 1;


        for(int num:arrayTray){
            for(int i = 0; i < arrayTray.length; i++) {
                temTarget = num + arrayTray[i];
                if(temTarget == target)
                    temTray = new int[]{j, i};
            }
            j++;
        }

        return String.format("Because index %d + %d we return %s",temTray[0], temTray[1], Arrays.toString(temTray));
    }

    private static void validateElement(int index) {
        boolean itIsLegal = -109 <= index & index <= 109;
        if(!itIsLegal)
            throw new InvalidOrderException("Element in array cannot be less than negative 109 and cannot be less than positive 109 ");
    }

    private static void validateArrayLength(int length){
        boolean itIsOkay = 2 <= length & length <= 104;
        if(!itIsOkay)
            throw new InvalidOrderException();
    }
    private static void validateTarget(int target){
        boolean itIsCorrect = -109 <= target & target <= 109;
        if(!itIsCorrect){
            throw new InvalidOrderException("Your cannot be less than negative 109 and cannot be less than positive 109");
        }
    }
}
