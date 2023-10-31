package PiJExercises;

import java.util.Arrays;

public class DayFive02 {
    public static void main(String[] args){

        int [] array1 = {1,2,3,3,2,1};
        int [] array2 = {5,6,7};

        ArrayChecker arr = new ArrayChecker();

        boolean r1 = arr.isSymmetrical(array1);
        System.out.println(r1);

        int [] arrNew = arr.reverse(array2);
        System.out.println(Arrays.toString(arrNew));

        int[] arr01 = {1,2,3,4,5};
        int[] arr02 = new int[8];

        ArrayCopier arrCopy = new ArrayCopier();

        System.out.println(Arrays.toString(arrCopy.copy(arr01,arr02)));


    }
}


class ArrayChecker{
    boolean isSymmetrical(int[] array ) {
        boolean b = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == array[array.length - i - 1]);{
                b = true;
            }


        }
        return b;
    }

    int[] reverse (int[] array){
        int[] newArr = new int[array.length];
        for (int i = 0;i<array.length;i++ ){
            newArr[i] = array[array.length-i-1];
        }
        return newArr;
    }


}

class ArrayCopier{

    int[] copy (int[]src, int[]dst) {
        if (src.length < dst.length){
            for (int i = 0;i<src.length;i++ ){
                dst[i] = src[i];
                for (int j = src.length; j < dst.length- src.length; j++) {
                    dst[i] = 0;
                }
            }
        } else  {
            for ( int i = 0;i<dst.length;i++ ){
                dst[i] = src[i];
            }
        }
        return dst;
    }
}